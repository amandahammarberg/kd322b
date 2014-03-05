package Housepackage;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;


public class HouseGUI extends JFrame {


	private House myHouse[];
	int i;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HouseGUI frame = new HouseGUI();
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
	public HouseGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 11, 414, 239);
		contentPane.add(textArea);
		
		myHouse = new House [10]; //Array för alla hus
		House house1 = new House(1982,20);
		House house2 = new House(1973,25);
		House house3 = new House(1999,30);
		myHouse[0] = house1;
		myHouse[1] = house2;
		myHouse[2] = house3;
		
		for (int i = 0; i<myHouse.length; i++){ //loopar igenom alla hus
			if(myHouse[i] != null){
				textArea.append("det byggdes ett hus " + myHouse[i].getYear() +"som är" + myHouse[i].getSize() + "kvm\n"); //i textArea skall detta skrivas
				
			
	
			
		}
		
		
	}
		textArea.append("det finns " + House.getNbrHouses() + " hus"); //i textArea skall detta skrivas
}
}
