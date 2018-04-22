public class Pet {
	
	protected String petType;
	protected String petName;
	int tick;
	int health;
	int hunger;
	int thirst;
	int bored;
	int tired;
	


	public String getPetType() {
		return petType;
	}

	public String getPetName() {
		return petName;
	}
	
	public void tick() {
		tick = tick + (int) ((Math.random() * 3) + 1);
		health = health - (int) ((Math.random() * 3) + 1);
		hunger = hunger + (int) ((Math.random() * 3) + 1);
		thirst = thirst + (int) ((Math.random() * 3) + 1);
		bored = bored + (int) ((Math.random() * 3) + 1);
		tired = tired + (int) ((Math.random() * 3) + 1);
	}
	
	public void feed() {
		tick = tick + (int) ((Math.random() * 3) + 1);
		hunger = hunger - (int) ((Math.random() * 13) + 1);
		thirst = thirst + (int) ((Math.random() * 5) + 1);
		tired = tired + (int) ((Math.random() * 3) + 1);
		health = health - (int) ((Math.random() * 3) + 1);
	}
	
	public void walk() {
		tick = tick + (int) ((Math.random() * 3) + 1);
		hunger = hunger + (int) ((Math.random() * 5) + 1);
		thirst = thirst + (int) ((Math.random() * 5) + 1);
		bored = bored - (int) ((Math.random() * 3) + 1);
		health = health + (int) ((Math.random() * 3) + 1);
	}

	
	public void water() {
		tick = tick + (int) ((Math.random() * 3) + 1);
		thirst = thirst - (int) ((Math.random() * 7) + 1);
		hunger = hunger - (int) ((Math.random() * 13) + 1);
		tired = tired + (int) ((Math.random() * 3) + 1);
		health = health + (int) ((Math.random() * 3) + 1);
	}
	
	
	
//	@Override
//	public int compareTo(Pet other) {
//		if(this.getEmpName().equals(other.getEmpName())) {
//			return this.getEmpNumber().compareTo(other.getEmpNumber());
//		}
//		return this.getPetName().compareTo(other.getPetName());
//		
//	}

}