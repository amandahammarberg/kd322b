import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;


public class ZooGUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ZooGUI frame = new ZooGUI();
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
	public ZooGUI() {
		
		ArrayList<Animal> djur = new ArrayList<Animal> ();
		djur.add(new Snake("tim", true));
		djur.add(new Dog("kalle", 7, true));
		djur.add(new Cat("misse", 18));
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(22, 22, 388, 211);
		contentPane.add(textArea);
		
		for (int i = 0; i < djur.size(); i++){
			textArea.append(djur.get(i).getInfo()+ "\n");
		}
				
	}
	
	

}
