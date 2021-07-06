package swing.jframe.demo;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JScrollPane;

public class myJFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JSpinner spinner;
	private int i = 100;
	JTextArea textArea;
	


	/**
	 * Launch the application.
	 * EventQueue.invokeLater posts an event (Runnable object) 
	 * at the end of Swing Thread event list.
	 * The Runnable object will be processed 
	 * after all previous GUI events are processed.
	 * Long time processing should be done in secondary threads
	 * to avoid GUI blocking. After processing, a secondary
	 * thread should update GUI calling EventQueue.invokeLater,
	 * which add a task to the main GUI thread (the only one that
	 * can update graphics).
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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // close window on press of exit button (x)
		setBounds(100, 100, 450, 300);
		setTitle("GUI sample application");
		setResizable(false);  // do not allow window resize
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);  // absolute layout positioning
		
		JButton btnClick = new JButton("click");
		btnClick.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnClick.setBounds(154, 237, 89, 23);  // absolute positioning
		contentPane.add(btnClick);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField.setBounds(154, 11, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblUserName = new JLabel("Text Field");
		lblUserName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblUserName.setBounds(58, 12, 70, 17);
		contentPane.add(lblUserName);
		
		JLabel lblTextArea = new JLabel("Text Area");
		lblTextArea.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTextArea.setBounds(58, 142, 70, 17);
		contentPane.add(lblTextArea);
		
		String[] list = {"pippo", "pluto", "paperino", "minnie"};
		JComboBox<String> comboBox = new JComboBox<String>( /* list */);
		
		comboBox.addItem("pippo");
		comboBox.addItem("pluto");
		comboBox.addItem("paperino"); 
		comboBox.setBounds(154, 56, 89, 20);
		contentPane.add(comboBox);
		
		JLabel lblComboBox = new JLabel("Combo Box");
		lblComboBox.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblComboBox.setBounds(58, 56, 86, 17);
		contentPane.add(lblComboBox);
		
		spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(0, 0, 10, 1)); /* init value, min, max, step */
		spinner.setBounds(369, 56, 41, 20);
		contentPane.add(spinner);
		
		JLabel lblSpinner = new JLabel("Spinner");
		lblSpinner.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSpinner.setBounds(298, 56, 61, 17);
		contentPane.add(lblSpinner);
		
		JScrollPane scrollPane = new JScrollPane(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPane.setBounds(154, 139, 205, 90);
		contentPane.add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		/*
		class myButtonHandler implements ActionListener {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Bottone premuto!");
			}
		}
		myButtonHandler btnListener = new myButtonHandler();
		*/
		
		
		
		// Button action listener:
		btnClick.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(myJFrame.this,
					    "Eggs are not supposed to be green.",
					    "warning",
					    JOptionPane.WARNING_MESSAGE);
				/*
				 * JOptionPane.ERROR_MESSAGE
				 * JOptionPane.PLAIN_MESSAGE
				 * JOptionPane.INFORMATION_MESSAGE
				 * */
				System.out.println("i= "+i);
				System.out.println("Bottone premuto! spinner = "+spinner.getValue());
				textArea.append("Bottone premuto!\r\nspinner = "+spinner.getValue()+"\r\n");
				int i = Integer.parseInt(""+spinner.getValue());
				textArea.append("Bottone premuto!\r\nspinner = "+i+"\r\n");
			}			
		});
		// Combo Box action listener:
		comboBox.addActionListener(new ActionListener() {			 
		    @Override
		    public void actionPerformed(ActionEvent event) {
		        JComboBox<String> combo = (JComboBox<String>) event.getSource();
		        String selectedBook = (String) combo.getSelectedItem();
		        textArea.append(selectedBook+"\r\n");
		 
		        System.out.println("comboBox selection: "+selectedBook);
		    }
		});
		// Text Field listener:
		// ---- Hit enter
		textField.addActionListener(new ActionListener() {			 
		    @Override
		    public void actionPerformed(ActionEvent event) {
		        		 
		    	if (textField.getText().length()!=0){
				       JOptionPane.showMessageDialog(null,
				          "You typed "+textField.getText(), "Warning Massage",
				          JOptionPane.WARNING_MESSAGE);
				     }
		    }
		});
		
		// ---- Text Field modification
		textField.getDocument().addDocumentListener(new DocumentListener() {
			  public void changedUpdate(DocumentEvent e) {
			    warn();
			  }
			  public void removeUpdate(DocumentEvent e) {
			    warn();
			  }
			  public void insertUpdate(DocumentEvent e) {
			    warn();
			  }

			  public void warn() {
				  System.out.println("TextField modified: "+textField.getText());
			     if (textField.getText().length()==0){
			       JOptionPane.showMessageDialog(null,
			          "Warning", "Warning Massage",
			          JOptionPane.WARNING_MESSAGE);
			     }
			  }
			});
	}
}
