package Bikeshop;

public class Bike {


		private String color; 
		private int price; 
		private int size;
		private static int nbrOfBikes;
		

	/** skapar en cykel med instansvariabler som �r begr�nsade av v�rderna i Constants.java*/
		public Bike(String _color,int _size){ //String f�r f�rg och storlek
			nbrOfBikes = nbrOfBikes + 1;
			color = Constants.colorCheck(_color);
			if (size > Constants.MIN_SIZE){ //om den angivna storleken �r st�rre �n minsta storleken..
				size = _size; //skrivs den angivna storleken ut
		}
			else{
				size = Constants.MIN_SIZE;
			}
			
			
			if (size < Constants.MAX_SIZE){
				size = _size;
			}
			else{
				size = Constants.MAX_SIZE;
			}
			
		}
	
		
		
		/** skapar en cykel med instansvariabler som �r begr�nsade av v�rderna i Constants.java*/
	public Bike(String _color,int _size,int _price){ //funktion f�r att ange f�rg, storlek och pris f�r varje cykel
		nbrOfBikes = nbrOfBikes + 1;
		color = Constants.colorCheck(_color); //f�rg angedd �r samma som f�rg
		if (size > Constants.MIN_SIZE){ // om storleken angedd �r st�rre �n minsta storleken �r.. 
			size = size; //size och _size �r samma sak
	
		}
		
		else{
			size = Constants.MIN_SIZE; // annars om storleken �r mindre �n minsta storleken s� �r _size och minsta storlek samma sak
		}
		
		
		if (size < Constants.MAX_SIZE){ //om size �r mindre �n st�rsta storlek s� �r den angivna storleken okej
			size = _size;
		}
		
		else{
			size = Constants.MAX_SIZE; // annars skrivs size ut som max storleken, dvs om den angivna storleken �r st�rre �n st�rsta m�jliga
		}
		
		if (price > Constants.MIN_PRICE){ // om priset angedd �r h�gre �n l�gsta m�jliga...
			price = _price; // �r det angivna priset okej
	}
		
		else{
			price = Constants.MIN_PRICE;
		}
		
		if (price < Constants.MAX_PRICE){
			price = _price;
		}
		else{
			price = Constants.MAX_PRICE;
		}
		
		
		}
	
	
	public String getColor(){
		return color; /** metod f�r att returnera f�rg p� cykeln*/
	}
	
		public int getSize(){
			return size; /** metod f�r att returnera storlek p� cykeln*/
		}
		
		public int getPrice(){	
			return price; /** metod f�r att returnera pris p� cykeln*/
		}
	
		public int setPrice(){	
			return price; 
		}
		
		public static int getNbrOfBikes(){
			return nbrOfBikes;
			
		}
	}
