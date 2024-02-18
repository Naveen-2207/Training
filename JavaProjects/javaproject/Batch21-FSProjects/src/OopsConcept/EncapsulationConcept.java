package OopsConcept;

class Student{
	private int rollNo;
	private String studName;
	private char studGrade;
	private long studNumber;
	
	//getters and setters 
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public char getStudGrade() {
		return studGrade;
	}
	public void setStudGrade(char studGrade) {
		this.studGrade = studGrade;
	}
	public long getStudNumber() {
		return studNumber;
	}
	public void setStudNumber(long studNumber) {
		this.studNumber = studNumber;
	}
}

public class EncapsulationConcept {
	public static void main(String[] args) {
		Student studentObj = new Student();
		studentObj.setRollNo(1);
		studentObj.setStudName("Vikram");
		studentObj.setStudGrade('A');
		studentObj.setStudNumber(84646848645l);
		System.out.println("Roll No: " + studentObj.getRollNo());
		System.out.println("Name: " + studentObj.getStudName());
		System.out.println("Grade: " + studentObj.getStudGrade());
		System.out.println("Number: " + studentObj.getStudNumber());

	}

}
