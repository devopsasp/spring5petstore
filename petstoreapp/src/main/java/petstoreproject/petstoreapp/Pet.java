package petstoreproject.petstoreapp;

public class Pet {
	private String petName;
	private int age;
	private String type;
	
	public Pet() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Pet(String petName, int age, String type) {
		super();
		this.petName = petName;
		this.age = age;
		this.type = type;
	}
	public String getPetName() {
		return petName;
	}
	public void setPetName(String petName) {
		this.petName = petName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	

}
