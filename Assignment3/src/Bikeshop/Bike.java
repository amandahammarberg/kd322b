package Bikeshop;

public class Bike {


		private String color; 
		private int price; 
		private int size;
		private static int nbrOfBikes;
		

	/** skapar en cykel med instansvariabler som är begränsade av värderna i Constants.java*/
		public Bike(String _color,int _size){ //String för färg och storlek
			nbrOfBikes = nbrOfBikes + 1;
			color = Constants.colorCheck(_color);
			if (size > Constants.MIN_SIZE){ //om den angivna storleken är större än minsta storleken..
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
	
		
		
		/** skapar en cykel med instansvariabler som är begränsade av värderna i Constants.java*/
	public Bike(String _color,int _size,int _price){ //funktion för att ange färg, storlek och pris för varje cykel
		nbrOfBikes = nbrOfBikes + 1;
		color = Constants.colorCheck(_color); //färg angedd är samma som färg
		if (size > Constants.MIN_SIZE){ // om storleken angedd är större än minsta storleken är.. 
			size = size; //size och _size är samma sak
	
		}
		
		else{
			size = Constants.MIN_SIZE; // annars om storleken är mindre än minsta storleken så är _size och minsta storlek samma sak
		}
		
		
		if (size < Constants.MAX_SIZE){ //om size är mindre än största storlek så är den angivna storleken okej
			size = _size;
		}
		
		else{
			size = Constants.MAX_SIZE; // annars skrivs size ut som max storleken, dvs om den angivna storleken är större än största möjliga
		}
		
		if (price > Constants.MIN_PRICE){ // om priset angedd är högre än lägsta möjliga...
			price = _price; // är det angivna priset okej
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
		return color; /** metod för att returnera färg på cykeln*/
	}
	
		public int getSize(){
			return size; /** metod för att returnera storlek på cykeln*/
		}
		
		public int getPrice(){	
			return price; /** metod för att returnera pris på cykeln*/
		}
	
		public int setPrice(){	
			return price; 
		}
		
		public static int getNbrOfBikes(){
			return nbrOfBikes;
			
		}
	}
