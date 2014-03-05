package djuren;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class DogStoreGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextArea textArea_1;
	private JTextArea textArea;
	private Dog dog;
	
	private Human humans;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DogStoreGUI frame = new DogStoreGUI();
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
	public DogStoreGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		 
		
		//textfält för ägare
		textField = new JTextField();
		textField.setBounds(44, 32, 117, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		
		//textfält för hund
		textField_1 = new JTextField();
		textField_1.setBounds(44, 73, 117, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		
		//knapp för ny ägare
		JButton btnNewHuman = new JButton("New Human");
		btnNewHuman.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if (textField.getText().length()<4){
					textArea_1.setText("Name too short");
					
				}
				
				else{
					humans = new Human(textField.getText());
			
			}
			}
			
		});
		btnNewHuman.setBounds(190, 31, 103, 23);
		contentPane.add(btnNewHuman);
		
		
		//knapp för ny hund
		JButton btnBuyDog = new JButton("Buy Dog");
		btnBuyDog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (humans!= null){ //om owner inte finns
		        dog = new Dog (String.valueOf(textField_1.getText())); //
				humans.buyDog(dog);
			}
				
				else{ //om owner inte finns skrivs detta ut i Error Message
			 textArea_1.setText("Can't buy dog without owner");
				} 
			}
			
	
		});
		btnBuyDog.setBounds(190, 72, 103, 23);
		contentPane.add(btnBuyDog);
		
	
		
		//knapp för Print Info
		JButton btnPrintInfo = new JButton("Print Info");
		btnPrintInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textArea.setText(humans.getInfo());
				
			}
		});
		btnPrintInfo.setBounds(190, 110, 103, 23);
		contentPane.add(btnPrintInfo);
		
		//här skrivs informationen ut
		textArea = new JTextArea();
		textArea.setBounds(44, 155, 300, 31);
		contentPane.add(textArea);
		
		//här skrivs Error Message 
		textArea_1 = new JTextArea();
		textArea_1.setBounds(44, 203, 300, 31);
		contentPane.add(textArea_1);
		
		JLabel lblInfo = new JLabel("Info");
		lblInfo.setBounds(44, 143, 45, 14);
		contentPane.add(lblInfo);
		
		JLabel lblErrorMessage = new JLabel("Error Message");
		lblErrorMessage.setBounds(44, 190, 84, 14);
		contentPane.add(lblErrorMessage);
		
	}
}
