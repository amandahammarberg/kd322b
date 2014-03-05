package uppgift5;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.io.File;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class Skola extends JFrame {
	
	private Document doc;
	org.w3c.dom.Node node;
	private ArrayList<Program> programList = new ArrayList<Program>(); //En arraylist som listar alla program
	
	public JLabel programLable;
	public JLabel lblNewLabel;
	public JLabel amountLabel;
	private JPanel contentPane;
	
	
	/**
	* Opens the given XML file as DOM.
	*
	* @param fileName
	* The filename of the XML file (make sure to copy this to your
	* Eclipse project)
	* @return A Document instance containing the given XML file.
	*/
	private Document openXmlFile(String fileName) {
	Document doc = null;
	try {
	File fXmlFile = new File(fileName);
	DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
	doc = dBuilder.parse(fXmlFile);
	doc.getDocumentElement().normalize();
	} catch (Exception e) {
	e.printStackTrace();
	}
	return doc;
	}
	
	
	//en ArrayList för alla program, hämtar information från XML

		private ArrayList<Program> loadAllPrograms(){
			ArrayList<Program> output = new ArrayList<Program>();
			
			//Hämtar alla program
			NodeList programs = doc.getElementsByTagName("Program");
			for (int i = 0; i< programs.getLength(); i++){
				node = programs.item(i); //Listan läggs som ett element
				Element elm = (Element) node;
				
				//Hämta data från elementet
				String name =elm.getElementsByTagName("name").item(0).getTextContent();
				String code = elm.getElementsByTagName("code").item(0).getTextContent();
				int woman = Integer.parseInt(elm.getElementsByTagName("women").item(0).getTextContent());
				int men = Integer.parseInt(elm.getElementsByTagName("men").item(0).getTextContent());
					// Does this for all four types of data (name, code, amount of women, amount of men)
				
				// Creates the program and puts it in the list
				Program program = new Program(name, code, woman ,men);
				output.add(program);
				//programList.add(program);
			}
			return output;
		}
	
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Skola frame = new Skola();
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
	public Skola() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		doc = openXmlFile("ht2013_antagning.xml"); //hämtar information från XML filen
		JLabel programLable = new JLabel("Första elementet (rooten):");
		programLable.setBounds(41, 36, 364, 14);
		contentPane.add(programLable); 
		programLable.setText("Första elementet av dokumentet är (the root): " + doc.getDocumentElement().getNodeName());
		
		programList = loadAllPrograms(); //laddar alla program

		JLabel lblAntalProgram = new JLabel("Antal program:");
		lblAntalProgram.setBounds(41, 61, 238, 14);
		contentPane.add(lblAntalProgram);
		lblAntalProgram.setText("Filen har så här många program: " + programList.size()); //skriver ut hur många program som finns i min XML fil
		
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(75, 104, 256, 30);
		contentPane.add(comboBox);
		comboBox.setModel(new DefaultComboBoxModel(programList.toArray()));
	
		
	
		System.out.println("Första elementet av dokumentet är (the root):" + doc.getDocumentElement().getNodeName()); //test
		System.out.println("Filen har så här många program: " + programList.size());
	}
}
