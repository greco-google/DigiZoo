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
			System.out.println(pet.getPetName());
		}
	}
	
	public void showAllPetTypes() {
		for (Pet pet: pets) {
			System.out.println(pet.getPetName() + " is a " + pet.getPetType());
		}
	}
	
	public ArrayList<Pet> sortAscending() {
		Collections.sort(pets);
		return (ArrayList<Pet>)pets;
	}
}