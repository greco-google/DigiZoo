public abstract class Domesticated extends Pet {

	protected int boredom;

	@Override
	public void petTick() {
		if (sleep >= 100) {
			this.sleep();
		} else {
			this.isSleeping = false;
			this.hunger += 7 + Math.random() * 7;
			this.thirst += 7 + Math.random() * 7;
			this.boredom += 7 + Math.random() * 7;
			this.sleep += 7 + Math.random() * 7;
			this.waste += 7 + Math.random() * 7;;
			if (!this.health && Math.random() < 0.05)
				this.health = true;
		}
	}

	@Override
	public void showStats() {
		if (!isSleeping)
			System.out.println("\n\nThis is your " + this.getClass().getSimpleName() + ":  " + this.getName() + "\n\nHis stats (out of 100) are:\nHunger: "
					+ this.hunger + "\nThirst: " + this.thirst + "\nWaste: " + this.waste
					+ "\nTiredness: " + this.sleep + "\nSick: " + this.health);
		else
			System.out.println(this.name + " is sleeping right now. Please come back later when he is awake.");
	}

	@Override
	public void play() {
		this.boredom = 0;
		this.sleep += 5;
		this.thirst += 10;
		this.hunger += 5;
	}

}







//public abstract class Domesticated extends Pet{
//
//    public void play() {
//        if (sleep) {
//            System.out.println("This pet is sleeping.");
//        } else {
//            bored -= 20;
//            if (bored < 0) bored = 0;
//            System.out.println("Play done!");
//        }
//    }
//}
