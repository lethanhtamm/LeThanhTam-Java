
public class Employee extends Person {
	private String employeeName;
	private String dateHired;
	public Employee() {}
	public Employee(String name,int tuoi,String gender,String employeeName,String date) {
		super(name,tuoi,gender);
		this.employeeName=employeeName;
		this.dateHired=date;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getDateHired() {
		return dateHired;
	}
	public void setDateHired(String dateHired) {
		this.dateHired = dateHired;
	}
	@Override
	public String toString() {
		return super.toString()+" Employee: " + employeeName + "| Date Hired: " + dateHired+ "|" ;
	}
	
}
