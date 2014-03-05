package uppgift5;



public class Program { //namn p� klassen
	
	private String name; //String name varibel f�r att f� in namn i programmet
	private String code;//String code varibel f�r vilket program
	private int women; //variabel f�r att f� in alla kvinnor i programmet
	private int men; //variabel f�r att f� in alla m�n i programmet
	
	
	public Program (String name, String code, int women, int men){ //konstruktor f�r programmet
		
		
		//skriver ut information som jag vill ha ut fr�n XML filen, in i min Jlabel som heter programLable
		this.name = name; 
		this.code = code;
		this.women = women;
		this.men = men;
		
	}
	
	public String getName(){ //metod f�r att h�mta namn
		return name; 
	}
	
	public String getCode(){ //metod f�r att h�mta kod
		return code; 
	}

	public int getWomen(){ //metod f�r att h�mta kvinnor
		return women; 
	}
	
	public int getMen(){ //metod f�r att h�mta m�n
		return men; 
	}
	
	@Override
	public String toString(){
		return name;
	}
}
