package Bikeshop;


import java.util.ArrayList;

public class BikeStore {
	
	
	private ArrayList<Bike> myBike = new ArrayList<Bike>();
	
	public String getAllBikes(){
		String bikeShop="";
		
		/** loopar igenom alla cyklar*/
		for (int i =0;i <myBike.size(); i++){ 
			Bike b= myBike.get(i);
			
			bikeShop = bikeShop + ("The color is " + b.getColor() +".\n Size is " + b.getSize() + ".\n Price is " + b.getPrice() +"\n");
			
		}
		
		return bikeShop;
	}
	
	/** en metod som anger färg, storlek och pris*/
	public void addBike (String color, int size, int price){
			myBike.add(new Bike(color.toLowerCase(),size,price));
		
	}

	}
