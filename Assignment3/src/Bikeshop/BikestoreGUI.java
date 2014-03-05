package Bikeshop;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class BikestoreGUI extends JFrame {

	
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private BikeStore store; 
	private JTextArea textArea;
	private JButton btnAddBike;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BikestoreGUI frame = new BikestoreGUI();
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
	public BikestoreGUI() {
		store = new BikeStore();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textArea = new JTextArea();
		textArea.setBounds(10, 11, 222, 239);
		contentPane.add(textArea);
		
		textField = new JTextField();
		textField.setBounds(318, 33, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(318, 64, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(318, 95, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		
		JButton btnAddBike = new JButton("Add bike");
		btnAddBike.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				store.addBike(textField.getText(), Integer.parseInt(textField_1.getText()), Integer.parseInt(textField_2.getText()));
				textArea.setText(store.getAllBikes());
			}
		});
		btnAddBike.setBounds(283, 143, 89, 23);
		contentPane.add(btnAddBike);
		
		JLabel lblColor = new JLabel("Color");
		lblColor.setBounds(259, 39, 46, 14);
		contentPane.add(lblColor);
		
		JLabel lblSize = new JLabel("Size");
		lblSize.setBounds(259, 70, 46, 14);
		contentPane.add(lblSize);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setBounds(259, 98, 46, 14);
		contentPane.add(lblPrice);
	}
}
