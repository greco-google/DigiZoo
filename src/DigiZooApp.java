import java.util.Scanner;

public class DigiZooApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		boolean incorrect = true;

		System.out.println("This is your new Virtual Zoo!");

	//if/else statement for the individual choices of specific animals
		//We need Status functionality
		
		//why incorrect??? hahaha
		while (incorrect) {
			System.out.println("\nWhat would you like to do with this animal?");
			System.out.println("Press 1 to feed the animal ");
			System.out.println("Press 2 to give the animal water");
			System.out.println("Press 3 to play with the animal");
			System.out.println("Press 4 to let the animal out to the bathroom");
			//System.out.println("Press 5 to put the animal to sleep");
			System.out.println("Press 5 to take the animal to to the doctor");
			System.out.println("Press 6 to do nothing");
			int task = input.nextInt();

			if (task == 1) {
				Pet.feed();
				Pet.tick();
				System.out.println("You are now feeding the animal...");
			}
			else if (task == 2) {
				Pet.water();
				Pet.tick();
				System.out.println("The animal is drinking up...");
			}
			else if (task == 3) {
				Pet.walk();
				Pet.tick();
				System.out.println("You have chosen to walk the animal...");
			}
			else if (task == 4) {
				Pet.walk();
				Pet.tick();
				System.out.println("The animal is going to the bathroom...");
			}
//			if (task == 5) {
//				Pet.sleep();
//				Pet.tick();
//				System.out.println("The animal is now sleeping...");
//			}
			else if (task == 5) {
				Pet.vet();
				Pet.tick();
				System.out.println("The animal is now going to go to the doctor...");
			}
//			else if (task == 7) {
//				Pet.nothing();
//				Pet.tick();
//			}
			else {
				System.out.println("Unfourtunatly you have entered a wrong number. Because of this, the animals got "
						+ "very angry and ran away from the zoo... \n\nOne year later...\n\nThe animals have not been found and"
								+ " you have given up hope on seeing your pets again :(. It is a very sad time. \nPlease be "
								+ "more careful with your next Pet.\n:):):) lol");
				System.exit(0);
			}
		}
	}

}
