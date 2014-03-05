package Calculatorpackage;

public class Calculator {
	
	public int first; // 123
	public int second; // 32
	
	public boolean addBool = false; // true
	public boolean minusBool = false;
	public boolean multipleBool = false;
	
	public int gorUtrakningen() {
		int svar = 0;
		
		if(addBool) {
			svar = first + second;
		} else if(minusBool) {
			svar = first - second;
			
		} else if(multipleBool) {
			svar = first * second;
		}
		
		addBool = false;
		minusBool = false;
		multipleBool = false;
		
		return svar;
	}
	
}
