package petstoreproject.petstoreapp;
import java.util.*;
public class PetStore {
	
	private String storeName;
	private String address;
	
	private List<Pet> petList;
	
	private  List<String> daysOpened;
	
	public List<String> getDaysOpened() {
		return daysOpened;
	}
	public void setDaysOpened(List<String> daysOpened) {
		this.daysOpened = daysOpened;
	}
	public PetStore() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PetStore(String storeName, String address) {
		super();
		this.storeName = storeName;
		this.address = address;
	}
	public String getStoreName() {
		return storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public List<Pet> getPetList() {
		return petList;
	}
	public void setPetList(List<Pet> petList) {
		this.petList = petList;
	}
	

}
