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
			System.out.println("Press 3 to show all of the pets that are in your zoo");
			System.out.println("Press 4 to interact with your pets");
			System.out.println("Press 5 to exit");
			int task = input.nextInt();
		
		if (task == 1) {
			
		    while (true) {
		        System.out.println("What's the name of the pet you want to add: ");
		        petName = input.next();
		        if (Pet.getPetByName(petName) != null) {
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
		            variety = input.nextInt();
		        } catch (Exception e) {
		            System.out.println("That was not one of the options! Try again");
		            continue;
		        }

		        switch (variety) {
		        		if (task == 1) {
		                Pet.add(new Dog(petName));
		                break choosePetType;
		        		}
		        		else if (task == 2) {
		                Pet.add(new Cat(petName));
		                break choosePetType;
		        		}
		        		else if (task == 3) {
		                Pet.add(new Lion(petName));
		                break choosePetType;
		        		}
		        		else if (task == 4) {
		                Pet.add(new Tiger(petName));
		                break choosePetType;
		        		}
		        		else if (task == 5) {
		                Pet.add(new Wolf(petName));
		                break choosePetType;
		        		}
		        		else {
		                System.out.println("That was not one of the options! Try again");
		        		}
		        }
		    }
		    System.out.println("You have added " + petName + " to the DigiZoo!");
		    break;
		    
		}
		else if (task == 2) {
		    System.out.println("What is the name of the pet you want to release into thw wild: ");
		    petName = input.next();
		    Pet.removePet(petName);
		    System.out.println("You released the animal into the wilderness!");
		    break;
		}
		
		else if (task == 3) {
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
		            variety = input.nextInt();
		        } catch (Exception e) {
		        		System.out.println("That was not one of the options! Try again");
		            continue;
		        }

		        switch (variety) {
		        		if (task == 1) {
		                Pet.displayAll();
		                break display;
		        		}
		        		else if (task == 2) {
		                Pet.displayDomesticated();
		                break display;
		        		}
		        		else if (task == 3) {
		                Pet.displayFeral();
		                break display;
		        		}
		        		else if (task == 4) {
		                Pet.displayCanines();
		                break display;
		        		}
		        		else if (task == 5) {
		                Pet.displayFelines();
		                break display;
		        		}
		        		else if (task == 6) {
		                break display;
		        		}
		        		else {
		        			System.out.println("That was not one of the options! Try again");
		        		}
		        }
		    }
		    break;
		else if (task == 4) {
		    Pet pet;
		    while (true) {
		        System.out.println("What's the name of the pet you want to care for: ");
		        petName = input.next();
		        if ((pet = Pet.getPetByName(petName)) == null) {
		            System.out.println("That is not one of the pets in the Zoo. Try again");
		        } 
		        else {
		            break;
		        }
		    }
		}
		    System.out.println(((((((((Pet List)))))))));
		    
		else if (task == 5) {
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
		            variety = input.nextInt();
		        } catch (Exception e) {
		        		System.out.println("That was not one of the options! Try again");
		            continue;
		        }

		        switch (instruction) {
		           if (task == 1 ) {
		                Pet.feed();
		                break chooseAction;
		           }
		            else if (task == 2) {
		                Pet.water();
		                break chooseAction;
		            }
		            else if (task == 3) {
		                Pet.bathroom();
		                break chooseAction;
		            }
		            else if (task == 4) {
		                Pet.play();
		                break chooseAction;
		            }
		            else if (task == 5) {
		                Pet.walk();
		                break chooseAction;
		            }
		            else if (task == 6) {
		                Pet.doctor();
		                break chooseAction;
		            }
		            else if (task == 7) {
		                break chooseAction;
		            }
		            else {
		                System.out.println("Invalid instruction, input again!");
		            }
		        }
		    }
		    break;
		//}
		
		
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
		}
	}
}


