public class Pet {
	
	protected String petType;
	protected String petName;


	public String getPetType() {
		return petType;
	}

	public String getPetName() {
		return petName;
	}

	@Override
	public int compareTo(Pet other) {
//		if(this.getEmpName().equals(other.getEmpName())) {
//			return this.getEmpNumber().compareTo(other.getEmpNumber());
//		}
		return this.getPetName().compareTo(other.getPetName());
		
	}

}
