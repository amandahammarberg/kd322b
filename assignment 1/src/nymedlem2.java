import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;


public class nymedlem2 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					nymedlem2 window = new nymedlem2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public nymedlem2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNamn = new JLabel("Namn");
		lblNamn.setBounds(10, 42, 46, 14);
		frame.getContentPane().add(lblNamn);
		
		JLabel lblPersonnummer = new JLabel("Personnummer");
		lblPersonnummer.setBounds(10, 78, 94, 14);
		frame.getContentPane().add(lblPersonnummer);
		
		JLabel lblAdress = new JLabel("Adress");
		lblAdress.setBounds(38, 116, 46, -20);
		frame.getContentPane().add(lblAdress);
		
		JLabel lblTelefonnummer = new JLabel("Telefonummer");
		lblTelefonnummer.setBounds(10, 146, 116, 14);
		frame.getContentPane().add(lblTelefonnummer);
		
		JLabel lblEpost = new JLabel("E-post");
		lblEpost.setBounds(10, 181, 46, 14);
		frame.getContentPane().add(lblEpost);
		
		JLabel lblAdress_1 = new JLabel("Adress");
		lblAdress_1.setBounds(10, 110, 46, 14);
		frame.getContentPane().add(lblAdress_1);
		
		textField = new JTextField();
		textField.setBounds(66, 39, 147, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(108, 72, 105, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(66, 103, 147, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(108, 140, 105, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(77, 178, 136, 20);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(nymedlem2.class.getResource("/image/user2.gif")));
		lblNewLabel.setBounds(231, 25, 173, 184);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnSpara = new JButton("Spara");
		btnSpara.setBounds(278, 220, 89, 23);
		frame.getContentPane().add(btnSpara);
	}
}
