package swing.gui.correzione;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JScrollBar;
import javax.swing.JTextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.SpinnerNumberModel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

//ZANELLA

public class GestioneBar extends JFrame {

	private JPanel contentPane;
	
	//PULSANTI
	public double caffe=0;
	public int sandwich=0;
	public int succo=0;
	public int bibita=0;
	public int acqua=0;
	public int alcolico=0;
	public int reset=0;
	public int check=0;
	public int invia=0;
	
	//CONTATORI E VARIABILI
	public int i=0;
	public int dim=0;
	public int cont=0;
	public int a=0;
	public int num=0;
	public double somma=0;
	public int riserva_caffe=0;
	public int riserva_sandwich=0;
	public int riserva_succo=0;
	public int riserva_bibita=0;
	public int riserva_acqua=0;
	public int riserva_alcolico=0;
	public int cont_caffe=0;
	public int cont_sandwich=0;
	public int cont_succo=0;
	public int cont_bibita=0;
	public int cont_acqua=0;
	public int cont_alcolico=0;
	public double incasso=0;
	public double pers=0;
	public double quant=0;
	public int tot;
	public int spin=0;
	public int clic=0;
	public int posti=0;
	public int c=0;
	public int d=0;
	public int nt=0;
	public String temp;
	public double quant1=0;
	public double quant2=0;
	public double quant3=0;
	public double quant4=0;
	public double quant5=0;
	public double quant6=0;
	public double quant7=0;
	public double quant8=0;
	public double quant9=0;
	public double quant10=0;
	public double quant11=0;
	public double quant12=0;
	public double quant13=0;
	public double quant14=0;
	public double quant15=0;
	public double quant16=0;
	public double quant17=0;
	public double quant18=0;
	public double quant19=0;
	public double quant20=0;
	public double quant1_tot=0;
	public double quant2_tot=0;
	public double quant3_tot=0;
	public double quant4_tot=0;
	public double quant5_tot=0;
	public double quant6_tot=0;
	public double quant7_tot=0;
	public double quant8_tot=0;
	public double quant9_tot=0;
	public double quant10_tot=0;
	public double quant11_tot=0;
	public double quant12_tot=0;
	public double quant13_tot=0;
	public double quant14_tot=0;
	public double quant15_tot=0;
	public double quant16_tot=0;
	public double quant17_tot=0;
	public double quant18_tot=0;
	public double quant19_tot=0;
	public double quant20_tot=0;

