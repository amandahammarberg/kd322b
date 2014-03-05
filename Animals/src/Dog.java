
public class Dog extends Mammal {
	
	boolean m;
	
	public Dog(String name, int nursering, boolean m) {
		super(name, nursering);
	// TODO Auto-generated constructor stub
		
		this.m = m;
	}
	
	
	public String getInfo(){
		
		if (m){
			
			return ("Hundens namn är " + super.getName() + " den diar " + super.getNursering() + " och är " + " korkad");
					
		}
		
		else{
			
			return ("Hundens namn är " + super.getName() + "den diar " + super.getNursering() + "och är " + " inte korkad");
		}
	}
	
	
	

}
