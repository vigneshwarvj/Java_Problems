package day05.solved;

public class AnimalSolved {

	int numLegs;      
	String species;


	public AnimalSolved(String speciesName, int noOfLegs){
		species = speciesName;    
		numLegs = noOfLegs;
	}

	@Override
	public String toString() {
		String animalDetails = "{ numLengs : "+numLegs+" species: "+species+" }";
		System.out.println(animalDetails);
		return animalDetails;
	}
	


}