	//VETTORI
	public String[] vett_nome= new String[100]; //Nomi cibi
	public double[] vett_prezzo= new double[50]; //Prezzi
	public double[] vett_incasso= new double[50]; //Incasso giornata
	public int[] vett_num= new int[100]; //Numero di cibi
	public int[] vett_tavolo_unind= new int[100]; //indice iniziale
	public double[] vett_tavolo_unele= new double[100]; //elemento iniziale
	public int[] vett_tavolo_duind= new int[100]; //indice finale
	public double[] vett_tavolo_duele= new double[100]; //elemento finale
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GestioneBar frame = new GestioneBar();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GestioneBar() {
		JFrame Popup = new JFrame("Popup"); //Usato per avvisi
		setTitle("GestioneBar Zanella"); //Titolo finestra

		//COMPONENTI DI DESIGN
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 813, 503);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.ORANGE);
		panel.setBounds(0, 0, 367, 209);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tavolo");
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 12));
		lblNewLabel.setBounds(41, 10, 63, 23);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Coperti");
		lblNewLabel_1.setFont(new Font("Verdana", Font.BOLD, 12));
		lblNewLabel_1.setBounds(192, 10, 63, 23);
		panel.add(lblNewLabel_1);
		
		//ComboBox ordinazione
		JComboBox ComboBox_inizio = new JComboBox();	
		ComboBox_inizio.setBounds(102, 12, 44, 21);
		panel.add(ComboBox_inizio);
		ComboBox_inizio.addItem(1);
		ComboBox_inizio.addItem(2);
		ComboBox_inizio.addItem(3);
		ComboBox_inizio.addItem(4);
		ComboBox_inizio.addItem(5);
		ComboBox_inizio.addItem(6);
		ComboBox_inizio.addItem(7);
		ComboBox_inizio.addItem(8);
		ComboBox_inizio.addItem(9);
		ComboBox_inizio.addItem(10);
		ComboBox_inizio.addItem(12);
		ComboBox_inizio.addItem(13);
		ComboBox_inizio.addItem(14);
		ComboBox_inizio.addItem(15);
		ComboBox_inizio.addItem(16);
		ComboBox_inizio.addItem(17);
		ComboBox_inizio.addItem(18);
		ComboBox_inizio.addItem(19);
		ComboBox_inizio.addItem(20);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(1, 1, 50, 1));
		spinner.setBounds(265, 13, 50, 20);
		panel.add(spinner);
		
		//Pulsante caffe
		JButton Btn_caffe = new JButton("Caff\u00E8");
		Btn_caffe.setFont(new Font("Verdana", Font.BOLD, 12));
		Btn_caffe.setBounds(0, 65, 104, 21);
		panel.add(Btn_caffe);
		
		//Pulsante reset
		JButton Btn_reset = new JButton("Reset");
		Btn_reset.setForeground(Color.BLACK);
		Btn_reset.setBackground(Color.RED);
		Btn_reset.setFont(new Font("Verdana", Font.BOLD, 12));
		Btn_reset.setBounds(0, 158, 104, 41);
		panel.add(Btn_reset);
		
		//Pulsante bibita
		JButton Btn_bibita = new JButton("Bibita");
		Btn_bibita.setFont(new Font("Verdana", Font.BOLD, 12));
		Btn_bibita.setBounds(0, 96, 104, 21);
		panel.add(Btn_bibita);
		
		//Pulsante sandwich
		JButton Btn_sandwich = new JButton("Sandwich");
		Btn_sandwich.setFont(new Font("Verdana", Font.BOLD, 12));
		Btn_sandwich.setBounds(113, 65, 101, 21);
		panel.add(Btn_sandwich);
		
		//Pulsante acqua
		JButton Btn_acqua = new JButton("Acqua");
		Btn_acqua.setFont(new Font("Verdana", Font.BOLD, 12));
		Btn_acqua.setBounds(113, 96, 101, 21);
		panel.add(Btn_acqua);
		
		//Pulsante succo
		JButton Btn_succo = new JButton("Succo");
		Btn_succo.setFont(new Font("Verdana", Font.BOLD, 12));
		Btn_succo.setBounds(113, 127, 101, 21);
		panel.add(Btn_succo);
		
		//Pulsante alcolico
		JButton Btn_alcolico = new JButton("Alcolico");
		Btn_alcolico.setFont(new Font("Verdana", Font.BOLD, 12));
		Btn_alcolico.setBounds(0, 127, 104, 21);
		panel.add(Btn_alcolico);
		
		//Pulsante invia
		JButton Btn_invia = new JButton("Invia");
		Btn_invia.setBackground(new Color(173, 255, 47));
		Btn_invia.setForeground(Color.BLACK);
		Btn_invia.setFont(new Font("Verdana", Font.BOLD, 12));
		Btn_invia.setBounds(113, 158, 101, 41);
		panel.add(Btn_invia);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.CYAN);
		panel_1.setBounds(402, 0, 397, 209);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		//ComboBox Totale
		JComboBox ComboBox_totale = new JComboBox();
		ComboBox_totale.setBounds(41, 10, 42, 21);
		panel_1.add(ComboBox_totale);
		ComboBox_totale.addItem(1);
		ComboBox_totale.addItem(2);
		ComboBox_totale.addItem(3);
		ComboBox_totale.addItem(4);
		ComboBox_totale.addItem(5);
		ComboBox_totale.addItem(6);
		ComboBox_totale.addItem(7);
		ComboBox_totale.addItem(8);
		ComboBox_totale.addItem(9);
		ComboBox_totale.addItem(10);
		ComboBox_totale.addItem(11);
		ComboBox_totale.addItem(12);
		ComboBox_totale.addItem(13);
		ComboBox_totale.addItem(14);
		ComboBox_totale.addItem(15);
		ComboBox_totale.addItem(16);
		ComboBox_totale.addItem(17);
		ComboBox_totale.addItem(18);
		ComboBox_totale.addItem(19);
		ComboBox_totale.addItem(20);
		
		//Pulsante totale
		JButton Btn_totale = new JButton("Totale tavolo");
		Btn_totale.setFont(new Font("Verdana", Font.BOLD, 12));
		Btn_totale.setBounds(129, 10, 128, 45);
		panel_1.add(Btn_totale);
		
		JTextArea TextArea_tavolo = new JTextArea();
		TextArea_tavolo.setEditable(false);
		TextArea_tavolo.setBounds(283, 20, 85, 22);
		panel_1.add(TextArea_tavolo);
		
		JTextArea TextArea_giornata = new JTextArea();
		TextArea_giornata.setEditable(false);
		TextArea_giornata.setBounds(283, 142, 85, 22);
		panel_1.add(TextArea_giornata);
		
		JTextArea TextArea_persona = new JTextArea();
		TextArea_persona.setEditable(false);
		TextArea_persona.setBounds(283, 92, 85, 22);
		panel_1.add(TextArea_persona);
		
		JLabel lblNewLabel_2_2 = new JLabel("Totale a persona");
		lblNewLabel_2_2.setFont(new Font("Verdana", Font.BOLD, 12));
		lblNewLabel_2_2.setBounds(129, 92, 113, 16);
		panel_1.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Totale giornata");
		lblNewLabel_2_1_1.setFont(new Font("Verdana", Font.BOLD, 12));
		lblNewLabel_2_1_1.setBounds(129, 145, 113, 16);
		panel_1.add(lblNewLabel_2_1_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.GREEN);
		panel_2.setBounds(0, 247, 367, 219);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		//Pulsante servizio
		JButton Btn_servi = new JButton("Servi");
		Btn_servi.setFont(new Font("Verdana", Font.BOLD, 12));
		Btn_servi.setBounds(123, 181, 122, 28);
		panel_2.add(Btn_servi);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.LIGHT_GRAY);
		panel_3.setBounds(402, 247, 397, 219);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		//Pulsante chiudi cassa
		JButton Btn_cassa = new JButton("Chiudi Cassa");
		Btn_cassa.setBackground(Color.ORANGE);
		Btn_cassa.setFont(new Font("Verdana", Font.BOLD, 12));
		Btn_cassa.setBounds(44, 10, 150, 38);
		panel_3.add(Btn_cassa);
		
		JLabel lblNewLabel_2 = new JLabel("Incasso totale");
		lblNewLabel_2.setFont(new Font("Verdana", Font.BOLD, 12));
		lblNewLabel_2.setBounds(174, 83, 96, 16);
		panel_3.add(lblNewLabel_2);
		
		JTextArea TextArea_incasso = new JTextArea();
		TextArea_incasso.setEditable(false);
		TextArea_incasso.setBounds(280, 80, 85, 22);
		panel_3.add(TextArea_incasso);
		
		JTextArea TextArea_coperti = new JTextArea();
		TextArea_coperti.setEditable(false);
		TextArea_coperti.setBounds(280, 130, 85, 22);
		panel_3.add(TextArea_coperti);
		
		JLabel lblNewLabel_2_1 = new JLabel("Totale coperti");
		lblNewLabel_2_1.setFont(new Font("Verdana", Font.BOLD, 12));
		lblNewLabel_2_1.setBounds(174, 133, 96, 16);
		panel_3.add(lblNewLabel_2_1);
		
		JTextArea TextArea_cassa = new JTextArea();
		TextArea_cassa.setEditable(false);
		TextArea_cassa.setBounds(10, 53, 143, 156);
		panel_3.add(TextArea_cassa);
		
		//Pulsante apri cassa
		JButton Btn_apri = new JButton("Apri cassa");
		Btn_apri.setBackground(Color.ORANGE);
		Btn_apri.setFont(new Font("Verdana", Font.BOLD, 12));
		Btn_apri.setBounds(221, 10, 133, 38);
		panel_3.add(Btn_apri);
		
		//Deselezionati all'apertura del programma
		Btn_apri.setEnabled(false);
		Btn_invia.setEnabled(false);
		Btn_reset.setEnabled(false);
		
		JScrollPane scrollPane_1 = new JScrollPane(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane_1.setBounds(224, 65, 133, 134);
		panel.add(scrollPane_1);
		
		JTextArea TextArea_preview = new JTextArea();
		scrollPane_1.setViewportView(TextArea_preview);
		TextArea_preview.setEditable(false);
		Btn_servi.setEnabled(false);
		
		JScrollPane scrollPane = new JScrollPane(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(10, 10, 347, 161);
		panel_2.add(scrollPane);
		
		JTextArea TextArea_servi = new JTextArea();
		scrollPane.setViewportView(TextArea_servi);
		TextArea_servi.setEditable(false);
		
		//ELENCO PRODOTTI		
		//CAFFE
		class caffe implements ActionListener {
			public void actionPerformed(ActionEvent arg0) {
				if(TextArea_servi.getText()!="")
				{
					Btn_invia.setEnabled(true);
					Btn_reset.setEnabled(true);
				}
				caffe=caffe+1.20; //Conteggio prodotto
				cont=cont+1; //Conteggio numero totale di prodotti acquistati
				cont_caffe=cont_caffe+1; //Contatore usato per la sezione Totale
				riserva_caffe=riserva_caffe+1;
				
				for(i=cont;i<cont+1;i++)
				{
					vett_nome[i-1]= "caffe";
					TextArea_preview.append(vett_nome[i-1] + "\n");
				}
			}
		}
		caffe caf = new caffe();
		Btn_caffe.addActionListener(caf);
		
		//SANDWICH
		class sandwich implements ActionListener {
			public void actionPerformed(ActionEvent arg0) {
				if(TextArea_servi.getText()!="")
				{
					Btn_invia.setEnabled(true);
					Btn_reset.setEnabled(true);
				}
				sandwich=sandwich+2; //Conteggio prodotto
				cont=cont+1; //Conteggio numero totale di prodotti acquistati
				riserva_sandwich=riserva_sandwich+1;
				cont_sandwich=cont_sandwich+1;
				
				for(i=cont;i<cont+1;i++)
				{
					vett_nome[i-1]= "sandwich";
					TextArea_preview.append(vett_nome[i-1] + "\n");
				}
			}
		}
		sandwich sand = new sandwich();
		Btn_sandwich.addActionListener(sand);
		
		//SUCCO
		class succo implements ActionListener {
			public void actionPerformed(ActionEvent arg0) {
				if(TextArea_servi.getText()!="")
				{
					Btn_invia.setEnabled(true);
					Btn_reset.setEnabled(true);
				}
				succo=succo+2; //Conteggio prodotto
				cont=cont+1; //Conteggio numero totale di prodotti acquistati
				riserva_succo=riserva_succo+1;
				cont_succo=cont_succo+1;
				for(i=cont;i<cont+1;i++)
				{
					vett_nome[i-1]= "succo";
					TextArea_preview.append(vett_nome[i-1] + "\n");
				}
			}
		}
		succo suc = new succo();
		Btn_succo.addActionListener(suc);
			
		//BIBITA
		class bibita implements ActionListener {
			public void actionPerformed(ActionEvent arg0) {
				if(TextArea_servi.getText()!="")
				{
					Btn_invia.setEnabled(true);
					Btn_reset.setEnabled(true);
				}
				bibita=bibita+8; //Conteggio prodotto
				cont=cont+1; //Conteggio numero totale di prodotti acquistati
				riserva_bibita=riserva_bibita+1;
				cont_bibita=cont_bibita+1;
				for(i=cont;i<cont+1;i++)
				{
					vett_nome[i-1]= "bibita";
					TextArea_preview.append(vett_nome[i-1] + "\n");
				}
			}
		}
		bibita bib = new bibita();
		Btn_bibita.addActionListener(bib);
			
		//ACQUA
		class acqua implements ActionListener {
			public void actionPerformed(ActionEvent arg0) {
				if(TextArea_servi.getText()!="")
				{
					Btn_invia.setEnabled(true);
					Btn_reset.setEnabled(true);
				}
				acqua=acqua+5; //Conteggio prodotto
				cont=cont+1; //Conteggio numero totale di prodotti acquistati
				riserva_acqua=riserva_acqua+1;
				cont_acqua= cont_acqua+1;
				for(i=cont;i<cont+1;i++)
				{
					vett_nome[i-1]= "acqua";
					TextArea_preview.append(vett_nome[i-1] + "\n");
				}

			}
		}
		acqua acq = new acqua();
		Btn_acqua.addActionListener(acq);
		
		//ALCOLICO
		class alcolico implements ActionListener {
			public void actionPerformed(ActionEvent arg0) {
				if(TextArea_servi.getText()!="")
				{
					Btn_invia.setEnabled(true);
					Btn_reset.setEnabled(true);
				}
				alcolico=alcolico+10; //Conteggio prodotto
				cont=cont+1; //Conteggio numero totale di prodotti acquistati
				riserva_alcolico=riserva_alcolico+1;
				cont_alcolico=cont_alcolico+1;
				for(i=cont;i<cont+1;i++)
				{
					vett_nome[i-1]= "alcolico";
					TextArea_preview.append(vett_nome[i-1] + "\n");
				}
			}
		}
		alcolico alc = new alcolico();
		Btn_alcolico.addActionListener(alc);
			
		//INVIA
		class invia implements ActionListener {
			public void actionPerformed(ActionEvent arg0) {
				
				int select= (int) ComboBox_inizio.getSelectedItem();
				num=select;
				TextArea_servi.setText(""); //Elimino contenuto TextArea
				Btn_invia.setEnabled(false);
				Btn_reset.setEnabled(false);
				Btn_servi.setEnabled(true);
				int v =Integer.parseInt(""+spinner.getValue()); //Calcolo il prezzo per persona
				String spi= String.valueOf( v + "€");
				if(cont<v)
				{
					JOptionPane.showMessageDialog(Popup,"Inserire minimo " + v + " ordinazioni!", "Inserisci più ordinazioni!", JOptionPane.INFORMATION_MESSAGE);
				}
				else
				{
				int val =Integer.parseInt(""+spinner.getValue()); 
				posti=posti+val;
				
				//USATO PER GESTIRE LE 2 COMBOBOX E IL NUMERO TOTALE DI TAVOLI
				if(num==1)
				{
					if(quant2_tot!=0)
					{
						quant1=caffe+sandwich+succo+bibita+acqua+alcolico-quant2_tot;
						quant1_tot=quant1;
					}
					
					if(quant3_tot!=0)
					{
						quant1=caffe+sandwich+succo+bibita+acqua+alcolico-quant3_tot;
						quant1_tot=quant1;
					}
					
					if(quant4_tot!=0)
					{
						quant1=caffe+sandwich+succo+bibita+acqua+alcolico-quant4_tot;
						quant1_tot=quant1;
					}
					
					if(quant5_tot!=0)
					{
						quant1=caffe+sandwich+succo+bibita+acqua+alcolico-quant5_tot;
						quant1_tot=quant1;
					}
					
					if(quant6_tot!=0)
					{
						quant1=caffe+sandwich+succo+bibita+acqua+alcolico-quant6_tot;
						quant1_tot=quant1;
					}
					
					if(quant7_tot!=0)
					{
						quant1=caffe+sandwich+succo+bibita+acqua+alcolico-quant7_tot;
						quant1_tot=quant1;
					}
					
					if(quant8_tot!=0)
					{
						quant1=caffe+sandwich+succo+bibita+acqua+alcolico-quant8_tot;
						quant1_tot=quant1;
					}
					
					if(quant9_tot!=0)
					{
						quant1=caffe+sandwich+succo+bibita+acqua+alcolico-quant9_tot;
						quant1_tot=quant1;
					}
					
					if(quant10_tot!=0)
					{
						quant1=caffe+sandwich+succo+bibita+acqua+alcolico-quant10_tot;
						quant1_tot=quant1;
					}
					
					if(quant11_tot!=0)
					{
						quant1=caffe+sandwich+succo+bibita+acqua+alcolico-quant11_tot;
						quant1_tot=quant1;
					}
					
					if(quant12_tot!=0)
					{
						quant1=caffe+sandwich+succo+bibita+acqua+alcolico-quant12_tot;
						quant1_tot=quant1;
					}
					
					if(quant13_tot!=0)
					{
						quant1=caffe+sandwich+succo+bibita+acqua+alcolico-quant13_tot;
						quant1_tot=quant1;
					}
					
					if(quant14_tot!=0)
					{
						quant1=caffe+sandwich+succo+bibita+acqua+alcolico-quant14_tot;
						quant1_tot=quant1;
					}
					
					if(quant15_tot!=0)
					{
						quant1=caffe+sandwich+succo+bibita+acqua+alcolico-quant15_tot;
						quant1_tot=quant1;
					}
					
					if(quant16_tot!=0)
					{
						quant1=caffe+sandwich+succo+bibita+acqua+alcolico-quant16_tot;
						quant1_tot=quant1;
					}
					
					if(quant17_tot!=0)
					{
						quant1=caffe+sandwich+succo+bibita+acqua+alcolico-quant17_tot;
						quant1_tot=quant1;
					}
					
					if(quant18_tot!=0)
					{
						quant1=caffe+sandwich+succo+bibita+acqua+alcolico-quant18_tot;
						quant1_tot=quant1;
					}
					
					if(quant19_tot!=0)
					{
						quant1=caffe+sandwich+succo+bibita+acqua+alcolico-quant19_tot;
						quant1_tot=quant1;
					}
					
					if(quant20_tot!=0)
					{
						quant1=caffe+sandwich+succo+bibita+acqua+alcolico-quant20_tot;
						quant1_tot=quant1;
					}
					else 
					{
						quant1=caffe+sandwich+succo+bibita+acqua+alcolico;
						quant1_tot=quant1;
					}
				}
				
				if(num==2)
				{
					if(quant1_tot!=0)
					{
						quant2=caffe+sandwich+succo+bibita+acqua+alcolico-quant1_tot;
						quant2_tot=quant2;
					}
					
					if(quant3_tot!=0)
					{
						quant2=caffe+sandwich+succo+bibita+acqua+alcolico-quant3_tot;
						quant2_tot=quant2;
					}
					
					if(quant4_tot!=0)
					{
						quant2=caffe+sandwich+succo+bibita+acqua+alcolico-quant4_tot;
						quant2_tot=quant2;
					}
					
					if(quant5_tot!=0)
					{
						quant2=caffe+sandwich+succo+bibita+acqua+alcolico-quant5_tot;
						quant2_tot=quant2;
					}
					
					if(quant6_tot!=0)
					{
						quant2=caffe+sandwich+succo+bibita+acqua+alcolico-quant6_tot;
						quant2_tot=quant2;
					}
					
					if(quant7_tot!=0)
					{
						quant2=caffe+sandwich+succo+bibita+acqua+alcolico-quant7_tot;
						quant2_tot=quant2;
					}
					
					if(quant8_tot!=0)
					{
						quant2=caffe+sandwich+succo+bibita+acqua+alcolico-quant8_tot;
						quant2_tot=quant2;
					}
					
					if(quant9_tot!=0)
					{
						quant2=caffe+sandwich+succo+bibita+acqua+alcolico-quant9_tot;
						quant2_tot=quant2;
					}
					
					if(quant10_tot!=0)
					{
						quant2=caffe+sandwich+succo+bibita+acqua+alcolico-quant10_tot;
						quant2_tot=quant2;
					}
					
					if(quant11_tot!=0)
					{
						quant2=caffe+sandwich+succo+bibita+acqua+alcolico-quant11_tot;
						quant2_tot=quant2;
					}
					
					if(quant12_tot!=0)
					{
						quant2=caffe+sandwich+succo+bibita+acqua+alcolico-quant12_tot;
						quant2_tot=quant2;
					}
					
					if(quant13_tot!=0)
					{
						quant2=caffe+sandwich+succo+bibita+acqua+alcolico-quant13_tot;
						quant2_tot=quant2;
					}
					
					if(quant14_tot!=0)
					{
						quant2=caffe+sandwich+succo+bibita+acqua+alcolico-quant14_tot;
						quant2_tot=quant2;
					}
					
					if(quant15_tot!=0)
					{
						quant2=caffe+sandwich+succo+bibita+acqua+alcolico-quant15_tot;
						quant2_tot=quant2;
					}
					
					if(quant16_tot!=0)
					{
						quant2=caffe+sandwich+succo+bibita+acqua+alcolico-quant16_tot;
						quant2_tot=quant2;
					}
					
					if(quant17_tot!=0)
					{
						quant2=caffe+sandwich+succo+bibita+acqua+alcolico-quant17_tot;
						quant2_tot=quant2;
					}
					
					if(quant18_tot!=0)
					{
						quant2=caffe+sandwich+succo+bibita+acqua+alcolico-quant18_tot;
						quant2_tot=quant2;
					}
					
					if(quant19_tot!=0)
					{
						quant2=caffe+sandwich+succo+bibita+acqua+alcolico-quant19_tot;
						quant2_tot=quant2;
					}
					
					if(quant20_tot!=0)
					{
						quant2=caffe+sandwich+succo+bibita+acqua+alcolico-quant20_tot;
						quant2_tot=quant2;
					}
					
					else
					{
						quant2=caffe+sandwich+succo+bibita+acqua+alcolico;
						quant2_tot=quant2;
					}
				}
				
				if(num==3)
				{
					if(quant1_tot!=0)
					{
						quant3=caffe+sandwich+succo+bibita+acqua+alcolico-quant1_tot;
						quant3_tot=quant3;
					}
					
					if(quant2_tot!=0)
					{
						quant3=caffe+sandwich+succo+bibita+acqua+alcolico-quant2_tot;
						quant3_tot=quant3;
					}
					
					if(quant4_tot!=0)
					{
						quant3=caffe+sandwich+succo+bibita+acqua+alcolico-quant4_tot;
						quant3_tot=quant3;
					}
					
					if(quant5_tot!=0)
					{
						quant3=caffe+sandwich+succo+bibita+acqua+alcolico-quant5_tot;
						quant3_tot=quant3;
					}
					
					if(quant6_tot!=0)
					{
						quant3=caffe+sandwich+succo+bibita+acqua+alcolico-quant6_tot;
						quant3_tot=quant3;
					}
					
					if(quant7_tot!=0)
					{
						quant3=caffe+sandwich+succo+bibita+acqua+alcolico-quant7_tot;
						quant3_tot=quant3;
					}
					
					if(quant8_tot!=0)
					{
						quant3=caffe+sandwich+succo+bibita+acqua+alcolico-quant8_tot;
						quant3_tot=quant3;
					}
					
					if(quant9_tot!=0)
					{
						quant3=caffe+sandwich+succo+bibita+acqua+alcolico-quant9_tot;
						quant3_tot=quant3;
					}
					
					if(quant10_tot!=0)
					{
						quant3=caffe+sandwich+succo+bibita+acqua+alcolico-quant10_tot;
						quant3_tot=quant3;
					}
					
					if(quant11_tot!=0)
					{
						quant3=caffe+sandwich+succo+bibita+acqua+alcolico-quant11_tot;
						quant3_tot=quant3;
					}
					
					if(quant12_tot!=0)
					{
						quant3=caffe+sandwich+succo+bibita+acqua+alcolico-quant12_tot;
						quant3_tot=quant3;
					}
					
					if(quant13_tot!=0)
					{
						quant3=caffe+sandwich+succo+bibita+acqua+alcolico-quant13_tot;
						quant3_tot=quant3;
					}
					
					if(quant14_tot!=0)
					{
						quant3=caffe+sandwich+succo+bibita+acqua+alcolico-quant14_tot;
						quant3_tot=quant3;
					}
					
					if(quant15_tot!=0)
					{
						quant3=caffe+sandwich+succo+bibita+acqua+alcolico-quant15_tot;
						quant3_tot=quant3;
					}
					
					if(quant16_tot!=0)
					{
						quant3=caffe+sandwich+succo+bibita+acqua+alcolico-quant16_tot;
						quant3_tot=quant3;
					}
					
					if(quant17_tot!=0)
					{
						quant3=caffe+sandwich+succo+bibita+acqua+alcolico-quant17_tot;
						quant3_tot=quant3;
					}
					
					if(quant18_tot!=0)
					{
						quant3=caffe+sandwich+succo+bibita+acqua+alcolico-quant18_tot;
						quant3_tot=quant3;
					}
					
					if(quant19_tot!=0)
					{
						quant3=caffe+sandwich+succo+bibita+acqua+alcolico-quant19_tot;
						quant3_tot=quant3;
					}
					
					if(quant20_tot!=0)
					{
						quant3=caffe+sandwich+succo+bibita+acqua+alcolico-quant20_tot;
						quant3_tot=quant3;
					}
					
					else
					{
						quant3=caffe+sandwich+succo+bibita+acqua+alcolico;
						quant3_tot=quant3;
					}
				}
				
				if(num==4)
				{
					if(quant1_tot!=0)
					{
						quant4=caffe+sandwich+succo+bibita+acqua+alcolico-quant1_tot;
						quant4_tot=quant4;
					}
					
					if(quant2_tot!=0)
					{
						quant4=caffe+sandwich+succo+bibita+acqua+alcolico-quant2_tot;
						quant4_tot=quant4;
					}
					
					if(quant3_tot!=0)
					{
						quant4=caffe+sandwich+succo+bibita+acqua+alcolico-quant3_tot;
						quant4_tot=quant4;
					}
										
					if(quant5_tot!=0)
					{
						quant4=caffe+sandwich+succo+bibita+acqua+alcolico-quant5_tot;
						quant4_tot=quant4;
					}
					
					if(quant6_tot!=0)
					{
						quant4=caffe+sandwich+succo+bibita+acqua+alcolico-quant6_tot;
						quant4_tot=quant4;
					}
					
					if(quant7_tot!=0)
					{
						quant4=caffe+sandwich+succo+bibita+acqua+alcolico-quant7_tot;
						quant4_tot=quant4;
					}
					
					if(quant8_tot!=0)
					{
						quant4=caffe+sandwich+succo+bibita+acqua+alcolico-quant8_tot;
						quant4_tot=quant4;
					}
					
					if(quant9_tot!=0)
					{
						quant4=caffe+sandwich+succo+bibita+acqua+alcolico-quant9_tot;
						quant4_tot=quant4;
					}
					
					if(quant10_tot!=0)
					{
						quant4=caffe+sandwich+succo+bibita+acqua+alcolico-quant10_tot;
						quant4_tot=quant4;
					}
					
					if(quant11_tot!=0)
					{
						quant4=caffe+sandwich+succo+bibita+acqua+alcolico-quant11_tot;
						quant4_tot=quant4;
					}
					
					if(quant12_tot!=0)
					{
						quant4=caffe+sandwich+succo+bibita+acqua+alcolico-quant12_tot;
						quant4_tot=quant4;
					}
					
					if(quant13_tot!=0)
					{
						quant4=caffe+sandwich+succo+bibita+acqua+alcolico-quant13_tot;
						quant4_tot=quant4;
					}
					
					if(quant14_tot!=0)
					{
						quant4=caffe+sandwich+succo+bibita+acqua+alcolico-quant14_tot;
						quant4_tot=quant4;
					}
					
					if(quant15_tot!=0)
					{
						quant4=caffe+sandwich+succo+bibita+acqua+alcolico-quant15_tot;
						quant4_tot=quant4;
					}
					
					if(quant16_tot!=0)
					{
						quant4=caffe+sandwich+succo+bibita+acqua+alcolico-quant16_tot;
						quant4_tot=quant4;
					}
					
					if(quant17_tot!=0)
					{
						quant4=caffe+sandwich+succo+bibita+acqua+alcolico-quant17_tot;
						quant4_tot=quant4;
					}
					
					if(quant18_tot!=0)
					{
						quant4=caffe+sandwich+succo+bibita+acqua+alcolico-quant18_tot;
						quant4_tot=quant4;
					}
					
					if(quant19_tot!=0)
					{
						quant4=caffe+sandwich+succo+bibita+acqua+alcolico-quant19_tot;
						quant4_tot=quant4;
					}
					
					if(quant20_tot!=0)
					{
						quant4=caffe+sandwich+succo+bibita+acqua+alcolico-quant20_tot;
						quant4_tot=quant4;
					}
					
					else
					{
						quant4=caffe+sandwich+succo+bibita+acqua+alcolico;
						quant4_tot=quant4;
					}
				}
				
				if(num==5)
				{
					if(quant1_tot!=0)
					{
						quant5=caffe+sandwich+succo+bibita+acqua+alcolico-quant1_tot;
						quant5_tot=quant5;
					}
					
					if(quant2_tot!=0)
					{
						quant5=caffe+sandwich+succo+bibita+acqua+alcolico-quant2_tot;
						quant5_tot=quant5;
					}
					
					if(quant3_tot!=0)
					{
						quant5=caffe+sandwich+succo+bibita+acqua+alcolico-quant3_tot;
						quant5_tot=quant5;
					}
										
					if(quant4_tot!=0)
					{
						quant5=caffe+sandwich+succo+bibita+acqua+alcolico-quant4_tot;
						quant5_tot=quant5;
					}
					
					if(quant6_tot!=0)
					{
						quant5=caffe+sandwich+succo+bibita+acqua+alcolico-quant6_tot;
						quant5_tot=quant5;
					}
					
					if(quant7_tot!=0)
					{
						quant5=caffe+sandwich+succo+bibita+acqua+alcolico-quant7_tot;
						quant5_tot=quant5;
					}
					
					if(quant8_tot!=0)
					{
						quant5=caffe+sandwich+succo+bibita+acqua+alcolico-quant8_tot;
						quant5_tot=quant5;
					}
					
					if(quant9_tot!=0)
					{
						quant5=caffe+sandwich+succo+bibita+acqua+alcolico-quant9_tot;
						quant5_tot=quant5;
					}
					
					if(quant10_tot!=0)
					{
						quant5=caffe+sandwich+succo+bibita+acqua+alcolico-quant10_tot;
						quant5_tot=quant5;
					}
					
					if(quant11_tot!=0)
					{
						quant5=caffe+sandwich+succo+bibita+acqua+alcolico-quant11_tot;
						quant5_tot=quant5;
					}
					
					if(quant12_tot!=0)
					{
						quant5=caffe+sandwich+succo+bibita+acqua+alcolico-quant12_tot;
						quant5_tot=quant5;
					}
					
					if(quant13_tot!=0)
					{
						quant5=caffe+sandwich+succo+bibita+acqua+alcolico-quant13_tot;
						quant5_tot=quant5;
					}
					
					if(quant14_tot!=0)
					{
						quant5=caffe+sandwich+succo+bibita+acqua+alcolico-quant14_tot;
						quant5_tot=quant5;
					}
					
					if(quant15_tot!=0)
					{
						quant5=caffe+sandwich+succo+bibita+acqua+alcolico-quant15_tot;
						quant5_tot=quant5;
					}
					
					if(quant16_tot!=0)
					{
						quant5=caffe+sandwich+succo+bibita+acqua+alcolico-quant16_tot;
						quant5_tot=quant5;
					}
					
					if(quant17_tot!=0)
					{
						quant5=caffe+sandwich+succo+bibita+acqua+alcolico-quant17_tot;
						quant5_tot=quant5;
					}
					
					if(quant18_tot!=0)
					{
						quant5=caffe+sandwich+succo+bibita+acqua+alcolico-quant18_tot;
						quant5_tot=quant5;
					}
					
					if(quant19_tot!=0)
					{
						quant5=caffe+sandwich+succo+bibita+acqua+alcolico-quant19_tot;
						quant5_tot=quant5;
					}
					
					if(quant20_tot!=0)
					{
						quant5=caffe+sandwich+succo+bibita+acqua+alcolico-quant20_tot;
						quant5_tot=quant5;
					}
					
					else
					{
						quant5=caffe+sandwich+succo+bibita+acqua+alcolico;
						quant5_tot=quant5;
					}
				}
				
				if(num==6)
				{
					if(quant1_tot!=0)
					{
						quant6=caffe+sandwich+succo+bibita+acqua+alcolico-quant1_tot;
						quant6_tot=quant6;
					}
					
					if(quant2_tot!=0)
					{
						quant6=caffe+sandwich+succo+bibita+acqua+alcolico-quant2_tot;
						quant6_tot=quant6;
					}
					
					if(quant3_tot!=0)
					{
						quant6=caffe+sandwich+succo+bibita+acqua+alcolico-quant3_tot;
						quant6_tot=quant6;
					}
					
					if(quant4_tot!=0)
					{
						quant6=caffe+sandwich+succo+bibita+acqua+alcolico-quant4_tot;
						quant6_tot=quant6;
					}
									
					if(quant5_tot!=0)
					{
						quant6=caffe+sandwich+succo+bibita+acqua+alcolico-quant5_tot;
						quant6_tot=quant6;
					}
					
					if(quant7_tot!=0)
					{
						quant6=caffe+sandwich+succo+bibita+acqua+alcolico-quant7_tot;
						quant6_tot=quant6;
					}
					
					if(quant8_tot!=0)
					{
						quant6=caffe+sandwich+succo+bibita+acqua+alcolico-quant8_tot;
						quant6_tot=quant6;
					}
					
					if(quant9_tot!=0)
					{
						quant6=caffe+sandwich+succo+bibita+acqua+alcolico-quant9_tot;
						quant6_tot=quant6;
					}
					
					if(quant10_tot!=0)
					{
						quant6=caffe+sandwich+succo+bibita+acqua+alcolico-quant10_tot;
						quant6_tot=quant6;
					}
					
					if(quant11_tot!=0)
					{
						quant6=caffe+sandwich+succo+bibita+acqua+alcolico-quant11_tot;
						quant6_tot=quant6;
					}
					
					if(quant12_tot!=0)
					{
						quant6=caffe+sandwich+succo+bibita+acqua+alcolico-quant12_tot;
						quant6_tot=quant6;
					}
					
					if(quant13_tot!=0)
					{
						quant6=caffe+sandwich+succo+bibita+acqua+alcolico-quant13_tot;
						quant6_tot=quant6;
					}
					
					if(quant14_tot!=0)
					{
						quant6=caffe+sandwich+succo+bibita+acqua+alcolico-quant14_tot;
						quant6_tot=quant6;
					}
					
					if(quant15_tot!=0)
					{
						quant6=caffe+sandwich+succo+bibita+acqua+alcolico-quant15_tot;
						quant6_tot=quant6;
					}
					
					if(quant16_tot!=0)
					{
						quant6=caffe+sandwich+succo+bibita+acqua+alcolico-quant16_tot;
						quant6_tot=quant6;
					}
					
					if(quant17_tot!=0)
					{
						quant6=caffe+sandwich+succo+bibita+acqua+alcolico-quant17_tot;
						quant6_tot=quant6;
					}
					
					if(quant18_tot!=0)
					{
						quant6=caffe+sandwich+succo+bibita+acqua+alcolico-quant18_tot;
						quant6_tot=quant6;
					}
					
					if(quant19_tot!=0)
					{
						quant6=caffe+sandwich+succo+bibita+acqua+alcolico-quant19_tot;
						quant6_tot=quant6;
					}
					
					if(quant20_tot!=0)
					{
						quant6=caffe+sandwich+succo+bibita+acqua+alcolico-quant20_tot;
						quant6_tot=quant6;
					}
					
					else
					{
						quant6=caffe+sandwich+succo+bibita+acqua+alcolico;
						quant6_tot=quant6;
					}
				}
				
				if(num==7)
				{
					if(quant1_tot!=0)
					{
						quant7=caffe+sandwich+succo+bibita+acqua+alcolico-quant1_tot;
						quant7_tot=quant7;
					}
					
					if(quant2_tot!=0)
					{
						quant7=caffe+sandwich+succo+bibita+acqua+alcolico-quant2_tot;
						quant7_tot=quant7;
					}
					
					if(quant3_tot!=0)
					{
						quant7=caffe+sandwich+succo+bibita+acqua+alcolico-quant3_tot;
						quant7_tot=quant7;
					}
								
					if(quant4_tot!=0)
					{
						quant7=caffe+sandwich+succo+bibita+acqua+alcolico-quant4_tot;
						quant7_tot=quant7;
					}
					
					if(quant5_tot!=0)
					{
						quant7=caffe+sandwich+succo+bibita+acqua+alcolico-quant5_tot;
						quant7_tot=quant7;
					}
					
					if(quant6_tot!=0)
					{
						quant7=caffe+sandwich+succo+bibita+acqua+alcolico-quant6_tot;
						quant7_tot=quant7;
					}
					
					if(quant8_tot!=0)
					{
						quant7=caffe+sandwich+succo+bibita+acqua+alcolico-quant8_tot;
						quant7_tot=quant7;
					}
					
					if(quant9_tot!=0)
					{
						quant7=caffe+sandwich+succo+bibita+acqua+alcolico-quant9_tot;
						quant7_tot=quant7;
					}
					
					if(quant10_tot!=0)
					{
						quant7=caffe+sandwich+succo+bibita+acqua+alcolico-quant10_tot;
						quant7_tot=quant7;
					}
					
					if(quant11_tot!=0)
					{
						quant7=caffe+sandwich+succo+bibita+acqua+alcolico-quant11_tot;
						quant7_tot=quant7;
					}
					
					if(quant12_tot!=0)
					{
						quant7=caffe+sandwich+succo+bibita+acqua+alcolico-quant12_tot;
						quant7_tot=quant7;
					}
					
					if(quant13_tot!=0)
					{
						quant7=caffe+sandwich+succo+bibita+acqua+alcolico-quant13_tot;
						quant7_tot=quant7;
					}
					
					if(quant14_tot!=0)
					{
						quant7=caffe+sandwich+succo+bibita+acqua+alcolico-quant14_tot;
						quant7_tot=quant7;
					}
					
					if(quant15_tot!=0)
					{
						quant7=caffe+sandwich+succo+bibita+acqua+alcolico-quant15_tot;
						quant7_tot=quant7;
					}
					
					if(quant16_tot!=0)
					{
						quant7=caffe+sandwich+succo+bibita+acqua+alcolico-quant16_tot;
						quant7_tot=quant7;
					}
					
					if(quant17_tot!=0)
					{
						quant7=caffe+sandwich+succo+bibita+acqua+alcolico-quant17_tot;
						quant7_tot=quant7;
					}
					
					if(quant18_tot!=0)
					{
						quant7=caffe+sandwich+succo+bibita+acqua+alcolico-quant18_tot;
						quant7_tot=quant7;
					}
					
					if(quant19_tot!=0)
					{
						quant7=caffe+sandwich+succo+bibita+acqua+alcolico-quant19_tot;
						quant7_tot=quant7;
					}
					
					if(quant20_tot!=0)
					{
						quant7=caffe+sandwich+succo+bibita+acqua+alcolico-quant20_tot;
						quant7_tot=quant7;
					}
					
					else
					{
						quant7=caffe+sandwich+succo+bibita+acqua+alcolico;
						quant7_tot=quant7;
					}
				}
				
				if(num==8)
				{
					if(quant1_tot!=0)
					{
						quant8=caffe+sandwich+succo+bibita+acqua+alcolico-quant1_tot;
						quant8_tot=quant8;
					}
					
					if(quant2_tot!=0)
					{
						quant8=caffe+sandwich+succo+bibita+acqua+alcolico-quant2_tot;
						quant8_tot=quant8;
					}
					
					if(quant3_tot!=0)
					{
						quant8=caffe+sandwich+succo+bibita+acqua+alcolico-quant3_tot;
						quant8_tot=quant8;
					}
					
					if(quant4_tot!=0)
					{
						quant8=caffe+sandwich+succo+bibita+acqua+alcolico-quant4_tot;
						quant8_tot=quant8;
					}
									
					if(quant5_tot!=0)
					{
						quant8=caffe+sandwich+succo+bibita+acqua+alcolico-quant5_tot;
						quant8_tot=quant8;
					}
					
					if(quant6_tot!=0)
					{
						quant8=caffe+sandwich+succo+bibita+acqua+alcolico-quant6_tot;
						quant8_tot=quant8;
					}
					
					if(quant7_tot!=0)
					{
						quant8=caffe+sandwich+succo+bibita+acqua+alcolico-quant7_tot;
						quant8_tot=quant8;
					}
					
					
					if(quant9_tot!=0)
					{
						quant8=caffe+sandwich+succo+bibita+acqua+alcolico-quant9_tot;
						quant8_tot=quant8;
					}
					
					if(quant10_tot!=0)
					{
						quant8=caffe+sandwich+succo+bibita+acqua+alcolico-quant10_tot;
						quant8_tot=quant8;
					}
					
					if(quant11_tot!=0)
					{
						quant8=caffe+sandwich+succo+bibita+acqua+alcolico-quant11_tot;
						quant8_tot=quant8;
					}
					
					if(quant12_tot!=0)
					{
						quant8=caffe+sandwich+succo+bibita+acqua+alcolico-quant12_tot;
						quant8_tot=quant8;
					}
					
					if(quant13_tot!=0)
					{
						quant8=caffe+sandwich+succo+bibita+acqua+alcolico-quant13_tot;
						quant8_tot=quant8;
					}
					
					if(quant14_tot!=0)
					{
						quant8=caffe+sandwich+succo+bibita+acqua+alcolico-quant14_tot;
						quant8_tot=quant8;
					}
					
					if(quant15_tot!=0)
					{
						quant8=caffe+sandwich+succo+bibita+acqua+alcolico-quant15_tot;
						quant8_tot=quant8;
					}
					
					if(quant16_tot!=0)
					{
						quant8=caffe+sandwich+succo+bibita+acqua+alcolico-quant16_tot;
						quant8_tot=quant8;
					}
					
					if(quant17_tot!=0)
					{
						quant8=caffe+sandwich+succo+bibita+acqua+alcolico-quant17_tot;
						quant8_tot=quant8;
					}
					
					if(quant18_tot!=0)
					{
						quant8=caffe+sandwich+succo+bibita+acqua+alcolico-quant18_tot;
						quant8_tot=quant8;
					}
					
					if(quant19_tot!=0)
					{
						quant8=caffe+sandwich+succo+bibita+acqua+alcolico-quant19_tot;
						quant8_tot=quant8;
					}
					
					if(quant20_tot!=0)
					{
						quant8=caffe+sandwich+succo+bibita+acqua+alcolico-quant20_tot;
						quant8_tot=quant8;
					}
					
					else
					{
						quant8=caffe+sandwich+succo+bibita+acqua+alcolico;
						quant8_tot=quant8;
					}
				}
				
				if(num==9)
				{
					if(quant1_tot!=0)
					{
						quant9=caffe+sandwich+succo+bibita+acqua+alcolico-quant1_tot;
						quant9_tot=quant9;
					}
					
					if(quant2_tot!=0)
					{
						quant9=caffe+sandwich+succo+bibita+acqua+alcolico-quant2_tot;
						quant9_tot=quant9;
					}
					
					if(quant3_tot!=0)
					{
						quant9=caffe+sandwich+succo+bibita+acqua+alcolico-quant3_tot;
						quant9_tot=quant9;
					}
					
					if(quant4_tot!=0)
					{
						quant9=caffe+sandwich+succo+bibita+acqua+alcolico-quant4_tot;
						quant9_tot=quant9;
					}
									
					if(quant5_tot!=0)
					{
						quant9=caffe+sandwich+succo+bibita+acqua+alcolico-quant5_tot;
						quant9_tot=quant9;
					}
					
					if(quant6_tot!=0)
					{
						quant9=caffe+sandwich+succo+bibita+acqua+alcolico-quant6_tot;
						quant9_tot=quant9;
					}
					
					if(quant7_tot!=0)
					{
						quant9=caffe+sandwich+succo+bibita+acqua+alcolico-quant7_tot;
						quant9_tot=quant9;
					}
					
					
					if(quant8_tot!=0)
					{
						quant9=caffe+sandwich+succo+bibita+acqua+alcolico-quant8_tot;
						quant9_tot=quant9;
					}
					
					if(quant10_tot!=0)
					{
						quant9=caffe+sandwich+succo+bibita+acqua+alcolico-quant10_tot;
						quant9_tot=quant9;
					}
					
					if(quant11_tot!=0)
					{
						quant9=caffe+sandwich+succo+bibita+acqua+alcolico-quant11_tot;
						quant9_tot=quant9;
					}
					
					if(quant12_tot!=0)
					{
						quant9=caffe+sandwich+succo+bibita+acqua+alcolico-quant12_tot;
						quant9_tot=quant9;
					}
					
					if(quant13_tot!=0)
					{
						quant9=caffe+sandwich+succo+bibita+acqua+alcolico-quant13_tot;
						quant9_tot=quant9;
					}
					
					if(quant14_tot!=0)
					{
						quant9=caffe+sandwich+succo+bibita+acqua+alcolico-quant14_tot;
						quant9_tot=quant9;
					}
					
					if(quant15_tot!=0)
					{
						quant9=caffe+sandwich+succo+bibita+acqua+alcolico-quant15_tot;
						quant9_tot=quant9;
					}
					
					if(quant16_tot!=0)
					{
						quant9=caffe+sandwich+succo+bibita+acqua+alcolico-quant16_tot;
						quant9_tot=quant9;
					}
					
					if(quant17_tot!=0)
					{
						quant9=caffe+sandwich+succo+bibita+acqua+alcolico-quant17_tot;
						quant9_tot=quant9;
					}
					
					if(quant18_tot!=0)
					{
						quant9=caffe+sandwich+succo+bibita+acqua+alcolico-quant18_tot;
						quant9_tot=quant9;
					}
					
					if(quant19_tot!=0)
					{
						quant9=caffe+sandwich+succo+bibita+acqua+alcolico-quant19_tot;
						quant9_tot=quant9;
					}
					
					if(quant20_tot!=0)
					{
						quant9=caffe+sandwich+succo+bibita+acqua+alcolico-quant20_tot;
						quant9_tot=quant9;
					}
					
					else
					{
						quant9=caffe+sandwich+succo+bibita+acqua+alcolico;
						quant9_tot=quant9;
					}
				}
				
				if(num==10)
				{
					if(quant1_tot!=0)
					{
						quant10=caffe+sandwich+succo+bibita+acqua+alcolico-quant1_tot;
						quant10_tot=quant10;
					}
					
					if(quant2_tot!=0)
					{
						quant10=caffe+sandwich+succo+bibita+acqua+alcolico-quant2_tot;
						quant10_tot=quant10;
					}
					
					if(quant3_tot!=0)
					{
						quant10=caffe+sandwich+succo+bibita+acqua+alcolico-quant3_tot;
						quant10_tot=quant10;
					}
					
					if(quant4_tot!=0)
					{
						quant10=caffe+sandwich+succo+bibita+acqua+alcolico-quant4_tot;
						quant10_tot=quant10;
					}
									
					if(quant5_tot!=0)
					{
						quant10=caffe+sandwich+succo+bibita+acqua+alcolico-quant5_tot;
						quant10_tot=quant10;
					}
					
					if(quant6_tot!=0)
					{
						quant10=caffe+sandwich+succo+bibita+acqua+alcolico-quant6_tot;
						quant10_tot=quant10;
					}
					
					if(quant7_tot!=0)
					{
						quant10=caffe+sandwich+succo+bibita+acqua+alcolico-quant7_tot;
						quant10_tot=quant10;
					}
					
					
					if(quant8_tot!=0)
					{
						quant10=caffe+sandwich+succo+bibita+acqua+alcolico-quant8_tot;
						quant10_tot=quant10;
					}
					
					if(quant9_tot!=0)
					{
						quant10=caffe+sandwich+succo+bibita+acqua+alcolico-quant9_tot;
						quant10_tot=quant10;
					}
					
					if(quant11_tot!=0)
					{
						quant10=caffe+sandwich+succo+bibita+acqua+alcolico-quant11_tot;
						quant10_tot=quant10;
					}
					
					if(quant12_tot!=0)
					{
						quant10=caffe+sandwich+succo+bibita+acqua+alcolico-quant12_tot;
						quant10_tot=quant10;
					}
					
					if(quant13_tot!=0)
					{
						quant10=caffe+sandwich+succo+bibita+acqua+alcolico-quant13_tot;
						quant10_tot=quant10;
					}
					
					if(quant14_tot!=0)
					{
						quant10=caffe+sandwich+succo+bibita+acqua+alcolico-quant14_tot;
						quant10_tot=quant10;
					}
					
					if(quant15_tot!=0)
					{
						quant10=caffe+sandwich+succo+bibita+acqua+alcolico-quant15_tot;
						quant10_tot=quant10;
					}
					
					if(quant16_tot!=0)
					{
						quant10=caffe+sandwich+succo+bibita+acqua+alcolico-quant16_tot;
						quant10_tot=quant10;
					}
					
					if(quant17_tot!=0)
					{
						quant10=caffe+sandwich+succo+bibita+acqua+alcolico-quant17_tot;
						quant10_tot=quant10;
					}
					
					if(quant18_tot!=0)
					{
						quant10=caffe+sandwich+succo+bibita+acqua+alcolico-quant18_tot;
						quant10_tot=quant10;
					}
					
					if(quant19_tot!=0)
					{
						quant10=caffe+sandwich+succo+bibita+acqua+alcolico-quant19_tot;
						quant10_tot=quant10;
					}
					
					if(quant20_tot!=0)
					{
						quant10=caffe+sandwich+succo+bibita+acqua+alcolico-quant20_tot;
						quant10_tot=quant10;
					}
					
					else
					{
						quant10=caffe+sandwich+succo+bibita+acqua+alcolico;
						quant10_tot=quant10;
					}
				}
				
				if(num==11)
				{
					if(quant1_tot!=0)
					{
						quant11=caffe+sandwich+succo+bibita+acqua+alcolico-quant1_tot;
						quant11_tot=quant11;
					}
					
					if(quant2_tot!=0)
					{
						quant11=caffe+sandwich+succo+bibita+acqua+alcolico-quant2_tot;
						quant11_tot=quant11;
					}
					
					if(quant3_tot!=0)
					{
						quant11=caffe+sandwich+succo+bibita+acqua+alcolico-quant3_tot;
						quant11_tot=quant11;
					}
					
					if(quant4_tot!=0)
					{
						quant11=caffe+sandwich+succo+bibita+acqua+alcolico-quant4_tot;
						quant11_tot=quant11;
					}
									
					if(quant5_tot!=0)
					{
						quant11=caffe+sandwich+succo+bibita+acqua+alcolico-quant5_tot;
						quant11_tot=quant11;
					}
					
					if(quant6_tot!=0)
					{
						quant11=caffe+sandwich+succo+bibita+acqua+alcolico-quant6_tot;
						quant11_tot=quant11;
					}
					
					if(quant7_tot!=0)
					{
						quant11=caffe+sandwich+succo+bibita+acqua+alcolico-quant7_tot;
						quant11_tot=quant11;
					}
					
					
					if(quant8_tot!=0)
					{
						quant11=caffe+sandwich+succo+bibita+acqua+alcolico-quant8_tot;
						quant11_tot=quant11;
					}
					
					if(quant9_tot!=0)
					{
						quant11=caffe+sandwich+succo+bibita+acqua+alcolico-quant9_tot;
						quant11_tot=quant11;
					}
					
					if(quant10_tot!=0)
					{
						quant11=caffe+sandwich+succo+bibita+acqua+alcolico-quant10_tot;
						quant11_tot=quant11;
					}
					
					if(quant12_tot!=0)
					{
						quant11=caffe+sandwich+succo+bibita+acqua+alcolico-quant12_tot;
						quant11_tot=quant11;
					}
					
					if(quant13_tot!=0)
					{
						quant11=caffe+sandwich+succo+bibita+acqua+alcolico-quant13_tot;
						quant11_tot=quant11;
					}
					
					if(quant14_tot!=0)
					{
						quant11=caffe+sandwich+succo+bibita+acqua+alcolico-quant14_tot;
						quant11_tot=quant11;
					}
					
					if(quant15_tot!=0)
					{
						quant11=caffe+sandwich+succo+bibita+acqua+alcolico-quant15_tot;
						quant11_tot=quant11;
					}
					
					if(quant16_tot!=0)
					{
						quant11=caffe+sandwich+succo+bibita+acqua+alcolico-quant16_tot;
						quant11_tot=quant11;
					}
					
					if(quant17_tot!=0)
					{
						quant11=caffe+sandwich+succo+bibita+acqua+alcolico-quant17_tot;
						quant11_tot=quant11;
					}
					
					if(quant18_tot!=0)
					{
						quant11=caffe+sandwich+succo+bibita+acqua+alcolico-quant18_tot;
						quant11_tot=quant11;
					}
					
					if(quant19_tot!=0)
					{
						quant11=caffe+sandwich+succo+bibita+acqua+alcolico-quant19_tot;
						quant11_tot=quant11;
					}
					
					if(quant20_tot!=0)
					{
						quant11=caffe+sandwich+succo+bibita+acqua+alcolico-quant20_tot;
						quant11_tot=quant11;
					}
					
					else
					{
						quant11=caffe+sandwich+succo+bibita+acqua+alcolico;
						quant11_tot=quant11;
					}
				}
				
				if(num==12)
				{
					if(quant1_tot!=0)
					{
						quant12=caffe+sandwich+succo+bibita+acqua+alcolico-quant1_tot;
						quant12_tot=quant12;
					}
					
					if(quant2_tot!=0)
					{
						quant12=caffe+sandwich+succo+bibita+acqua+alcolico-quant2_tot;
						quant12_tot=quant12;
					}
					
					if(quant3_tot!=0)
					{
						quant12=caffe+sandwich+succo+bibita+acqua+alcolico-quant3_tot;
						quant12_tot=quant12;
					}
					
					if(quant4_tot!=0)
					{
						quant12=caffe+sandwich+succo+bibita+acqua+alcolico-quant4_tot;
						quant12_tot=quant12;
					}
									
					if(quant5_tot!=0)
					{
						quant12=caffe+sandwich+succo+bibita+acqua+alcolico-quant5_tot;
						quant12_tot=quant12;
					}
					
					if(quant6_tot!=0)
					{
						quant12=caffe+sandwich+succo+bibita+acqua+alcolico-quant6_tot;
						quant12_tot=quant12;
					}
					
					if(quant7_tot!=0)
					{
						quant12=caffe+sandwich+succo+bibita+acqua+alcolico-quant7_tot;
						quant12_tot=quant12;
					}
					
					
					if(quant8_tot!=0)
					{
						quant12=caffe+sandwich+succo+bibita+acqua+alcolico-quant8_tot;
						quant12_tot=quant12;
					}
					
					if(quant9_tot!=0)
					{
						quant12=caffe+sandwich+succo+bibita+acqua+alcolico-quant9_tot;
						quant12_tot=quant12;
					}
					
					if(quant10_tot!=0)
					{
						quant12=caffe+sandwich+succo+bibita+acqua+alcolico-quant10_tot;
						quant12_tot=quant12;
					}
					
					if(quant11_tot!=0)
					{
						quant12=caffe+sandwich+succo+bibita+acqua+alcolico-quant11_tot;
						quant12_tot=quant12;
					}
					
					if(quant13_tot!=0)
					{
						quant12=caffe+sandwich+succo+bibita+acqua+alcolico-quant13_tot;
						quant12_tot=quant12;
					}
					
					if(quant14_tot!=0)
					{
						quant12=caffe+sandwich+succo+bibita+acqua+alcolico-quant14_tot;
						quant12_tot=quant12;
					}
					
					if(quant15_tot!=0)
					{
						quant12=caffe+sandwich+succo+bibita+acqua+alcolico-quant15_tot;
						quant12_tot=quant12;
					}
					
					if(quant16_tot!=0)
					{
						quant12=caffe+sandwich+succo+bibita+acqua+alcolico-quant16_tot;
						quant12_tot=quant12;
					}
					
					if(quant17_tot!=0)
					{
						quant12=caffe+sandwich+succo+bibita+acqua+alcolico-quant17_tot;
						quant12_tot=quant12;
					}
					
					if(quant18_tot!=0)
					{
						quant12=caffe+sandwich+succo+bibita+acqua+alcolico-quant18_tot;
						quant12_tot=quant12;
					}
					
					if(quant19_tot!=0)
					{
						quant12=caffe+sandwich+succo+bibita+acqua+alcolico-quant19_tot;
						quant12_tot=quant12;
					}
					
					if(quant20_tot!=0)
					{
						quant12=caffe+sandwich+succo+bibita+acqua+alcolico-quant20_tot;
						quant12_tot=quant12;
					}
					
					else
					{
						quant12=caffe+sandwich+succo+bibita+acqua+alcolico;
						quant12_tot=quant12;
					}
				}
				
				if(num==13)
				{
					if(quant1_tot!=0)
					{
						quant13=caffe+sandwich+succo+bibita+acqua+alcolico-quant1_tot;
						quant13_tot=quant13;
					}
					
					if(quant2_tot!=0)
					{
						quant13=caffe+sandwich+succo+bibita+acqua+alcolico-quant2_tot;
						quant13_tot=quant13;
					}
					
					if(quant3_tot!=0)
					{
						quant13=caffe+sandwich+succo+bibita+acqua+alcolico-quant3_tot;
						quant13_tot=quant13;
					}
					
					if(quant4_tot!=0)
					{
						quant13=caffe+sandwich+succo+bibita+acqua+alcolico-quant4_tot;
						quant13_tot=quant13;
					}
									
					if(quant5_tot!=0)
					{
						quant13=caffe+sandwich+succo+bibita+acqua+alcolico-quant5_tot;
						quant13_tot=quant13;
					}
					
					if(quant6_tot!=0)
					{
						quant13=caffe+sandwich+succo+bibita+acqua+alcolico-quant6_tot;
						quant13_tot=quant13;
					}
					
					if(quant7_tot!=0)
					{
						quant13=caffe+sandwich+succo+bibita+acqua+alcolico-quant7_tot;
						quant13_tot=quant13;
					}
					
					
					if(quant8_tot!=0)
					{
						quant13=caffe+sandwich+succo+bibita+acqua+alcolico-quant8_tot;
						quant13_tot=quant13;
					}
					
					if(quant9_tot!=0)
					{
						quant13=caffe+sandwich+succo+bibita+acqua+alcolico-quant9_tot;
						quant13_tot=quant13;
					}
					
					if(quant10_tot!=0)
					{
						quant13=caffe+sandwich+succo+bibita+acqua+alcolico-quant10_tot;
						quant13_tot=quant13;
					}
					
					if(quant11_tot!=0)
					{
						quant13=caffe+sandwich+succo+bibita+acqua+alcolico-quant11_tot;
						quant13_tot=quant13;
					}
					
					if(quant12_tot!=0)
					{
						quant13=caffe+sandwich+succo+bibita+acqua+alcolico-quant12_tot;
						quant13_tot=quant13;
					}
					
					if(quant14_tot!=0)
					{
						quant13=caffe+sandwich+succo+bibita+acqua+alcolico-quant14_tot;
						quant13_tot=quant13;
					}
					
					if(quant15_tot!=0)
					{
						quant13=caffe+sandwich+succo+bibita+acqua+alcolico-quant15_tot;
						quant13_tot=quant13;
					}
					
					if(quant16_tot!=0)
					{
						quant13=caffe+sandwich+succo+bibita+acqua+alcolico-quant16_tot;
						quant13_tot=quant13;
					}
					
					if(quant17_tot!=0)
					{
						quant13=caffe+sandwich+succo+bibita+acqua+alcolico-quant17_tot;
						quant13_tot=quant13;
					}
					
					if(quant18_tot!=0)
					{
						quant13=caffe+sandwich+succo+bibita+acqua+alcolico-quant18_tot;
						quant13_tot=quant13;
					}
					
					if(quant19_tot!=0)
					{
						quant13=caffe+sandwich+succo+bibita+acqua+alcolico-quant19_tot;
						quant13_tot=quant13;
					}
					
					if(quant20_tot!=0)
					{
						quant13=caffe+sandwich+succo+bibita+acqua+alcolico-quant20_tot;
						quant13_tot=quant13;
					}
					
					else
					{
						quant13=caffe+sandwich+succo+bibita+acqua+alcolico;
						quant13_tot=quant13;
					}
				}
				
				if(num==14)
				{
					if(quant1_tot!=0)
					{
						quant14=caffe+sandwich+succo+bibita+acqua+alcolico-quant1_tot;
						quant14_tot=quant14;
					}
					
					if(quant2_tot!=0)
					{
						quant14=caffe+sandwich+succo+bibita+acqua+alcolico-quant2_tot;
						quant14_tot=quant14;
					}
					
					if(quant3_tot!=0)
					{
						quant14=caffe+sandwich+succo+bibita+acqua+alcolico-quant3_tot;
						quant14_tot=quant14;
					}
					
					if(quant4_tot!=0)
					{
						quant14=caffe+sandwich+succo+bibita+acqua+alcolico-quant4_tot;
						quant14_tot=quant14;
					}
									
					if(quant5_tot!=0)
					{
						quant14=caffe+sandwich+succo+bibita+acqua+alcolico-quant5_tot;
						quant14_tot=quant14;
					}
					
					if(quant6_tot!=0)
					{
						quant14=caffe+sandwich+succo+bibita+acqua+alcolico-quant6_tot;
						quant14_tot=quant14;
					}
					
					if(quant7_tot!=0)
					{
						quant14=caffe+sandwich+succo+bibita+acqua+alcolico-quant7_tot;
						quant14_tot=quant14;
					}
					
					
					if(quant8_tot!=0)
					{
						quant14=caffe+sandwich+succo+bibita+acqua+alcolico-quant8_tot;
						quant14_tot=quant14;
					}
					
					if(quant9_tot!=0)
					{
						quant14=caffe+sandwich+succo+bibita+acqua+alcolico-quant9_tot;
						quant14_tot=quant14;
					}
					
					if(quant10_tot!=0)
					{
						quant14=caffe+sandwich+succo+bibita+acqua+alcolico-quant10_tot;
						quant14_tot=quant14;
					}
					
					if(quant11_tot!=0)
					{
						quant14=caffe+sandwich+succo+bibita+acqua+alcolico-quant11_tot;
						quant14_tot=quant14;
					}
					
					if(quant12_tot!=0)
					{
						quant14=caffe+sandwich+succo+bibita+acqua+alcolico-quant12_tot;
						quant14_tot=quant14;
					}
					
					if(quant13_tot!=0)
					{
						quant14=caffe+sandwich+succo+bibita+acqua+alcolico-quant13_tot;
						quant14_tot=quant14;
					}
					
					if(quant15_tot!=0)
					{
						quant14=caffe+sandwich+succo+bibita+acqua+alcolico-quant15_tot;
						quant14_tot=quant14;
					}
					
					if(quant16_tot!=0)
					{
						quant14=caffe+sandwich+succo+bibita+acqua+alcolico-quant16_tot;
						quant14_tot=quant14;
					}
					
					if(quant17_tot!=0)
					{
						quant14=caffe+sandwich+succo+bibita+acqua+alcolico-quant17_tot;
						quant14_tot=quant14;
					}
					
					if(quant18_tot!=0)
					{
						quant14=caffe+sandwich+succo+bibita+acqua+alcolico-quant18_tot;
						quant14_tot=quant14;
					}
					
					if(quant19_tot!=0)
					{
						quant14=caffe+sandwich+succo+bibita+acqua+alcolico-quant19_tot;
						quant14_tot=quant14;
					}
					
					if(quant20_tot!=0)
					{
						quant14=caffe+sandwich+succo+bibita+acqua+alcolico-quant20_tot;
						quant14_tot=quant14;
					}
					
					else
					{
						quant14=caffe+sandwich+succo+bibita+acqua+alcolico;
						quant14_tot=quant14;
					}
				}
				
				if(num==15)
				{
					if(quant1_tot!=0)
					{
						quant15=caffe+sandwich+succo+bibita+acqua+alcolico-quant1_tot;
						quant15_tot=quant15;
					}
					
					if(quant2_tot!=0)
					{
						quant15=caffe+sandwich+succo+bibita+acqua+alcolico-quant2_tot;
						quant15_tot=quant15;
					}
					
					if(quant3_tot!=0)
					{
						quant15=caffe+sandwich+succo+bibita+acqua+alcolico-quant3_tot;
						quant15_tot=quant15;
					}
					
					if(quant4_tot!=0)
					{
						quant15=caffe+sandwich+succo+bibita+acqua+alcolico-quant4_tot;
						quant15_tot=quant15;
					}
									
					if(quant5_tot!=0)
					{
						quant15=caffe+sandwich+succo+bibita+acqua+alcolico-quant5_tot;
						quant15_tot=quant15;
					}
					
					if(quant6_tot!=0)
					{
						quant15=caffe+sandwich+succo+bibita+acqua+alcolico-quant6_tot;
						quant15_tot=quant15;
					}
					
					if(quant7_tot!=0)
					{
						quant15=caffe+sandwich+succo+bibita+acqua+alcolico-quant7_tot;
						quant15_tot=quant15;
					}
					
					
					if(quant8_tot!=0)
					{
						quant15=caffe+sandwich+succo+bibita+acqua+alcolico-quant8_tot;
						quant15_tot=quant15;
					}
					
					if(quant9_tot!=0)
					{
						quant15=caffe+sandwich+succo+bibita+acqua+alcolico-quant9_tot;
						quant15_tot=quant15;
					}
					
					if(quant10_tot!=0)
					{
						quant15=caffe+sandwich+succo+bibita+acqua+alcolico-quant10_tot;
						quant15_tot=quant15;
					}
					
					if(quant11_tot!=0)
					{
						quant15=caffe+sandwich+succo+bibita+acqua+alcolico-quant11_tot;
						quant15_tot=quant15;
					}
					
					if(quant12_tot!=0)
					{
						quant15=caffe+sandwich+succo+bibita+acqua+alcolico-quant12_tot;
						quant15_tot=quant15;
					}
					
					if(quant13_tot!=0)
					{
						quant15=caffe+sandwich+succo+bibita+acqua+alcolico-quant13_tot;
						quant15_tot=quant15;
					}
					
					if(quant14_tot!=0)
					{
						quant15=caffe+sandwich+succo+bibita+acqua+alcolico-quant14_tot;
						quant15_tot=quant15;
					}
					
					if(quant16_tot!=0)
					{
						quant15=caffe+sandwich+succo+bibita+acqua+alcolico-quant16_tot;
						quant15_tot=quant15;
					}
					
					if(quant17_tot!=0)
					{
						quant15=caffe+sandwich+succo+bibita+acqua+alcolico-quant17_tot;
						quant15_tot=quant15;
					}
					
					if(quant18_tot!=0)
					{
						quant15=caffe+sandwich+succo+bibita+acqua+alcolico-quant18_tot;
						quant15_tot=quant15;
					}
					
					if(quant19_tot!=0)
					{
						quant15=caffe+sandwich+succo+bibita+acqua+alcolico-quant19_tot;
						quant15_tot=quant15;
					}
					
					if(quant20_tot!=0)
					{
						quant15=caffe+sandwich+succo+bibita+acqua+alcolico-quant20_tot;
						quant15_tot=quant15;
					}
					
					else
					{
						quant15=caffe+sandwich+succo+bibita+acqua+alcolico;
						quant15_tot=quant15;
					}
				}
				
				if(num==16)
				{
					if(quant1_tot!=0)
					{
						quant16=caffe+sandwich+succo+bibita+acqua+alcolico-quant1_tot;
						quant16_tot=quant16;
					}
					
					if(quant2_tot!=0)
					{
						quant16=caffe+sandwich+succo+bibita+acqua+alcolico-quant2_tot;
						quant16_tot=quant16;
					}
					
					if(quant3_tot!=0)
					{
						quant16=caffe+sandwich+succo+bibita+acqua+alcolico-quant3_tot;
						quant16_tot=quant16;
					}
					
					if(quant4_tot!=0)
					{
						quant16=caffe+sandwich+succo+bibita+acqua+alcolico-quant4_tot;
						quant16_tot=quant16;
					}
									
					if(quant5_tot!=0)
					{
						quant16=caffe+sandwich+succo+bibita+acqua+alcolico-quant5_tot;
						quant16_tot=quant16;
					}
					
					if(quant6_tot!=0)
					{
						quant16=caffe+sandwich+succo+bibita+acqua+alcolico-quant6_tot;
						quant16_tot=quant16;
					}
					
					if(quant7_tot!=0)
					{
						quant16=caffe+sandwich+succo+bibita+acqua+alcolico-quant7_tot;
						quant16_tot=quant16;
					}
					
					
					if(quant8_tot!=0)
					{
						quant16=caffe+sandwich+succo+bibita+acqua+alcolico-quant8_tot;
						quant16_tot=quant16;
					}
					
					if(quant9_tot!=0)
					{
						quant16=caffe+sandwich+succo+bibita+acqua+alcolico-quant9_tot;
						quant16_tot=quant16;
					}
					
					if(quant10_tot!=0)
					{
						quant16=caffe+sandwich+succo+bibita+acqua+alcolico-quant10_tot;
						quant16_tot=quant16;
					}
					
					if(quant11_tot!=0)
					{
						quant16=caffe+sandwich+succo+bibita+acqua+alcolico-quant11_tot;
						quant16_tot=quant16;
					}
					
					if(quant12_tot!=0)
					{
						quant16=caffe+sandwich+succo+bibita+acqua+alcolico-quant12_tot;
						quant16_tot=quant16;
					}
					
					if(quant13_tot!=0)
					{
						quant16=caffe+sandwich+succo+bibita+acqua+alcolico-quant13_tot;
						quant16_tot=quant16;
					}
					
					if(quant14_tot!=0)
					{
						quant16=caffe+sandwich+succo+bibita+acqua+alcolico-quant14_tot;
						quant16_tot=quant16;
					}
					
					if(quant15_tot!=0)
					{
						quant16=caffe+sandwich+succo+bibita+acqua+alcolico-quant15_tot;
						quant16_tot=quant16;
					}
					
					if(quant17_tot!=0)
					{
						quant16=caffe+sandwich+succo+bibita+acqua+alcolico-quant17_tot;
						quant16_tot=quant16;
					}
					
					if(quant18_tot!=0)
					{
						quant16=caffe+sandwich+succo+bibita+acqua+alcolico-quant18_tot;
						quant16_tot=quant16;
					}
					
					if(quant19_tot!=0)
					{
						quant16=caffe+sandwich+succo+bibita+acqua+alcolico-quant19_tot;
						quant16_tot=quant16;
					}
					
					if(quant20_tot!=0)
					{
						quant16=caffe+sandwich+succo+bibita+acqua+alcolico-quant20_tot;
						quant16_tot=quant16;
					}
					
					else
					{
						quant16=caffe+sandwich+succo+bibita+acqua+alcolico;
						quant16_tot=quant16;
					}
				}
				
				if(num==17)
				{
					if(quant1_tot!=0)
					{
						quant17=caffe+sandwich+succo+bibita+acqua+alcolico-quant1_tot;
						quant17_tot=quant17;
					}
					
					if(quant2_tot!=0)
					{
						quant17=caffe+sandwich+succo+bibita+acqua+alcolico-quant2_tot;
						quant17_tot=quant17;
					}
					
					if(quant3_tot!=0)
					{
						quant17=caffe+sandwich+succo+bibita+acqua+alcolico-quant3_tot;
						quant17_tot=quant17;
					}
					
					if(quant4_tot!=0)
					{
						quant17=caffe+sandwich+succo+bibita+acqua+alcolico-quant4_tot;
						quant17_tot=quant17;
					}
									
					if(quant5_tot!=0)
					{
						quant17=caffe+sandwich+succo+bibita+acqua+alcolico-quant5_tot;
						quant17_tot=quant17;
					}
					
					if(quant6_tot!=0)
					{
						quant17=caffe+sandwich+succo+bibita+acqua+alcolico-quant6_tot;
						quant17_tot=quant17;
					}
					
					if(quant7_tot!=0)
					{
						quant17=caffe+sandwich+succo+bibita+acqua+alcolico-quant7_tot;
						quant17_tot=quant17;
					}
					
					if(quant8_tot!=0)
					{
						quant17=caffe+sandwich+succo+bibita+acqua+alcolico-quant8_tot;
						quant17_tot=quant17;
					}
					
					if(quant9_tot!=0)
					{
						quant17=caffe+sandwich+succo+bibita+acqua+alcolico-quant9_tot;
						quant17_tot=quant17;
					}
					
					if(quant10_tot!=0)
					{
						quant17=caffe+sandwich+succo+bibita+acqua+alcolico-quant10_tot;
						quant17_tot=quant17;
					}
					
					if(quant11_tot!=0)
					{
						quant17=caffe+sandwich+succo+bibita+acqua+alcolico-quant11_tot;
						quant17_tot=quant17;
					}
					
					if(quant12_tot!=0)
					{
						quant17=caffe+sandwich+succo+bibita+acqua+alcolico-quant12_tot;
						quant17_tot=quant17;
					}
					
					if(quant13_tot!=0)
					{
						quant17=caffe+sandwich+succo+bibita+acqua+alcolico-quant13_tot;
						quant17_tot=quant17;
					}
					
					if(quant14_tot!=0)
					{
						quant17=caffe+sandwich+succo+bibita+acqua+alcolico-quant14_tot;
						quant17_tot=quant17;
					}
					
					if(quant15_tot!=0)
					{
						quant17=caffe+sandwich+succo+bibita+acqua+alcolico-quant15_tot;
						quant17_tot=quant17;
					}
					
					if(quant16_tot!=0)
					{
						quant17=caffe+sandwich+succo+bibita+acqua+alcolico-quant16_tot;
						quant17_tot=quant17;
					}
					
					if(quant18_tot!=0)
					{
						quant17=caffe+sandwich+succo+bibita+acqua+alcolico-quant18_tot;
						quant17_tot=quant17;
					}
					
					if(quant19_tot!=0)
					{
						quant17=caffe+sandwich+succo+bibita+acqua+alcolico-quant19_tot;
						quant17_tot=quant17;
					}
					
					if(quant20_tot!=0)
					{
						quant17=caffe+sandwich+succo+bibita+acqua+alcolico-quant20_tot;
						quant17_tot=quant17;
					}
					
					else
					{
						quant17=caffe+sandwich+succo+bibita+acqua+alcolico;
						quant17_tot=quant17;
					}
				}
				
				if(num==18)
				{
					if(quant1_tot!=0)
					{
						quant18=caffe+sandwich+succo+bibita+acqua+alcolico-quant1_tot;
						quant18_tot=quant18;
					}
					
					if(quant2_tot!=0)
					{
						quant18=caffe+sandwich+succo+bibita+acqua+alcolico-quant2_tot;
						quant18_tot=quant18;
					}
					
					if(quant3_tot!=0)
					{
						quant18=caffe+sandwich+succo+bibita+acqua+alcolico-quant3_tot;
						quant18_tot=quant18;
					}
					
					if(quant4_tot!=0)
					{
						quant18=caffe+sandwich+succo+bibita+acqua+alcolico-quant4_tot;
						quant18_tot=quant18;
					}
									
					if(quant5_tot!=0)
					{
						quant18=caffe+sandwich+succo+bibita+acqua+alcolico-quant5_tot;
						quant18_tot=quant18;
					}
					
					if(quant6_tot!=0)
					{
						quant18=caffe+sandwich+succo+bibita+acqua+alcolico-quant6_tot;
						quant18_tot=quant18;
					}
					
					if(quant7_tot!=0)
					{
						quant18=caffe+sandwich+succo+bibita+acqua+alcolico-quant7_tot;
						quant18_tot=quant18;
					}
					
					if(quant8_tot!=0)
					{
						quant18=caffe+sandwich+succo+bibita+acqua+alcolico-quant8_tot;
						quant18_tot=quant18;
					}
					
					if(quant9_tot!=0)
					{
						quant18=caffe+sandwich+succo+bibita+acqua+alcolico-quant9_tot;
						quant18_tot=quant18;
					}
					
					if(quant10_tot!=0)
					{
						quant18=caffe+sandwich+succo+bibita+acqua+alcolico-quant10_tot;
						quant18_tot=quant18;
					}
					
					if(quant11_tot!=0)
					{
						quant18=caffe+sandwich+succo+bibita+acqua+alcolico-quant11_tot;
						quant18_tot=quant18;
					}
					
					if(quant12_tot!=0)
					{
						quant18=caffe+sandwich+succo+bibita+acqua+alcolico-quant12_tot;
						quant18_tot=quant18;
					}
					
					if(quant13_tot!=0)
					{
						quant18=caffe+sandwich+succo+bibita+acqua+alcolico-quant13_tot;
						quant18_tot=quant18;
					}
					
					if(quant14_tot!=0)
					{
						quant18=caffe+sandwich+succo+bibita+acqua+alcolico-quant14_tot;
						quant18_tot=quant18;
					}
					
					if(quant15_tot!=0)
					{
						quant18=caffe+sandwich+succo+bibita+acqua+alcolico-quant15_tot;
						quant18_tot=quant18;
					}
					
					if(quant16_tot!=0)
					{
						quant18=caffe+sandwich+succo+bibita+acqua+alcolico-quant16_tot;
						quant18_tot=quant18;
					}
					
					if(quant17_tot!=0)
					{
						quant18=caffe+sandwich+succo+bibita+acqua+alcolico-quant17_tot;
						quant18_tot=quant18;
					}
					
					if(quant19_tot!=0)
					{
						quant18=caffe+sandwich+succo+bibita+acqua+alcolico-quant19_tot;
						quant18_tot=quant18;
					}
					
					if(quant20_tot!=0)
					{
						quant18=caffe+sandwich+succo+bibita+acqua+alcolico-quant20_tot;
						quant18_tot=quant18;
					}
					
					else
					{
						quant18=caffe+sandwich+succo+bibita+acqua+alcolico;
						quant18_tot=quant18;
					}
				}
				
				if(num==19)
				{
					if(quant1_tot!=0)
					{
						quant19=caffe+sandwich+succo+bibita+acqua+alcolico-quant1_tot;
						quant19_tot=quant19;
					}
					
					if(quant2_tot!=0)
					{
						quant19=caffe+sandwich+succo+bibita+acqua+alcolico-quant2_tot;
						quant19_tot=quant19;
					}
					
					if(quant3_tot!=0)
					{
						quant19=caffe+sandwich+succo+bibita+acqua+alcolico-quant3_tot;
						quant19_tot=quant19;
					}
					
					if(quant4_tot!=0)
					{
						quant19=caffe+sandwich+succo+bibita+acqua+alcolico-quant4_tot;
						quant19_tot=quant19;
					}
									
					if(quant5_tot!=0)
					{
						quant19=caffe+sandwich+succo+bibita+acqua+alcolico-quant5_tot;
						quant19_tot=quant19;
					}
					
					if(quant6_tot!=0)
					{
						quant19=caffe+sandwich+succo+bibita+acqua+alcolico-quant6_tot;
						quant19_tot=quant19;
					}
					
					if(quant7_tot!=0)
					{
						quant19=caffe+sandwich+succo+bibita+acqua+alcolico-quant7_tot;
						quant19_tot=quant19;
					}
					
					if(quant8_tot!=0)
					{
						quant19=caffe+sandwich+succo+bibita+acqua+alcolico-quant8_tot;
						quant19_tot=quant19;
					}
					
					if(quant9_tot!=0)
					{
						quant19=caffe+sandwich+succo+bibita+acqua+alcolico-quant9_tot;
						quant19_tot=quant19;
					}
					
					if(quant10_tot!=0)
					{
						quant19=caffe+sandwich+succo+bibita+acqua+alcolico-quant10_tot;
						quant19_tot=quant19;
					}
					
					if(quant11_tot!=0)
					{
						quant19=caffe+sandwich+succo+bibita+acqua+alcolico-quant11_tot;
						quant19_tot=quant19;
					}
					
					if(quant12_tot!=0)
					{
						quant19=caffe+sandwich+succo+bibita+acqua+alcolico-quant12_tot;
						quant19_tot=quant19;
					}
					
					if(quant13_tot!=0)
					{
						quant19=caffe+sandwich+succo+bibita+acqua+alcolico-quant13_tot;
						quant19_tot=quant19;
					}
					
					if(quant14_tot!=0)
					{
						quant19=caffe+sandwich+succo+bibita+acqua+alcolico-quant14_tot;
						quant19_tot=quant19;
					}
					
					if(quant15_tot!=0)
					{
						quant19=caffe+sandwich+succo+bibita+acqua+alcolico-quant15_tot;
						quant19_tot=quant19;
					}
					
					if(quant16_tot!=0)
					{
						quant19=caffe+sandwich+succo+bibita+acqua+alcolico-quant16_tot;
						quant19_tot=quant19;
					}
					
					if(quant17_tot!=0)
					{
						quant19=caffe+sandwich+succo+bibita+acqua+alcolico-quant17_tot;
						quant19_tot=quant19;
					}
					
					if(quant18_tot!=0)
					{
						quant19=caffe+sandwich+succo+bibita+acqua+alcolico-quant18_tot;
						quant19_tot=quant19;
					}
					
					if(quant20_tot!=0)
					{
						quant19=caffe+sandwich+succo+bibita+acqua+alcolico-quant20_tot;
						quant19_tot=quant19;
					}
					
					else
					{
						quant19=caffe+sandwich+succo+bibita+acqua+alcolico;
						quant19_tot=quant19;
					}
				}
				
				if(num==20)
				{
					if(quant1_tot!=0)
					{
						quant20=caffe+sandwich+succo+bibita+acqua+alcolico-quant1_tot;
						quant20_tot=quant20;
					}
					
					if(quant2_tot!=0)
					{
						quant20=caffe+sandwich+succo+bibita+acqua+alcolico-quant2_tot;
						quant20_tot=quant20;
					}
					
					if(quant3_tot!=0)
					{
						quant20=caffe+sandwich+succo+bibita+acqua+alcolico-quant3_tot;
						quant20_tot=quant20;
					}
					
					if(quant4_tot!=0)
					{
						quant20=caffe+sandwich+succo+bibita+acqua+alcolico-quant4_tot;
						quant20_tot=quant20;
					}
									
					if(quant5_tot!=0)
					{
						quant20=caffe+sandwich+succo+bibita+acqua+alcolico-quant5_tot;
						quant20_tot=quant20;
					}
					
					if(quant6_tot!=0)
					{
						quant20=caffe+sandwich+succo+bibita+acqua+alcolico-quant6_tot;
						quant20_tot=quant20;
					}
					
					if(quant7_tot!=0)
					{
						quant20=caffe+sandwich+succo+bibita+acqua+alcolico-quant7_tot;
						quant20_tot=quant20;
					}
					
					if(quant8_tot!=0)
					{
						quant20=caffe+sandwich+succo+bibita+acqua+alcolico-quant8_tot;
						quant20_tot=quant20;
					}
					
					if(quant9_tot!=0)
					{
						quant20=caffe+sandwich+succo+bibita+acqua+alcolico-quant9_tot;
						quant20_tot=quant20;
					}
					
					if(quant10_tot!=0)
					{
						quant20=caffe+sandwich+succo+bibita+acqua+alcolico-quant10_tot;
						quant20_tot=quant20;
					}
					
					if(quant11_tot!=0)
					{
						quant20=caffe+sandwich+succo+bibita+acqua+alcolico-quant11_tot;
						quant20_tot=quant20;
					}
					
					if(quant12_tot!=0)
					{
						quant20=caffe+sandwich+succo+bibita+acqua+alcolico-quant12_tot;
						quant20_tot=quant20;
					}
					
					if(quant13_tot!=0)
					{
						quant20=caffe+sandwich+succo+bibita+acqua+alcolico-quant13_tot;
						quant20_tot=quant20;
					}
					
					if(quant14_tot!=0)
					{
						quant20=caffe+sandwich+succo+bibita+acqua+alcolico-quant14_tot;
						quant20_tot=quant20;
					}
					
					if(quant15_tot!=0)
					{
						quant20=caffe+sandwich+succo+bibita+acqua+alcolico-quant15_tot;
						quant20_tot=quant20;
					}
					
					if(quant16_tot!=0)
					{
						quant20=caffe+sandwich+succo+bibita+acqua+alcolico-quant16_tot;
						quant20_tot=quant20;
					}
					
					if(quant17_tot!=0)
					{
						quant20=caffe+sandwich+succo+bibita+acqua+alcolico-quant17_tot;
						quant20_tot=quant20;
					}
					
					if(quant18_tot!=0)
					{
						quant20=caffe+sandwich+succo+bibita+acqua+alcolico-quant18_tot;
						quant20_tot=quant20;
					}
					
					if(quant19_tot!=0)
					{
						quant20=caffe+sandwich+succo+bibita+acqua+alcolico-quant19_tot;
						quant20_tot=quant20;
					}
					
					else
					{
						quant20=caffe+sandwich+succo+bibita+acqua+alcolico;
						quant20_tot=quant20;
					}
				}
				
				TextArea_preview.setText("");
				for(i=0;i<cont;i++) //Mostra gli ordini
				{
					TextArea_servi.append(vett_nome[i] + "\n");
				}
				
			}
		}
		}
		invia inv = new invia();
		Btn_invia.addActionListener(inv);
		
		//RESET
		class reset implements ActionListener {
			public void actionPerformed(ActionEvent arg0) {
				//Resetto tutte le variabili
				cont_caffe=0;
				cont_sandwich=0;
				cont_succo=0;
				cont_bibita=0;
				cont_acqua=0;
				cont_alcolico=0;
				caffe=0;
				sandwich=0;
				succo=0;
				bibita=0;
				acqua=0;
				alcolico=0;
				spin=0;
				riserva_caffe=0;
				riserva_sandwich=0;
				riserva_succo=0;
				riserva_bibita=0;
				riserva_acqua=0;
				riserva_alcolico=0;
				TextArea_preview.setText("");
				//Resetto i vettori prezzo e nomi cibi
				for(i=0;i<cont;i++)
				{
					vett_nome[i]="";
					vett_prezzo[i]=0;
				}
				cont=0;
				i=0;
			}
		}
		reset res = new reset();
		Btn_reset.addActionListener(res);
		
		//SERVIZIO
		class servi implements ActionListener {
			public void actionPerformed(ActionEvent arg0) {
				int sel= (int) ComboBox_inizio.getSelectedItem();
				c=sel;
				JOptionPane.showMessageDialog(Popup,"Servita al tavolo: " + c , "Ordinazione servita", JOptionPane.INFORMATION_MESSAGE);
				//Elimino il nome del cibo dalla textarea
				a=0;
				for (i=0;i<cont;i++)
				{
					vett_nome[i]=vett_nome[i+1];
					
				}
				cont=cont-1;
				vett_nome[cont]="";
				TextArea_servi.setText(vett_nome[a] + "\n" );
			    for (i=1;i<cont;i++)
			    {
			    	TextArea_servi.append(vett_nome[i] + "\n" );
			    }
			}
		}
		servi ser = new servi();
		Btn_servi.addActionListener(ser);
		
		//TOTALE
		class totale implements ActionListener {
			public void actionPerformed(ActionEvent arg0) {
				int sel= (int) ComboBox_totale.getSelectedItem();
				tot=sel;
				
				//incasso giornata
				String inc= String.valueOf(caffe+sandwich+succo+bibita+acqua+alcolico + " €");
				TextArea_giornata.setText(inc);
				
				int vr =Integer.parseInt(""+spinner.getValue()); //Calcolo il prezzo per persona
				String va= String.valueOf((caffe+sandwich+succo+bibita+acqua+alcolico)/vr + "€");
				TextArea_persona.setText(va);
		
				if(TextArea_servi.getText()!="")
				{
					Btn_servi.setEnabled(false);
					TextArea_servi.setText("");
				}
				//VISUALIZZO L'INCASSO TOTALE E I COPERTI PER OGNI TAVOLO
				if(tot==1)
				{
					if(quant1_tot==0)
					{
						JOptionPane.showMessageDialog(Popup,"Nessun ordinazione per questo tavolo", "Tavolo vuoto!", JOptionPane.INFORMATION_MESSAGE);
						TextArea_tavolo.setText("");
						TextArea_persona.setText("");
					}
					else
					{
						String q1= String.valueOf(quant1 + "€");
						TextArea_tavolo.setText(q1);
					}
					
				}
				
				if(tot==2)
				{
					if(quant2_tot==0)
					{
						JOptionPane.showMessageDialog(Popup,"Nessun ordinazione per questo tavolo", "Tavolo vuoto!", JOptionPane.INFORMATION_MESSAGE);
						TextArea_tavolo.setText("");
						TextArea_persona.setText("");
					}
					else
					{
						String q2= String.valueOf(quant2 + "€");
						TextArea_tavolo.setText(q2);
					}
					
				}
				
				if(tot==3)
				{
					if(quant3_tot==0)
					{
						JOptionPane.showMessageDialog(Popup,"Nessun ordinazione per questo tavolo", "Tavolo vuoto!", JOptionPane.INFORMATION_MESSAGE);
						TextArea_tavolo.setText("");
						TextArea_persona.setText("");
					}
					else
					{
						String q3= String.valueOf(quant3 + "€");
						TextArea_tavolo.setText(q3);
					}
					
				}
				
				if(tot==4)
				{
					if(quant4_tot==0)
					{
						JOptionPane.showMessageDialog(Popup,"Nessun ordinazione per questo tavolo", "Tavolo vuoto!", JOptionPane.INFORMATION_MESSAGE);
						TextArea_tavolo.setText("");
						TextArea_persona.setText("");
					}
					else
					{
						String q4= String.valueOf(quant4 + "€");
						TextArea_tavolo.setText(q4);
					}
					
				}
				
				if(tot==5)
				{
					if(quant5_tot==0)
					{
						JOptionPane.showMessageDialog(Popup,"Nessun ordinazione per questo tavolo", "Tavolo vuoto!", JOptionPane.INFORMATION_MESSAGE);
						TextArea_tavolo.setText("");
						TextArea_persona.setText("");
					}
					else
					{
						String q5= String.valueOf(quant5 + "€");
						TextArea_tavolo.setText(q5);
					}
					
				}
				
				if(tot==6)
				{
					if(quant6_tot==0)
					{
						JOptionPane.showMessageDialog(Popup,"Nessun ordinazione per questo tavolo", "Tavolo vuoto!", JOptionPane.INFORMATION_MESSAGE);
						TextArea_tavolo.setText("");
						TextArea_persona.setText("");
					}
					else
					{
						String q6= String.valueOf(quant6 + "€");
						TextArea_tavolo.setText(q6);
					}
					
				}
				
				if(tot==7)
				{
					if(quant7_tot==0)
					{
						JOptionPane.showMessageDialog(Popup,"Nessun ordinazione per questo tavolo", "Tavolo vuoto!", JOptionPane.INFORMATION_MESSAGE);
						TextArea_tavolo.setText("");
						TextArea_persona.setText("");
					}
					else
					{
						String q7= String.valueOf(quant7 + "€");
						TextArea_tavolo.setText(q7);
					}
					
				}
				
				if(tot==8)
				{
					if(quant8_tot==0)
					{
						JOptionPane.showMessageDialog(Popup,"Nessun ordinazione per questo tavolo", "Tavolo vuoto!", JOptionPane.INFORMATION_MESSAGE);
						TextArea_tavolo.setText("");
						TextArea_persona.setText("");
					}
					else
					{
						String q8= String.valueOf(quant8 + "€");
						TextArea_tavolo.setText(q8);
					}
					
				}
				
				if(tot==9)
				{
					if(quant9_tot==0)
					{
						JOptionPane.showMessageDialog(Popup,"Nessun ordinazione per questo tavolo", "Tavolo vuoto!", JOptionPane.INFORMATION_MESSAGE);
						TextArea_tavolo.setText("");
						TextArea_persona.setText("");
					}
					else
					{
						String q9= String.valueOf(quant9 + "€");
						TextArea_tavolo.setText(q9);
					}
					
				}
				
				if(tot==10)
				{
					if(quant10_tot==0)
					{
						JOptionPane.showMessageDialog(Popup,"Nessun ordinazione per questo tavolo", "Tavolo vuoto!", JOptionPane.INFORMATION_MESSAGE);
						TextArea_tavolo.setText("");
						TextArea_persona.setText("");
					}
					else
					{
						String q10= String.valueOf(quant10 + "€");
						TextArea_tavolo.setText(q10);
					}
					
				}
				
				if(tot==11)
				{
					if(quant11_tot==0)
					{
						JOptionPane.showMessageDialog(Popup,"Nessun ordinazione per questo tavolo", "Tavolo vuoto!", JOptionPane.INFORMATION_MESSAGE);
						TextArea_tavolo.setText("");
						TextArea_persona.setText("");
					}
					else
					{
						String q11= String.valueOf(quant11 + "€");
						TextArea_tavolo.setText(q11);
					}
					
				}
				
				if(tot==12)
				{
					if(quant12_tot==0)
					{
						JOptionPane.showMessageDialog(Popup,"Nessun ordinazione per questo tavolo", "Tavolo vuoto!", JOptionPane.INFORMATION_MESSAGE);
						TextArea_tavolo.setText("");
						TextArea_persona.setText("");
					}
					else
					{
						String q12= String.valueOf(quant12 + "€");
						TextArea_tavolo.setText(q12);
					}
					
				}
				
				if(tot==13)
				{
					if(quant13_tot==0)
					{
						JOptionPane.showMessageDialog(Popup,"Nessun ordinazione per questo tavolo", "Tavolo vuoto!", JOptionPane.INFORMATION_MESSAGE);
						TextArea_tavolo.setText("");
						TextArea_persona.setText("");
					}
					else
					{
						String q13= String.valueOf(quant13 + "€");
						TextArea_tavolo.setText(q13);
					}
					
				}
				
				if(tot==14)
				{
					if(quant14_tot==0)
					{
						JOptionPane.showMessageDialog(Popup,"Nessun ordinazione per questo tavolo", "Tavolo vuoto!", JOptionPane.INFORMATION_MESSAGE);
						TextArea_tavolo.setText("");
						TextArea_persona.setText("");
					}
					else
					{
						String q14= String.valueOf(quant14 + "€");
						TextArea_tavolo.setText(q14);
					}
					
				}
				
				if(tot==15)
				{
					if(quant15_tot==0)
					{
						JOptionPane.showMessageDialog(Popup,"Nessun ordinazione per questo tavolo", "Tavolo vuoto!", JOptionPane.INFORMATION_MESSAGE);
						TextArea_tavolo.setText("");
						TextArea_persona.setText("");
					}
					else
					{
						String q15= String.valueOf(quant15 + "€");
						TextArea_tavolo.setText(q15);
					}
					
				}
				
				if(tot==16)
				{
					if(quant16_tot==0)
					{
						JOptionPane.showMessageDialog(Popup,"Nessun ordinazione per questo tavolo", "Tavolo vuoto!", JOptionPane.INFORMATION_MESSAGE);
						TextArea_tavolo.setText("");
						TextArea_persona.setText("");
					}
					else
					{
						String q16= String.valueOf(quant16 + "€");
						TextArea_tavolo.setText(q16);
					}
					
				}
				
				if(tot==17)
				{
					if(quant17_tot==0)
					{
						JOptionPane.showMessageDialog(Popup,"Nessun ordinazione per questo tavolo", "Tavolo vuoto!", JOptionPane.INFORMATION_MESSAGE);
						TextArea_tavolo.setText("");
						TextArea_persona.setText("");
					}
					else
					{
						String q17= String.valueOf(quant17 + "€");
						TextArea_tavolo.setText(q17);
					}
					
				}
				
				if(tot==18)
				{
					if(quant18_tot==0)
					{
						JOptionPane.showMessageDialog(Popup,"Nessun ordinazione per questo tavolo", "Tavolo vuoto!", JOptionPane.INFORMATION_MESSAGE);
						TextArea_tavolo.setText("");
						TextArea_persona.setText("");
					}
					else
					{
						String q18= String.valueOf(quant18 + "€");
						TextArea_tavolo.setText(q18);
					}
					
				}
				
				if(tot==19)
				{
					if(quant19_tot==0)
					{
						JOptionPane.showMessageDialog(Popup,"Nessun ordinazione per questo tavolo", "Tavolo vuoto!", JOptionPane.INFORMATION_MESSAGE);
						TextArea_tavolo.setText("");
						TextArea_persona.setText("");
					}
					else
					{
						String q19= String.valueOf(quant19 + "€");
						TextArea_tavolo.setText(q19);
					}
					
				}
				
				if(tot==20)
				{
					if(quant20_tot==0)
					{
						JOptionPane.showMessageDialog(Popup,"Nessun ordinazione per questo tavolo", "Tavolo vuoto!", JOptionPane.INFORMATION_MESSAGE);
						TextArea_tavolo.setText("");
						TextArea_persona.setText("");
					}
					else
					{
						String q20= String.valueOf(quant20 + "€");
						TextArea_tavolo.setText(q20);
					}
					
				}
			}
		}
		totale tav = new totale();
		Btn_totale.addActionListener(tav);
		
		//CHIUDI CASSA
		class cassa implements ActionListener {
			public void actionPerformed(ActionEvent arg0) {
				String ic= String.valueOf(caffe+sandwich+succo+bibita+acqua+alcolico + " €");
				TextArea_incasso.setText(ic);
				
				
				String str= String.valueOf(posti);
				TextArea_coperti.setText(str);
				
				for(i=0;i<cont;i++)
				{
					vett_prezzo[i]=caffe+sandwich+succo+bibita+acqua+alcolico; //Associo al vettore il prezzo totale di tutti i cibi (e lui sommerà solamente quelli che sono stati selezionati nella sezione Ordinazione)
					String som= String.valueOf(vett_prezzo[i] + " €");
					TextArea_incasso.setText(som);
				}
				//Deseleziono i pulsanti e elimino il contenuto delle textarea
				Btn_caffe.setEnabled(false);
				Btn_sandwich.setEnabled(false);
				Btn_succo.setEnabled(false);
				Btn_bibita.setEnabled(false);
				Btn_acqua.setEnabled(false);
				Btn_alcolico.setEnabled(false);
				Btn_reset.setEnabled(false);
				Btn_invia.setEnabled(false);
				Btn_totale.setEnabled(false);
				Btn_servi.setEnabled(false);
				spinner.setEnabled(false);
				ComboBox_inizio.setEnabled(false);
				ComboBox_totale.setEnabled(false);
				Btn_cassa.setEnabled(false);
				Btn_apri.setEnabled(true);
				
				TextArea_cassa.setText("");
				TextArea_preview.setText("");
				TextArea_servi.setText("");
				TextArea_tavolo.setText("");
				
				//TextArea_coperti.setText("");
				TextArea_persona.setText("");
				TextArea_giornata.setText("");
				TextArea_cassa.setText("VENDITE DEL GIORNO:"+ "\n" + "Caffè: " + cont_caffe + "\n" + "Sandwich: " + cont_sandwich + "\n" + "Succo: " + cont_succo + "\n" + "Bibita: " + cont_bibita + "\n" + "Acqua: " + cont_acqua + "\n" + "Alcolico: " + cont_alcolico);
				//Resetto tutte le variabili
				cont_caffe=0;
				cont_sandwich=0;
				cont_succo=0;
				cont_bibita=0;
				cont_acqua=0;
				cont_alcolico=0;
				caffe=0;
				sandwich=0;
				succo=0;
				bibita=0;
				acqua=0;
				alcolico=0;
				spin=0;
				riserva_caffe=0;
				riserva_sandwich=0;
				riserva_succo=0;
				riserva_bibita=0;
				riserva_acqua=0;
				riserva_alcolico=0;
				TextArea_preview.setText("");
				for(i=0;i<cont;i++)
				{
					vett_nome[i]="";
					vett_prezzo[i]=0;
				}
				cont=0;
				i=0;
				posti=0;
			}
		}
		cassa cas = new cassa();
		Btn_cassa.addActionListener(cas);
		
		//APRI CASSA
				class apri implements ActionListener {
					public void actionPerformed(ActionEvent arg0) {
						//Abilito i pulsanti deselezionati in chiudi cassa
						Btn_cassa.setEnabled(true);
						Btn_apri.setEnabled(false);
						Btn_caffe.setEnabled(true);
						Btn_sandwich.setEnabled(true);
						Btn_succo.setEnabled(true);
						Btn_bibita.setEnabled(true);
						Btn_acqua.setEnabled(true);
						Btn_alcolico.setEnabled(true);
						Btn_reset.setEnabled(false);
						Btn_invia.setEnabled(true);
						Btn_totale.setEnabled(true);
						Btn_servi.setEnabled(false);
						spinner.setEnabled(true);
						ComboBox_inizio.setEnabled(true);
						ComboBox_totale.setEnabled(true);
						TextArea_cassa.setText("");
						TextArea_preview.setText("");
						TextArea_servi.setText("");
						TextArea_tavolo.setText("");
						TextArea_incasso.setText("");
						TextArea_coperti.setText("");
						TextArea_persona.setText("");
						TextArea_giornata.setText("");
						Btn_invia.setEnabled(false);
					}
				}
				apri ap = new apri();
				Btn_apri.addActionListener(ap);
	}
}