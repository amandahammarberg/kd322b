
public class Cat extends Mammal{
	
	private int lives;
	
	public Cat(String name, int nursering) {
		super(name, nursering);
		// TODO Auto-generated constructor stub
	}

	public String getInfo(){
		
		
		return "Kattens namn är " + super.getName() + " den diar " + super.getNursering() + " och har " + lives + " liv";
	}
	

}
