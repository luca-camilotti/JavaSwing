package swing.gui.anagrafica;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;


public class Anagrafica extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField_nome;
	private JTextField textField_cognome;
	private JTextField textField_mail;
	ArrayList<Contact> lista;
	/*
	String[] nome = new String[25];
	String[] cognome = new String[25];
	String[] email = new String[25]; */
	int count=0;  // contatore record
	private JTextField textFieldRicerca;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Anagrafica frame = new Anagrafica();
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
	public Anagrafica() {
		lista = new ArrayList<Contact>();
		setTitle("Demo Rubrica");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.control);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField_nome = new JTextField();
		textField_nome.setBounds(109, 11, 116, 20);
		contentPane.add(textField_nome);
		textField_nome.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(21, 14, 54, 14);
		contentPane.add(lblNome);
		
		textField_cognome = new JTextField();
		textField_cognome.setBounds(109, 42, 116, 20);
		contentPane.add(textField_cognome);
		textField_cognome.setColumns(10);
		
		JLabel lblCognome = new JLabel("Cognome:");
		lblCognome.setBounds(21, 45, 78, 17);
		contentPane.add(lblCognome);
		
		JLabel lblEmail = new JLabel("e-mail:");
		lblEmail.setBounds(21, 73, 54, 17);
		contentPane.add(lblEmail);
		
		textField_mail = new JTextField();
		textField_mail.setBounds(109, 71, 116, 20);
		contentPane.add(textField_mail);
		textField_mail.setColumns(10);
		
		final JTextArea textArea = new JTextArea();
		//textArea.setBounds(10, 166, 414, 84);
		JScrollPane scroll = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);		
		scroll.setBounds(10, 166, 414, 84);
		contentPane.add(scroll);
		
		JButton btnInserisci = new JButton("Inserisci");
		btnInserisci.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {	
				/*
				cont++;				
				nome[cont]= textField_nome.getText();
				cognome[cont]= textField_cognome.getText();
				email[cont]= textField_mail.getText(); */
				Contact c = new Contact(textField_nome.getText(),
						textField_cognome.getText(),
						textField_mail.getText());
				lista.add(c);
				textField_nome.setText("");
				textField_cognome.setText("");
				textField_mail.setText("");
				//textArea.append("Record inserito con successo nella posizione: "+cont);
				JOptionPane.showMessageDialog(Anagrafica.this,
					    c.toString()+" (posizione "+lista.indexOf(c)+")",
					    "Contatto inserito",
					    JOptionPane.INFORMATION_MESSAGE);
				
			}
		});
		btnInserisci.setBounds(109, 102, 116, 23);
		contentPane.add(btnInserisci);
		
		textFieldRicerca = new JTextField();
		textFieldRicerca.setBounds(335, 11, 89, 20);
		contentPane.add(textFieldRicerca);
		textFieldRicerca.setColumns(10);
		
		JButton btnCerca = new JButton("Cerca");
		btnCerca.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		btnCerca.setBackground(Color.ORANGE);
		btnCerca.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String search = textFieldRicerca.getText();
				Iterator i = lista.iterator();
				boolean found = false;
				while(i.hasNext()) {
					Contact c = (Contact) i.next();
					if(c.getName().equalsIgnoreCase(search) ||
							c.getSurname().equalsIgnoreCase(search) ||
							c.getEmail().equalsIgnoreCase(search)) {
						textArea.setText(lista.indexOf(c)+". \n"+c.toString());
						count = lista.indexOf(c);
						JOptionPane.showMessageDialog(Anagrafica.this,
							    c.toString()+" \n(posizione "+lista.indexOf(c)+")",
							    "Contatto trovato",
							    JOptionPane.INFORMATION_MESSAGE);
						found = true;
						break;
					}
				}
				if(!found) {
					JOptionPane.showMessageDialog(Anagrafica.this,
						    "Spiacente, nessun risultato per la ricerca: "+search,
						    "Contatto non trovato",
						    JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		btnCerca.setBounds(335, 41, 89, 23);
		contentPane.add(btnCerca);
		
		JButton btnElimina = new JButton("Elimina");
		btnElimina.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(count>(lista.size()-1)) {
					JOptionPane.showMessageDialog(Anagrafica.this,
						    "Impossibile eliminare contatto in posizione "+count,
						    "Errore",
						    JOptionPane.ERROR_MESSAGE);
				}
				else {
					Contact c = lista.get(count);
					lista.remove(c);
					JOptionPane.showMessageDialog(Anagrafica.this,
						    "Contatto: \n"+c.toString()+"\neliminato",
						    "Contatto eliminato",
						    JOptionPane.WARNING_MESSAGE);
					
					if(count>0) {
						count--;
						Contact d = lista.get(count);
						textArea.setText(lista.indexOf(d)+". "+d.toString());
					}
					else if(count==0 && lista.size()>0) {
						Contact d = lista.get(count);
						textArea.setText(lista.indexOf(d)+". \n"+d.toString());
					}
					else {
						textArea.setText("EMPTY LIST!");
					}
				}
			}
		});
		btnElimina.setBounds(335, 135, 89, 23);
		contentPane.add(btnElimina);
		
		JButton buttonAvanti = new JButton(">>");
		buttonAvanti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(count<lista.size()-1)
					count++;
				if(lista.size()>=(count+1)) {
					Contact c = lista.get(count);
					textArea.setText(lista.indexOf(c)+". \n"+c.toString());
				}
				else {
					JOptionPane.showMessageDialog(Anagrafica.this,
						    "Impossibile mostrare contatto in posizione "+count,
						    "Errore",
						    JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		buttonAvanti.setBounds(241, 135, 54, 23);
		contentPane.add(buttonAvanti);
		
		JButton buttonIndietro = new JButton("<<");
		buttonIndietro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(count>0)
					count--;
				if(lista.size()>=(count+1)) {
					Contact c = lista.get(count);
					textArea.setText(lista.indexOf(c)+". \n"+c.toString());
				}
				else {
					JOptionPane.showMessageDialog(Anagrafica.this,
						    "Impossibile mostrare contatto in posizione "+count,
						    "Errore",
						    JOptionPane.ERROR_MESSAGE);
				}
				
			}
		});
		buttonIndietro.setBounds(10, 135, 54, 23);
		contentPane.add(buttonIndietro);
	}
}
