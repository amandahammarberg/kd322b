package Bikeshop;

public class Constants {
	
	public static int MIN_SIZE = 8;  //minsta tum
	public static int MAX_SIZE = 28; //max tum
	public static int MIN_PRICE = 0; //lägsta pris
	public static int MAX_PRICE = 30000; //max pris

	public static String[]myColors = {"black", "white", "blue", "pink", "green"}; /** färger som är tillåtna */
	
	/** en metod som kollar om en färg är tillåten eller inte*/
	public static String colorCheck(String col){ /**String som kollar igenom */
		boolean kolla = false;
		for (int i = 0; i< myColors.length; i++){
			if (col.equals(myColors[i])){
				kolla = true;
			}
		}
		if(kolla == true){ /** kollar om den angivna färgen stämmer överens med tillåtna färger*/
			return col; /**retunerar strängen*/
		}
		else{
			return "No color"; /** annars skriver den ut No color*/
		}
	}
}
