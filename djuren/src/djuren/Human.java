package djuren;

public class Human {

	private Dog dog;
	private String name;
	
	public Human(String name){
		this.name = name;
	}
	
	//En str�ng som h�mtar namn
	public String getName(){
		return name;
		
	}

	public void buyDog(Dog dog){
		this.dog = dog;
	}

	//en str�ng som visar om man �ger en hund eller ej
	public String getInfo(){
		String s = "";
				if (dog !=null){
					//om personen �ger en hund skrivs detta ut + h�mtar namnet
					s = getName() + " �ger en hund som heter " + dog.getName(); 
					
				}
				
				else { //om inte en �gare har en hund skrivs detta ut
					s = getName() + "�ger inte en hund";
				}
				return s;
		
	}
}



