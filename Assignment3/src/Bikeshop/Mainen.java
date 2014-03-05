package Bikeshop;
import java.util.ArrayList;


class Mainen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike Bike1 = new Bike("red", 10, 1200);
		Bike Bike2 = new Bike("white", 9, 1000);
		Bike Bike3 = new Bike("black", 20, 1300);
		Bike Bike4 = new Bike("purple", 10, 800);
		Bike Bike5 = new Bike("pink", 10, 900);
		Bike Bike6 = new Bike("yellow", 11, 1400);
		Bike Bike7 = new Bike("green", 15, 2000);
		Bike Bike8 = new Bike("blue", 17, 2000);
		Bike Bike9 = new Bike("grey", 22, 2500);
		Bike Bike10 = new Bike("brown", 28, 3000);   

		ArrayList<Bike> myBikes = new ArrayList<Bike>(); //en Arraylista för alla cyklar

		myBikes.add(Bike1);
		myBikes.add(Bike2);
		myBikes.add(Bike3);
		myBikes.add(Bike4);
		myBikes.add(Bike5);
		myBikes.add(Bike6);
		myBikes.add(Bike7);
		myBikes.add(Bike8);
		myBikes.add(Bike9);
		myBikes.add(Bike10);

		/**loopar igenom alla cyklar*/
		for (int i = 0; i<myBikes.size(); i++){ 
				
		System.out.println(myBikes.get(i).getPrice()+ " dollar, with size " + myBikes.get(i).getSize()+ " and the color " + myBikes.get(i).getColor()); //skriver ut pris, storlek och färg
		}


				
		}

	}

