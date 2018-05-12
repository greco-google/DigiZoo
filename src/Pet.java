
public abstract class Pet implements Comparable<Pet> {

	protected int hunger;
	protected int thirst;
	protected int waste; 
	protected int sleep;
	protected boolean health;
	protected boolean isSleeping = false;
	protected String name;

	public void showStats() {
		if (!isSleeping)
			System.out.println("(" + this.getClass().getSimpleName() + ") " + this.getName() + "\nHunger: "
					+ this.hunger + "\nThirst: " + this.thirst + "\nWaste: " + this.waste
					+ "\nTiredness: " + this.sleep + "\nSick: " + this.health);
		else
			System.out.println(this.name + " is sleeping. Zzzz");
	}

	public void walk() {
		System.out.println("You cannot walk this animal.");
	}

	public void play() {
		System.out.println("You cannot play with this animal.");
	}

	public void petTick() {
		if (this.sleep >= 100) {
			this.sleep();
		} else {
			this.isSleeping = false;
			this.hunger += 7 + Math.random() * 7;
			this.thirst += 7 + Math.random() * 7;
			this.sleep += 7 + Math.random() * 7;
			this.waste += 7 + Math.random() * 7;
			if (!this.health && Math.random() < 0.05)
				this.health = true;
		}
	}

	public void sleep() {
		this.isSleeping = true;
		this.sleep = 0;
		this.hunger += 20;
		this.thirst += 20;
		if (this.health && Math.random() < .20)
			this.health = false;
	}

	public void feed() {
		this.hunger -= (40 + Math.random() * 20);
		this.thirst += 10;
		this.waste += 20;
		if (this.hunger < 0)
			this.hunger = 0;
	}

	public void water() {
		this.thirst -= (50 + Math.random() * 20);
		this.waste += 10;
		if (this.thirst < 0)
			this.thirst = 0;
	}


	public void sickness() {
		this.health = false;
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

	public int getWaste() {
		return waste;
	}

	public void setWaste(int waste) {
		this.waste = waste;
	}

	public int getSleep() {
		return sleep;
	}

	public void setSleep(int sleep) {
		this.sleep = sleep;
	}

	public boolean isSick() {
		return health;
	}

	public void setHealth(boolean health) {
		this.health = health;
	}

	public String getName() {
		return name;
	}

	@Override
	public int compareTo(Pet pets) {
		return this.getName().compareTo(pets.getName());
	}

	@Override
	public String toString() {
		return "(" + this.getClass().getSimpleName() + ") " + this.getName();
	}

}










//public abstract class Pet implements Comparable<Pet>{
//	
//	protected String petType;
//	protected String petName;
//	protected boolean health;
//	static int tick;
//	static int hunger;
//	static int thirst;
//	static int bored;
//	static int tired;
//	static int waste;
//	static boolean sleep;
//	
////We need a sleep function
////We need an ignore function
//		//Idk if function is the right word to use
//
////show status
//	
//	public String getPetType() {
//		return petType;
//	}
//
//	public String getPetName() {
//		return petName;
//	}
//
//    public void setPetName(String name) {
//        this.petName = petName;
//    }
//	
//	
//	public static void tick() {
//		tick = tick + (int) ((Math.random() * 3) + 1);
//		hunger = hunger + (int) ((Math.random() * 3) + 1);
//		thirst = thirst + (int) ((Math.random() * 3) + 1);
//		bored = bored + (int) ((Math.random() * 3) + 1);
//		tired = tired + (int) ((Math.random() * 3) + 1);
//	}
//	
//	public static void nothing() {
//		tick = tick + (int) ((Math.random() * 3) + 1);
//		hunger = hunger + (int) ((Math.random() * 3) + 1);
//		thirst = thirst + (int) ((Math.random() * 3) + 1);
//		bored = bored + (int) ((Math.random() * 3) + 1);
//		tired = tired + (int) ((Math.random() * 3) + 1);
//	}
//	
//	public static void feed() {
//		tick = tick + (int) ((Math.random() * 3) + 1);
//		hunger = hunger - (int) ((Math.random() * 13) + 1);
//		thirst = thirst + (int) ((Math.random() * 5) + 1);
//		tired = tired + (int) ((Math.random() * 3) + 1);
//		waste = waste + (int) ((Math.random() *2) + 1);
//	}
//	
//	public static void walk() {
//		tick = tick + (int) ((Math.random() * 3) + 1);
//		hunger = hunger + (int) ((Math.random() * 5) + 1);
//		thirst = thirst + (int) ((Math.random() * 5) + 1);
//		bored = bored - (int) ((Math.random() * 3) + 1);
//		waste = 0;
//	}
//
//	
//	public static void water() {
//		tick = tick + (int) ((Math.random() * 3) + 1);
//		thirst = thirst - (int) ((Math.random() * 7) + 1);
//		hunger = hunger - (int) ((Math.random() * 13) + 1);
//		tired = tired + (int) ((Math.random() * 3) + 1);
//	}
//	
//	public static void sleep() {
//		tick = tick + (int) ((Math.random() * 3) + 1);
//		thirst = thirst + (int) ((Math.random() * 5) + 1);
//		hunger = hunger + (int) ((Math.random() * 5) + 1);
//		tired = 0;
//	}
//	
//	public boolean isSick() {
//		return health;
//	}
//
//	public void health() {
//		this.health = false;
//	}
//
//	public void setHealth(boolean health) {
//		this.health = health;
//	}
//
//	public static int getHunger() {
//		return hunger;
//	}
//
//	public void setHunger(int hunger) {
//		this.hunger = hunger;
//	}
//
//	public static int getThirst() {
//		return thirst;
//	}
//
//	public void setThirst(int thirst) {
//		this.thirst = thirst;
//	}
//
//	public static int getBored() {
//		return bored;
//	}
//
//	public void setBored(int bored) {
//		this.bored = bored;
//	}
//
//	public static int getTired() {
//		return tired;
//	}
//
//	public void setTired(int tired) {
//		this.tired = tired;
//	}
//
//	public static int getWaste() {
//		return waste;
//	}
//
//	public void setWaste(int waste) {
//		this.waste = waste;
//	}
//	
//	public static boolean getSleep() {
//		return sleep;
//	}
//
//	public void setSleep(int health) {
//		this.sleep = sleep;
//	}
//
//	public static void add(Pet pet) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	
//	
//	//MAKE A SHOW STATUS
//	
//	
//	public void showStatus() {
//		// TODO Auto-generated method stub
//		System.out.println("");
//		health = this.health;
//		hunger = this.hunger;
//		thirst = this.thirst;
//		bored = this.bored;
//
//	}
//
//	public static Object getPetByName(String petName2) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	
//	
//	
////	@Override
////	public int compareTo(Pet other) {
////		if(this.getEmpName().equals(other.getEmpName())) {
////			return this.getEmpNumber().compareTo(other.getEmpNumber());
////		}
////		return this.getPetName().compareTo(other.getPetName());
////		
////	}
//
//}