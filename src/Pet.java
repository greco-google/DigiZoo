public class Pet {
	
	protected String petType;
	protected String petName;
	int tick;
	int health;
	int hunger;
	int thirst;
	int bored;
	int tired;
	int waste;
	


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
		waste = waste + (int) ((Math.random() *2) + 1);
	}
	
	public void walk() {
		tick = tick + (int) ((Math.random() * 3) + 1);
		hunger = hunger + (int) ((Math.random() * 5) + 1);
		thirst = thirst + (int) ((Math.random() * 5) + 1);
		bored = bored - (int) ((Math.random() * 3) + 1);
		health = health + (int) ((Math.random() * 3) + 1);
		waste = 0;
	}

	
	public void water() {
		tick = tick + (int) ((Math.random() * 3) + 1);
		thirst = thirst - (int) ((Math.random() * 7) + 1);
		hunger = hunger - (int) ((Math.random() * 13) + 1);
		tired = tired + (int) ((Math.random() * 3) + 1);
		health = health + (int) ((Math.random() * 3) + 1);
	}
	
	public void vet() {
		health = 100;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getHunger() {
		return hunger;
	}

	public void setHunger(int hunger) {
		this.hunger = hunger;
	}

	public int getThirst() {
		return thirst;
	}

	public void setThirst(int thirst) {
		this.thirst = thirst;
	}

	public int getBored() {
		return bored;
	}

	public void setBored(int bored) {
		this.bored = bored;
	}

	public int getTired() {
		return tired;
	}

	public void setTired(int tired) {
		this.tired = tired;
	}

	public int getWaste() {
		return waste;
	}

	public void setWaste(int waste) {
		this.waste = waste;
	}

	public static void add(Pet pet) {
		// TODO Auto-generated method stub
		
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