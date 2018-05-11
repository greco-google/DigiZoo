import java.util.Scanner;

public class DigiZooApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		boolean incorrect = true;

		System.out.println("This is your new Virtual Zoo!");

	//if/else statement for the individual choices of specific animals
		//We need Status functionality
		
		while (incorrect) {
			System.out.println("\nWhat would you like to do your animals?");
			System.out.println("Press 1 to add a new pet");
			System.out.println("Press 2 to release one of your pets into the wild");
			System.out.println("Press 3 to showw all of the pets that are in your zoo");
			System.out.println("Press 4 to interact with your pets");
			System.out.println("Press 5 to exit");
			int task = input.nextInt();
		
		case 1:
		    while (true) {
		        System.out.println("What's the name of the pet you want to add: ");
		        name = scanner.next();
		        if (zoo.getPetByName(name) != null) {
		            System.out.println("This name has already existed, choose another one!");
		        } else {
		            break;
		        }
		    }
		    choosePetType:
		    while (true) {
		        System.out.println("Which pet do you want to add: (1, 2, 3, 4 or 5)");
		        System.out.println("1. Dog");
		        System.out.println("2. Cat");
		        System.out.println("3. Lion");
		        System.out.println("4. Tiger");
		        System.out.println("5. Wolf");
		        try {
		            instruction = scanner.nextInt();
		        } catch (Exception e) {
		            System.out.println("Invalid instruction, input again!");
		            continue;
		        }

		        switch (instruction) {
		            case 1:
		                zoo.addPet(new Dog(name));
		                break choosePetType;
		            case 2:
		                zoo.addPet(new Cat(name));
		                break choosePetType;
		            case 3:
		                zoo.addPet(new Lion(name));
		                break choosePetType;
		            case 4:
		                zoo.addPet(new Tiger(name));
		                break choosePetType;
		            case 5:
		                zoo.addPet(new Wolf(name));
		                break choosePetType;
		            default:
		                System.out.println("Invalid instruction, input again!");
		        }
		    }
		    System.out.println("Add done!");
		    break;
		case 2:
		    System.out.println("What's the name of the pet you want to remove: ");
		    name = scanner.next();
		    zoo.removePet(name);
		    System.out.println("Remove done!");
		    break;
		case 3:
		    display:
		    while (true) {
		        System.out.println("Here lists display instructions: (1, 2, 3, 4, 5 or 6)");
		        System.out.println("1. Display all");
		        System.out.println("2. Display all domesticated");
		        System.out.println("3. Display all feral");
		        System.out.println("4. Display canines");
		        System.out.println("5. Display felines");
		        System.out.println("6. Back to main menu");
		        try {
		            instruction = scanner.nextInt();
		        } catch (Exception e) {
		            System.out.println("Invalid instruction, input again!");
		            continue;
		        }

		        switch (instruction) {
		            case 1:
		                zoo.displayAll();
		                break display;
		            case 2:
		                zoo.displayDomesticated();
		                break display;
		            case 3:
		                zoo.displayFeral();
		                break display;
		            case 4:
		                zoo.displayCanines();
		                break display;
		            case 5:
		                zoo.displayFelines();
		                break display;
		            case 6:
		                break display;
		            default:
		                System.out.println("Invalid instruction, input again!");
		        }
		    }
		    break;
		case 4:
		    VirtualPet pet;
		    while (true) {
		        System.out.println("What's the name of the pet you want to care for: ");
		        name = scanner.next();
		        if ((pet = zoo.getPetByName(name)) == null) {
		            System.out.println("This pet is not valid, choose another one!");
		        } else {
		            break;
		        }
		    }
		    System.out.println(pet);
		    chooseAction:
		    while (true) {
		        System.out.println("What care do you want to do for this pet: (1, 2, 3, 4, 5, 6 or 7)");
		        System.out.println("1. Feed it");
		        System.out.println("2. Water it");
		        System.out.println("3. Out to bathroom");
		        System.out.println("4. Play with it");
		        System.out.println("5. Walk it");
		        System.out.println("6. Take it to doctor");
		        System.out.println("7. Back to main menu");
		        try {
		            instruction = scanner.nextInt();
		        } catch (Exception e) {
		            System.out.println("Invalid instruction, input again!");
		            continue;
		        }

		        switch (instruction) {
		            case 1:
		                pet.feed();
		                break chooseAction;
		            case 2:
		                pet.water();
		                break chooseAction;
		            case 3:
		                pet.bathroom();
		                break chooseAction;
		            case 4:
		                pet.play();
		                break chooseAction;
		            case 5:
		                pet.walk();
		                break chooseAction;
		            case 6:
		                pet.doctor();
		                break chooseAction;
		            case 7:
		                break chooseAction;
		            default:
		                System.out.println("Invalid instruction, input again!");
		        }
		    }
		    break;
		}
		
		
		
		
		
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







switch (instruction) {

case 5:
    zoo.tick();
    System.out.println("Tick done!");
    break;
case 6:
    break main;
default:
    System.out.println("Invalid instruction, input again!");
}
}
scanner.close();
System.out.println("Goodbye~");
}
}
