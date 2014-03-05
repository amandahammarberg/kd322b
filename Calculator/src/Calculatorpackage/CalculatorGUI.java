package Calculatorpackage;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;

public class CalculatorGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	
	private String cal = "";
	
	private Calculator calc;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorGUI frame = new CalculatorGUI();
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
	public CalculatorGUI() {
		
		calc = new Calculator();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		textField = new JTextField();
		contentPane.add(textField, BorderLayout.NORTH);
		textField.setText("Välkommen");
		textField.setPreferredSize(new Dimension(100,50));
		textField.setColumns(10);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(5, 3, 0, 4));
		
		JButton button = new JButton("1");
		panel.add(button);
		
		JButton btnNewButton = new JButton("2");
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("3");
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("4");
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("5");
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_5 = new JButton("6");
		panel.add(btnNewButton_5);
		
		JButton button_1 = new JButton("7");
		panel.add(button_1);
		
		JButton button_2 = new JButton("8");
		panel.add(button_2);
		
		JButton button_3 = new JButton("9");
		panel.add(button_3);
		
		JButton btnNewButton_4 = new JButton("0");
		panel.add(btnNewButton_4);
		
		JButton button_4 = new JButton("+");
		panel.add(button_4);
		
		JButton button_5 = new JButton("-");
		panel.add(button_5);
		
		JButton button_6 = new JButton("*");
		panel.add(button_6);
		
		JButton button_7 = new JButton("=");
		panel.add(button_7);
		
		JButton btnNewButton_6 = new JButton("Clear");
		panel.add(btnNewButton_6);
		
		
		button.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent arg0) {
				cal = cal + "1";
				textField.setText(cal);
				
			}
		});
		
		btnNewButton.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent arg0) {
				cal = cal + "2";
				textField.setText(cal);
			}
		});
		
		
		btnNewButton_1.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent arg0) {
				cal = cal + "3";
				textField.setText(cal);
			}
		});
		
		btnNewButton_2.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent arg0) {
				cal = cal + "4";
				textField.setText(cal);
			}
		});
		
		btnNewButton_3.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent arg0) {
				cal = cal + "5";
				textField.setText(cal);
			}
		});
		
		btnNewButton_5.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent arg0) {
				cal = cal + "6";
				textField.setText(cal);
			}
		});
		
		button_1.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent arg0) {
				cal = cal + "7";
				textField.setText(cal);
			}
		});
		
		button_2.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent arg0) {
				cal = cal + "8";
				textField.setText(cal);
			}
		});
		
		button_3.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent arg0) {
				cal = cal + "9";
				textField.setText(cal);
			}
		});
		
		btnNewButton_4.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent arg0) {
				cal = cal + "0";
				textField.setText(cal);
			}
		});
		
		button_4.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				calc.first = Integer.parseInt(cal);
				cal = "";
				textField.setText(cal);
				
				calc.addBool = true;
			}
		});
		
		button_5.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent arg0) {
				calc.first = Integer.parseInt(cal);
				cal = "";
				textField.setText(cal);
				
				calc.minusBool = true;
			}
		});
		
		button_6.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent arg0) {
				calc.first = Integer.parseInt(cal);
				cal = "";
				textField.setText(cal);
				
				calc.multipleBool = true;
			}
		});
		
		button_7.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				
				calc.second = Integer.parseInt(cal);
				cal = "";
				textField.setText(cal);
				
				
				int svar = calc.gorUtrakningen();
				textField.setText(String.valueOf(svar));
			}
		});
		
		btnNewButton_6.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent arg0) {
				cal = "";
				textField.setText(cal);
			}
		});
	}

}
