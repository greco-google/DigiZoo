
public class Dog extends Domesticated implements Canine{
	public Dog(String petName) {
		this.petName = petName;
		this.hunger = hunger;
		this.thirst = thirst;
		this.waste = waste;
		this.bored = bored;
		this.health = health;
		
	    @Override
	    public void walk() {
	        if (sleep) {
	            System.out.println("This pet is sleeping.");
	        } else {
	            bored -= 30;
	            if (bored < 0) bored = 0;
	            System.out.println("Walk done!");
	        }
	    }
	}
}
