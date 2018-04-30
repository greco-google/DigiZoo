import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Zoo {

	//Lowest level
	private List <Pet> pets = new ArrayList<>();
	
	public void addPet(Pet pet) {
		pets.add(pet);
	}
	
	public void removePet(Pet pet) {
		pets.remove(pet);
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
	
	public void showAllDomesticated() {
		for (Pet pet: pets) {
			if(pet instanceof Domesticated) {
				System.out.println(pet);
			}
		}
	}
	
	public void showAllFeral() {
		for (Pet pet: pets) {
			if(pet instanceof Feral) {
				System.out.println(pet);
			}
		}
	}
	
	public void showAllCanines() {
		for (Pet pet: pets) {
			if(pet instanceof Canine) {
				System.out.println(pet);
			}
		}
	}
	
	public void showAllFelines() {
		for (Pet pet: pets) {
			if(pet instanceof Feline) {
				System.out.println(pet);
			}
		}
	}
	
	public ArrayList<Pet> sortAscending() {
		Collections.sort(pets);
		return (ArrayList<Pet>)pets;
	}
}