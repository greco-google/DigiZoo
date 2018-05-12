
public class Dog extends Domesticated implements Canine{
	public Dog(String petName) {
		this.name = petName;
		this.hunger = 0;
		this.thirst = 0;
		this.waste = 0;
		this.boredom = 30;
		this.health = false;
		
//	    @Override
//	    public void walk() {
//	        this.bored = 0;
//	        this.waste = 0;
//	        this.hunger = hunger;
//	        this.health = health - 10;
//	    }
	}
}
