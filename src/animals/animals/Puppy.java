package animals.animals;

public class Puppy {
	private String name;
	public Puppy(String name) {
		this.name = name;
	
	}
public String getName() {
	return (this.name);
}
 public static void main (String[] args) {
	 Puppy Boghos = new Puppy ("cutie");
	 System.out.println(Boghos.getName());
 }
 
 }