package Housepackage;

public class House { //klassvariabel för house
	
	private int year; //instansvariabel för år
	
	private int size; //instansvariabel för storlek
	
	private static int nbrOfHouses; //konstantvariabel för antal hus
	
	public static final int MIN_SIZE = 10; //minsta möjliga storlek är 10 när denna variabel används

	public House(int _year, int _size) { //konstruktor och klassmetod
		year = _year;
		if (_size > MIN_SIZE){
			size = _size;
			
		}
		else{
			_size = MIN_SIZE;
		}
		 nbrOfHouses++;
	}

	public static int getNbrHouses() { //instansmetod för antal hus
		return nbrOfHouses;
	}

	public int getYear() {
		return year;
	}

	public int getSize() {
		return size;
	}
}