package petstoreproject.petstoreapp;
import java.util.*;
public class PetService {
	
	private PetStore petStore;
	
	private PetHelpLineService petHelpLineService;
	
	private Map<Integer,String> cityList;
	
	private List<RescueChamp> rescueChampList;
	
	

	public List<RescueChamp> getRescueChampList() {
		return rescueChampList;
	}

	public void setRescueChampList(List<RescueChamp> rescueChampList) {
		this.rescueChampList = rescueChampList;
	}

	public PetService() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PetService(PetStore petStore) {
		super();
		this.petStore = petStore;
	}
	
	
	
	

	public Map<Integer, String> getCityList() {
		return cityList;
	}

	public void setCityList(Map<Integer, String> cityList) {
		this.cityList = cityList;
	}

	public PetStore getPetStore() {
		return petStore;
	}

	public void setPetStore(PetStore petStore) {
		this.petStore = petStore;
	}

	public PetHelpLineService getPetHelpLineService() {
		return petHelpLineService;
	}

	public void setPetHelpLineService(PetHelpLineService petHelpLineService) {
		this.petHelpLineService = petHelpLineService;
	}
	
	 

}
