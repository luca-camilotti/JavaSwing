package swing.gui.bar;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class BarManager extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldIncassoTot;
	private JTextField textFieldCopertiTot;
	private JTextField textFieldTotale;
	private JTextField textFieldTotPersona;
	private JTextField textFieldIncasso;
	
	/* STRUTTURE DATI: */
	private Table[] tavolo; // array dei tavoli
	private ArrayList<String> comande; // array list comande
	
	
	private Comanda cmd;  // comanda in lavorazione
	private double incasso;  // incasso parziale della giornata
	private int totCoperti;  // coperti della giornata
	private boolean enable;  // = false quando si chiude la cassa
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BarManager frame = new BarManager();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	private boolean exitCheck() {
		if(!enable) {
			JOptionPane.showMessageDialog(BarManager.this,
				    "La cassa è chiusa!",
				    "Operazione bloccata!",
				    JOptionPane.ERROR_MESSAGE);					
		}
		return !enable;
	}

	/**
	 * Create the frame.
	 */
	public BarManager() {
		
		/* Data Structure Init */
		tavolo = new Table[20];
		for(int i = 0; i<tavolo.length; i++)
			tavolo[i] = new Table();
		comande = new ArrayList<String>();
		cmd = new Comanda(); // memorizza gli ordini selezionati prima di inviare la comanda
		totCoperti = 0;
		incasso = 0.0;
		enable = true;  // bar aperto
		/*** Data Structure End ****/
		
		setTitle("Demo Gestione Bar");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 590, 428);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel orderPanel = new JPanel();
		orderPanel.setBackground(new Color(255, 228, 181));
		orderPanel.setBounds(10, 11, 275, 190);
		contentPane.add(orderPanel);
		orderPanel.setLayout(null);
		
		final JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(0, 0, 10, 1));
		spinner.setBounds(217, 11, 36, 20);
		orderPanel.add(spinner);
		
		final JComboBox<String> comboBoxComanda = new JComboBox<String>();
		comboBoxComanda.setBounds(86, 11, 44, 20);
		for(int i = 0; i < 20; i++)
			comboBoxComanda.addItem(""+(i+1));
		orderPanel.add(comboBoxComanda);
		
		JButton btnCaff = new JButton("caff\u00E8");
		btnCaff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cmd.incCaffe();
			}
		});
		btnCaff.setBounds(10, 69, 79, 23);
		orderPanel.add(btnCaff);
		
		JButton btnSandwich = new JButton("sandwich");
		btnSandwich.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnSandwich.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cmd.incSandwich();
			}
		});
		btnSandwich.setBounds(99, 69, 79, 23);
		orderPanel.add(btnSandwich);
		
		JButton btnBibita = new JButton("bibita");
		btnBibita.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cmd.incBibita();
			}
		});
		btnBibita.setBounds(10, 110, 79, 23);
		orderPanel.add(btnBibita);
		
		JButton btnAcqua = new JButton("acqua");
		btnAcqua.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cmd.incWater();
			}
		});
		btnAcqua.setBounds(99, 110, 79, 23);
		orderPanel.add(btnAcqua);
		
		JButton btnSucco = new JButton("succo");
		btnSucco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cmd.incJuice();
			}
		});
		btnSucco.setBounds(188, 69, 79, 23);
		orderPanel.add(btnSucco);
		
		JButton btnAlcolico = new JButton("alcolico");
		btnAlcolico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cmd.incDrink();
			}
		});
		btnAlcolico.setBounds(188, 110, 79, 23);
		orderPanel.add(btnAlcolico);
		
		final JTextArea textArea = new JTextArea();
		
		/***********************/
		/* INVIO DELLA COMANDA */
		/***********************/
		
		JButton btnInviaComanda = new JButton("invia");
		btnInviaComanda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(exitCheck())
					return;  // return se la cassa è chiusa
				String strtavolo = (String) comboBoxComanda.getSelectedItem();
				int ncoperti = (int) spinner.getValue(); // numero di coperti per la comanda
				int ntavolo;  // numero di tavolo selezionato per la comanda
				try {
					ntavolo = Integer.parseInt(strtavolo);
				}
				catch(NumberFormatException except) {
					ntavolo = -1;
				}
				if(ntavolo < 0 || ncoperti <= 0) {
					JOptionPane.showMessageDialog(BarManager.this,
						    "Imposta il tavolo e il numero dei coperti!",
						    "Comanda non valida!",
						    JOptionPane.ERROR_MESSAGE);
				}
				else if(cmd.countAll() <= 0) {
					JOptionPane.showMessageDialog(BarManager.this,
						    "Non hai selezionato nessun prodotto!",
						    "Comanda non valida!",
						    JOptionPane.ERROR_MESSAGE);					
				}
				else if(cmd.countAll() < ncoperti) {
					JOptionPane.showMessageDialog(BarManager.this,
						    "Il numero dei prodotti selezionati è inferiore al numero dei coperti!",
						    "Comanda non valida!",
						    JOptionPane.ERROR_MESSAGE);
				}
				else {
					cmd.setTavolo(ntavolo);
					cmd.setCoperti(ncoperti);
					
					/* REGISTRAZIONE DELLA COMANDA */
					tavolo[cmd.getTavolo()].recComanda(cmd);  // registra la comanda per il tavolo corrispondente
					
					/* AGGIUNTA DELLA COMANDA ALLA TEXT AREA */
					comande.add(cmd.toString()); // aggiungi la comanda alla lista delle comande da servire
					
					/* Aggiorna la textArea con le comande */		
					textArea.append(cmd.toString()+"\n");
					cmd.reset(); // resetta la comanda per il prossimo inserimento
				}
			}
		});
		btnInviaComanda.setBounds(188, 156, 79, 23);
		orderPanel.add(btnInviaComanda);
		
		JLabel lblTavolo = new JLabel("Tavolo:");
		lblTavolo.setBounds(10, 14, 46, 14);
		orderPanel.add(lblTavolo);
		
		JLabel lblCoperti = new JLabel("coperti:");
		lblCoperti.setBounds(161, 14, 46, 14);
		orderPanel.add(lblCoperti);
		
		JButton btnReset = new JButton("reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cmd.reset();  // resetta la comanda
				JOptionPane.showMessageDialog(BarManager.this,
					    "Hai azzerato tutti i dati inseriti nella comanda",
					    "Comanda azzerata",
					    JOptionPane.WARNING_MESSAGE);
			}
		});
		btnReset.setBounds(10, 156, 79, 23);
		orderPanel.add(btnReset);
		
		JButton btnCheck = new JButton("check");
		btnCheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String strtavolo = (String) comboBoxComanda.getSelectedItem();
				int ntavolo;  // numero di tavolo selezionato per la comanda
				try {
					ntavolo = Integer.parseInt(strtavolo);
				}
				catch(NumberFormatException except) {
					ntavolo = -1;
				}
				cmd.setTavolo(ntavolo);
				JOptionPane.showMessageDialog(BarManager.this,
					    cmd.toString(),
					    "Controllo comanda",
					    JOptionPane.PLAIN_MESSAGE);
			}
		});
		btnCheck.setBounds(99, 156, 79, 23);
		orderPanel.add(btnCheck);
		
		JPanel servePanel = new JPanel();
		servePanel.setBackground(new Color(152, 251, 152));
		servePanel.setBounds(10, 212, 275, 166);
		contentPane.add(servePanel);
		servePanel.setLayout(null);
		
		
		//textArea.setBounds(10, 166, 414, 84);
		JScrollPane scroll = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);		
		scroll.setBounds(10, 11, 255, 109);
		servePanel.add(scroll);
		
		JButton btnServi = new JButton("servi");
		btnServi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(exitCheck())
					return;  // return se la cassa è chiusa
				
				if(comande.size() > 0) {
					JOptionPane.showMessageDialog(BarManager.this,
							"E' stata servita la comanda: \r\n"+comande.get(0).toString(),
							"Comanda servita!",
							JOptionPane.INFORMATION_MESSAGE);
					comande.remove(0);
					textArea.setText("");
					for(int j = 0; j < comande.size(); j++)
						textArea.append(comande.get(j)+"\n");
				}
				else {
					JOptionPane.showMessageDialog(BarManager.this,
							"Non ci sono comande da servire",
							"Impossibile servire",
							JOptionPane.WARNING_MESSAGE);					
				}
			}
		});
		btnServi.setBounds(10, 125, 255, 30);
		servePanel.add(btnServi);
		
		JPanel billPanel = new JPanel();
		billPanel.setBackground(new Color(224, 255, 255));
		billPanel.setBounds(295, 11, 269, 190);
		contentPane.add(billPanel);
		billPanel.setLayout(null);
		
		textFieldTotale = new JTextField();
		textFieldTotale.setEditable(false);
		textFieldTotale.setBounds(168, 21, 86, 20);
		billPanel.add(textFieldTotale);
		textFieldTotale.setColumns(10);
		
		textFieldTotPersona = new JTextField();
		textFieldTotPersona.setEditable(false);
		textFieldTotPersona.setBounds(168, 101, 86, 20);
		billPanel.add(textFieldTotPersona);
		textFieldTotPersona.setColumns(10);
		
		textFieldIncasso = new JTextField();
		textFieldIncasso.setEditable(false);
		textFieldIncasso.setBounds(168, 145, 86, 20);
		billPanel.add(textFieldIncasso);
		textFieldIncasso.setColumns(10);
		
		final JComboBox<String> comboBoxTavolo = new JComboBox<String>();
		comboBoxTavolo.setBounds(10, 21, 51, 20);
		for(int i = 0; i < 20; i++)
			comboBoxTavolo.addItem(""+(i+1));
		billPanel.add(comboBoxTavolo);
		
		/***********************/
		/*    TOTALE TAVOLO    */
		/***********************/
		JButton btnTotale = new JButton("<html>Totale <br />tavolo</html>");
		btnTotale.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(exitCheck())
					return;  // return se la cassa è chiusa
				
				String strtavolo = (String) comboBoxTavolo.getSelectedItem();				
				int ntavolo;  // numero di tavolo selezionato per il conto
				try {
					ntavolo = Integer.parseInt(strtavolo);
				}
				catch(NumberFormatException except) {
					ntavolo = -1;
				}
				if(ntavolo < 0) {
					JOptionPane.showMessageDialog(BarManager.this,
						    "Imposta prima il numero del tavolo!",
						    "Impossibile calcolare il conto!",
						    JOptionPane.ERROR_MESSAGE);
				}
				else if(tavolo[ntavolo].getCoperti() <= 0) {
					JOptionPane.showMessageDialog(BarManager.this,
						    "Nulla da pagare al tavolo "+ntavolo,
						    "Impossibile calcolare il conto!",
						    JOptionPane.WARNING_MESSAGE);
				}
				else {
					/* VISUALIZZO IL TOTALE TAVOLO E IL TOTALE A PERSONA */
					textFieldTotale.setText(tavolo[ntavolo].totale()+" €");
					textFieldTotPersona.setText(String.format("%.2f", tavolo[ntavolo].totalePersona())+" €");
					
					/* INCREMENTO L'INCASSO DELLA GIORNATA  */
					incasso += tavolo[ntavolo].totale();
					textFieldIncasso.setText(incasso+" €");
					
					/* INCREMENTO I COPERTI DELLA GIORNATA  */
					totCoperti += tavolo[ntavolo].getCoperti();
					
					/* RESET DEL TAVOLO (SIMULO CHE IL CLIENTE PAGHI ED ESCA) */
					tavolo[ntavolo].reset();					
				}
			}
		});
		btnTotale.setToolTipText("click to show the bill");
		btnTotale.setBounds(79, 21, 73, 53);
		billPanel.add(btnTotale);
		
		
		
		JLabel lblTotaleAPersona = new JLabel("Totale a persona:");
		lblTotaleAPersona.setBounds(51, 104, 101, 14);
		billPanel.add(lblTotaleAPersona);
		
		JLabel lblIncassoGiornata = new JLabel("Incasso giornata:");
		lblIncassoGiornata.setBounds(51, 148, 101, 14);
		billPanel.add(lblIncassoGiornata);		
		
		JPanel closePanel = new JPanel();
		closePanel.setBackground(new Color(211, 211, 211));
		closePanel.setBounds(295, 212, 269, 166);
		contentPane.add(closePanel);
		closePanel.setLayout(null);
		
		/***********************/
		/*    CHIUSURA CASSA   */
		/***********************/
		JButton btnChiudiCassa = new JButton("<html>Chiudi <br />\r\nCassa</html>");
		btnChiudiCassa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(exitCheck())
					return;  // return se la cassa è chiusa
				
				/* IMPEDISCO ULTERIORI OPERAZIONI */
				enable = false;
				
				textFieldIncassoTot.setText(incasso+" €");
				textFieldCopertiTot.setText(totCoperti+"");
				JOptionPane.showMessageDialog(BarManager.this,
					    "Nessun'altra operazione sarà possibile",
					    "Chiusura cassa",
					    JOptionPane.WARNING_MESSAGE);
			}
		});
		btnChiudiCassa.setBounds(82, 11, 98, 55);
		closePanel.add(btnChiudiCassa);
		
		JLabel lblIncassoTotale = new JLabel("Incasso totale:");
		lblIncassoTotale.setBounds(48, 80, 83, 14);
		closePanel.add(lblIncassoTotale);
		
		JLabel lblTotaleCoperti = new JLabel("Totale coperti:");
		lblTotaleCoperti.setBounds(48, 122, 83, 14);
		closePanel.add(lblTotaleCoperti);
		
		textFieldIncassoTot = new JTextField();
		textFieldIncassoTot.setEditable(false);
		textFieldIncassoTot.setBounds(154, 77, 86, 20);
		closePanel.add(textFieldIncassoTot);
		textFieldIncassoTot.setColumns(10);
		
		textFieldCopertiTot = new JTextField();
		textFieldCopertiTot.setEditable(false);
		textFieldCopertiTot.setBounds(154, 119, 86, 20);
		closePanel.add(textFieldCopertiTot);
		textFieldCopertiTot.setColumns(10);
	}
}
