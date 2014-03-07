import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;


public class nyamedlem {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					nyamedlem window = new nyamedlem();
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
	public nyamedlem() {
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
		lblNamn.setBounds(24, 30, 46, 14);
		frame.getContentPane().add(lblNamn);
	}
}
