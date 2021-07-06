package swing.gui.test;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JTextField;

public class myJFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textInput;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					myJFrame frame = new myJFrame();
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
	public myJFrame() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Icons\\Burn.ico"));
		setTitle("Test Swing");
		setResizable(false);  // do not permit window resize
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnClick = new JButton("Add");
		btnClick.setBackground(Color.GREEN);
		final JTextArea textArea = new JTextArea();
		JScrollPane scrollpane = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);		

		scrollpane.setBounds(33, 11, 372, 163);
		contentPane.add(scrollpane);
		
		textInput = new JTextField();
		textInput.setBounds(33, 208, 203, 20);
		contentPane.add(textInput);
		textInput.setColumns(10);
		
		/* La Java Interface è un costrutto
		 * che al suo interno contiene delle firme
		 * (senza il corpo del metodo!)
		 * di metodi public. Eventualmente potrebbe
		 * anche contenere delle costanti globali
		 * (public static final).
		 * Non può contenere variabili d'istanza.
		 * Quando una classe implementa un'interfaccia
		 * deve implementare al suo interno tutti
		 * i metodi presenti nell'interfaccia implementata.
		 * */
		
		/* Evento Click pulsante Add */
		class Pippo implements ActionListener {
			public void actionPerformed(ActionEvent arg0) {
				//System.out.println("heila'!");
				String str = textInput.getText();
				if(str.length() > 0) {
					textArea.append(str+"\r\n");
					textInput.setText("");
				}
				else {
					// Simple Dialog box
					// JOptionPane.showMessageDialog(null, "put a text!");
					// Somthing More..
					JOptionPane.showMessageDialog(null, "Message!", "Title", JOptionPane.ERROR_MESSAGE);
				}
			}
		}		
		Pippo p = new Pippo();
		btnClick.addActionListener(p);
		/*
		btnClick.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("pulsante cliccato!");
			}
		});*/
		btnClick.setBounds(253, 207, 68, 23);
		contentPane.add(btnClick);		
		
		/* Evento Click pulsante Clear */
		JButton btnClear = new JButton("Clear");
		btnClear.setBackground(Color.ORANGE);
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textArea.setText("");
			}
		});
		btnClear.setBounds(331, 207, 74, 23);
		contentPane.add(btnClear);
		
		
	}
}
