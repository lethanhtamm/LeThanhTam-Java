
public class Person {
	private String name;
	private int tuoi;
	private String gender;
	public Person() {}
	public Person(String name,int tuoi,String gender) {
		this.name=name;
		this.tuoi=tuoi;
		this.gender=gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTuoi() {
		return tuoi;
	}
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "|Person:  " + name + "| Tuoi: " + tuoi + "| Gender: " + gender + "|";
	}
	
}
