import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Zoo {

	List<Pet> zoo = new ArrayList<>();

	public void tick() {
		for (Pet p : zoo)
			p.petTick();
	}

	public void showPetStats() {
		for (Pet p : zoo)
			p.showStats();
	}

	public void addPet(Pet p) {
		zoo.add(p);
	}
	
	public Pet getPetByName(String name) {
		Pet _p = zoo.get(0);
		for (Pet p:zoo) 
			if (p.getName().equals(name)) 
				_p = p;
		return _p;
	}

	public void removePet(Pet p) {
		zoo.remove(p);
	}

	public void showAllPetsByName() {
		Collections.sort(zoo);
		for (Pet p : zoo)
			System.out.println(p);
	}

	public void showAllDomesticated() {
		for (Pet p : zoo) {
			if (p instanceof Domesticated)
				System.out.println(p);
		}
	}

	public void showAllFeral() {
		for (Pet p : zoo) {
			if (p instanceof Feral)
				System.out.println(p);
		}
	}

	public void showAllCanine() {
		for (Pet p : zoo) {
			if (p instanceof Canine)
				System.out.println(p);
		}
	}

	public void showAllFeline() {
		for (Pet p : zoo) {
			if (p instanceof Feline)
				System.out.println(p);
		}
	}

}







//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//
//public class Zoo {
//
//	//fix show
//	
//	//Lowest level
//	private List <Pet> pets = new ArrayList<>();
//	
//	public void addPet(Pet pet) {
//		pets.add(pet);
//	}
//	
//	public void removePet(Pet pet) {
//		pets.remove(pet);
//	}
//	
//	public void showAllPetsName() {
//		Collections.sort(pets);
//		for (Pet pet: pets) {
//			System.out.println(pet.getPetName());
//		}
//	}
//	
//	public void showAllPetTypes() {
//		for (Pet pet: pets) {
//			System.out.println(pet.getPetName() + " is a " + pet.getPetType());
//		}
//	}
//	
//	public void showAllDomesticated() {
//		for (Pet pet: pets) {
//			if(pet instanceof Domesticated) {
//				System.out.println(pet);
//			}
//		}
//	}
//	
//	public void showAllFeral() {
//		for (Pet pet: pets) {
//			if(pet instanceof Feral) {
//				System.out.println(pet);
//			}
//		}
//	}
//	
//	public void showAllCanines() {
//		for (Pet pet: pets) {
//			if(pet instanceof Canine) {
//				System.out.println(pet);
//			}
//		}
//	}
//	
//	public void showAllFelines() {
//		for (Pet pet: pets) {
//			if(pet instanceof Feline) {
//				System.out.println(pet);
//			}
//		}
//	}
//	
//	public void petStatus() {
//		for (Pet pet: pets) {
//			pet.showStatus();
//		}
//	}
//	
//	
////	public ArrayList<Pet> sortAscending() {
////		Collections.sort(pets);
////		return (ArrayList<Pet>)pets;
////	}
//}