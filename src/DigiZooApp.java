import java.util.Scanner;

public class DigiZooApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("This is your new Virtual Zoo!");

	//if/else statement for the individual choices of specific animals
		
		System.out.println("\nWhat would you like to do with this animal?");
		System.out.println("Press 1 to feed the animal ");
		System.out.println("Press 2 to give the animal water");
		System.out.println("Press 3 to play with the animal");
		System.out.println("Press 4 to let the animal out to the bathroom");
		System.out.println("Press 5 to put the animal to sleep");
		System.out.println("Press 6 to take the animal to to the doctor");
		System.out.println("Press 7 to do nothing");
		int task = input.nextInt();

		while (task != 9) {
			if (task == 1) {
				pet.feed();
				buddy.tick();
				System.out.println("You are now feeding the animal...");
			} else if (task == 2) {
				buddy.drink();
				buddy.tick();
				System.out.println("The animal is drinking up...");
			} else if (task == 3) {
				buddy.play();
				buddy.tick();
				System.out.println("You have chosen to play with the animal...");
			} else if (task == 4) {
				buddy.bathroom();
				buddy.tick();
				System.out.println("The animal is going to the bathroom...");
			} else if (task == 5) {
				buddy.sleep();
				buddy.tick();
				System.out.println("The animal is now sleeping...");
			} else if (task == 6) {
				buddy.doc();
				buddy.tick();
				System.out.println("The animal is now going to go to the doctor...");
			} else if (task == 7) {
				buddy.nothing();
				buddy.tick();
			}
			else if (task == 8) {
				System.out.println("Unfourtunatly you have entered a wrong number. Because of this, " + name + " got "
						+ "very angry and ran away from you... \n\nOne year later...\n\n" + name + " has not been found and"
								+ " you have given up hope on seeing your pet again :(. It is a very sad time. Please be "
								+ "more careful with your next pet.\n:):):) lol");
				System.exit(0);
			}

			System.out.println(buddy);
			System.out.println("\nWhat would you like to do with this animal?");
			System.out.println("Press 1 to feed the animal ");
			System.out.println("Press 2 to give the animal water");
			System.out.println("Press 3 to play with the animal");
			System.out.println("Press 4 to let the animal out to the bathroom");
			System.out.println("Press 5 to put the animal to sleep");
			System.out.println("Press 6 to take the animal to to the doctor");
			System.out.println("Press 7 to do nothing");
			int task = input.nextInt();
			}
	}

}

