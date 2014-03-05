package Housepackage;

public class House { //klassvariabel f�r house
	
	private int year; //instansvariabel f�r �r
	
	private int size; //instansvariabel f�r storlek
	
	private static int nbrOfHouses; //konstantvariabel f�r antal hus
	
	public static final int MIN_SIZE = 10; //minsta m�jliga storlek �r 10 n�r denna variabel anv�nds

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

	public static int getNbrHouses() { //instansmetod f�r antal hus
		return nbrOfHouses;
	}

	public int getYear() {
		return year;
	}

	public int getSize() {
		return size;
	}
}