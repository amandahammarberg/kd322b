
public class Snake extends Animal {
	
	boolean p;

	public Snake(String name, boolean p) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public String getInfo(){
		
		if(p){
			
			return ("Ormen heter " + super.getName() + "och �r " + "giftig");

		}
		
		else{
			
			return ("Ormen heter " + super.getName() + "och �r " + " inte giftig");
		}
		
		
	}
	
}
