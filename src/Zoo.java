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
	
	
	
	
	public void addOrder(Items theOrder) {
		orders.add(theOrder);
	}
	
	public void removeVariety(String variety) {
		for(int i = orders.size() - 1; i >= 0; i--) {
			if(orders.get(i).getVariety().equals(variety)) {
				orders.remove(i);
			}
		}
	}
	
	public void updateOrder(String variety, double price, int numItem) {
		for(int i = 0; i < orders.size(); i++) {
			if(orders.get(i).getVariety().equals(variety)) {
				orders.set(i, new Items(variety, price, numItem));
			}
		}
}