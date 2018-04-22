import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Zoo {

	//Lowest level
	private List <Pet> pets = new ArrayList<>();
	
	public void addPet(Pet pet) {
		pets.add(pet);
	}
	
	public void showAllZooPets() {
		for (Pet pet: pets) {
			if (pet instanceof ***Something***) {
				System.out.println(pet);
			}
		}
	}
	
	public void showAllPetType() {
		for (Pet pet: pets) {
			System.out.println(pet.getPetType() + " is a " + pet.getPetType());
		}
	}
	
	public void showAllPetNames() {
		for(Pet pet: pets) {
			System.out.println(pet.getPetName());
		}
	}
	
	public ArrayList<Pet> sortAscending() {
		Collections.sort(pets);
		return (ArrayList<Pet>)pets;
	}
}
