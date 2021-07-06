package swing.gui.fatture;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GestionaleJFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldImporto;
	private JTextField textField;
	private JTextField textFieldFatture;
	private JTextField textFieldTotImporti;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GestionaleJFrame frame = new GestionaleJFrame();
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
	public GestionaleJFrame() {
		setTitle("Gestionale");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 488, 355);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textFieldImporto = new JTextField();
		textFieldImporto.setBounds(76, 54, 139, 25);
		contentPane.add(textFieldImporto);
		textFieldImporto.setColumns(10);
		
		JLabel lblData = new JLabel("data");
		lblData.setBounds(10, 23, 46, 14);
		contentPane.add(lblData);
		
		JLabel lblImporto = new JLabel("Importo");
		lblImporto.setBounds(10, 59, 46, 14);
		contentPane.add(lblImporto);
		
		JLabel lblDescrizione = new JLabel("Causale");
		lblDescrizione.setBounds(10, 132, 46, 14);
		contentPane.add(lblDescrizione);
		
		textField = new JTextField();
		textField.setBounds(76, 90, 139, 25);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblIntestatoA = new JLabel("Intestato a ");
		lblIntestatoA.setBounds(10, 95, 62, 14);
		contentPane.add(lblIntestatoA);
		
		JButton btnInserisci = new JButton("inserisci");
		btnInserisci.setBounds(76, 183, 89, 23);
		contentPane.add(btnInserisci);
		
		JLabel lblFattureInserite = new JLabel("Fatture inserite:");
		lblFattureInserite.setBounds(245, 23, 89, 14);
		contentPane.add(lblFattureInserite);
		
		JLabel lblTotaleImporti = new JLabel("Totale importi:");
		lblTotaleImporti.setBounds(245, 59, 77, 14);
		contentPane.add(lblTotaleImporti);
		
		textFieldFatture = new JTextField();
		textFieldFatture.setEditable(false);
		textFieldFatture.setBounds(387, 20, 71, 20);
		contentPane.add(textFieldFatture);
		textFieldFatture.setColumns(10);
		
		textFieldTotImporti = new JTextField();
		textFieldTotImporti.setEditable(false);
		textFieldTotImporti.setBounds(387, 54, 71, 20);
		contentPane.add(textFieldTotImporti);
		textFieldTotImporti.setColumns(10);
		
		JTextArea textAreaDescrizione = new JTextArea();
		//textAreaDescrizione.setBounds(66, 172, 108, 78);
		
		JScrollPane scrollPaneDescrizione = new JScrollPane(textAreaDescrizione);
		scrollPaneDescrizione.setBounds(76, 126, 139, 46);
		contentPane.add(scrollPaneDescrizione);
		
		JLabel lblSelezionaFattura = new JLabel("Seleziona fattura:");
		lblSelezionaFattura.setBounds(10, 256, 89, 14);
		contentPane.add(lblSelezionaFattura);
		
		JComboBox comboBoxFattura = new JComboBox();
		comboBoxFattura.setBounds(109, 253, 32, 22);
		contentPane.add(comboBoxFattura);
		
		JButton btnVisualizza = new JButton("Copia");
		btnVisualizza.setBounds(151, 252, 77, 23);
		contentPane.add(btnVisualizza);
		
		
		JTextArea textAreaLista = new JTextArea();
		//textAreaLista.setBounds(140, 172, 108, 78);
		
		JScrollPane scrollPaneLista = new JScrollPane(textAreaLista);
		scrollPaneLista.setBounds(245, 145, 213, 160);
		contentPane.add(scrollPaneLista);
		
		JLabel lblLista = new JLabel("Lista fatture inserite:");
		lblLista.setBounds(252, 126, 121, 14);
		contentPane.add(lblLista);
		
		JComboBox comboBoxGiorno = new JComboBox();
		comboBoxGiorno.setBounds(76, 20, 32, 20);
		for(int i=1; i<=31; i++) {
			comboBoxGiorno.addItem(i);
		}
		contentPane.add(comboBoxGiorno);
		
		JComboBox comboBoxMese = new JComboBox();
		//comboBoxMese.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		for(int i=1; i<=12; i++) {
			comboBoxMese.addItem(i);
		}
		comboBoxMese.setBounds(115, 20, 34, 20);
		contentPane.add(comboBoxMese);
		
		JComboBox comboBoxAnno = new JComboBox();
		comboBoxAnno.setModel(new DefaultComboBoxModel(new String[] {"2016", "2017", "2018", "2019", "2020"}));
		comboBoxAnno.setBounds(159, 20, 56, 20);
		contentPane.add(comboBoxAnno);
		
		final JComboBox comboBoxSelect = new JComboBox();
		comboBoxSelect.setModel(new DefaultComboBoxModel(new String[] {"all","2016", "2017", "2018", "2019", "2020"}));
		comboBoxSelect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(GestionaleJFrame.this,
					    "Hai selezionato: "+comboBoxSelect.getSelectedItem(),
					    "ComboBox",
					    JOptionPane.ERROR_MESSAGE);
			}
		});
		comboBoxSelect.setBounds(328, 56, 49, 20);
		contentPane.add(comboBoxSelect);
	}
}
