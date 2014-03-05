package uppgift5;



public class Program { //namn på klassen
	
	private String name; //String name varibel för att få in namn i programmet
	private String code;//String code varibel för vilket program
	private int women; //variabel för att få in alla kvinnor i programmet
	private int men; //variabel för att få in alla män i programmet
	
	
	public Program (String name, String code, int women, int men){ //konstruktor för programmet
		
		
		//skriver ut information som jag vill ha ut från XML filen, in i min Jlabel som heter programLable
		this.name = name; 
		this.code = code;
		this.women = women;
		this.men = men;
		
	}
	
	public String getName(){ //metod för att hämta namn
		return name; 
	}
	
	public String getCode(){ //metod för att hämta kod
		return code; 
	}

	public int getWomen(){ //metod för att hämta kvinnor
		return women; 
	}
	
	public int getMen(){ //metod för att hämta män
		return men; 
	}
	
	@Override
	public String toString(){
		return name;
	}
}
