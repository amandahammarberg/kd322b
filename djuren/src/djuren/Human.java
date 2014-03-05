package djuren;

public class Human {

	private Dog dog;
	private String name;
	
	public Human(String name){
		this.name = name;
	}
	
	//En sträng som hämtar namn
	public String getName(){
		return name;
		
	}

	public void buyDog(Dog dog){
		this.dog = dog;
	}

	//en sträng som visar om man äger en hund eller ej
	public String getInfo(){
		String s = "";
				if (dog !=null){
					//om personen äger en hund skrivs detta ut + hämtar namnet
					s = getName() + " äger en hund som heter " + dog.getName(); 
					
				}
				
				else { //om inte en ägare har en hund skrivs detta ut
					s = getName() + "äger inte en hund";
				}
				return s;
		
	}
}



