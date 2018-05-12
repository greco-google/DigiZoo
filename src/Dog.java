
public abstract class Dog extends Domesticated implements Canine{
	public Dog(String petName) {
		this.petName = petName;
		this.hunger = hunger;
		this.thirst = thirst;
		this.waste = waste;
		this.bored = bored;
		this.health = health;
		
	    @Override
	    public void walk() {
	        this.bored = 0;
	        this.waste = 0;
	        this.hunger = hunger;
	        this.health = health - 10;
	    }
	}
}
