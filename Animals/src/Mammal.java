
public abstract class Mammal extends Animal{ 
	
	private int nursering;
	
	public Mammal (String name, int nursering){
		super (name);
		this.nursering = nursering;
		
	} 
	
	public int getNursering(){
		return nursering;
	}

}
