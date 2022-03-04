package petstoreproject.petstoreapp;

public class RescueChamp {
	private String champName;
	private int animalRescued;
	
	
	
	public RescueChamp() {
		super();
	}
	public RescueChamp(String champName, int animalRescued) {
		super();
		this.champName = champName;
		this.animalRescued = animalRescued;
	}
	public String getChampName() {
		return champName;
	}
	public void setChampName(String champName) {
		this.champName = champName;
	}
	public int getAnimalRescued() {
		return animalRescued;
	}
	public void setAnimalRescued(int animalRescued) {
		this.animalRescued = animalRescued;
	}
	

}
