
public abstract class Animal {
	
	public String name;
	public Animal(String name){
		this.name = name;
	}
	
	
	public abstract String getInfo();
	
	public String getName(){
		
		return name;
	}
	

}
