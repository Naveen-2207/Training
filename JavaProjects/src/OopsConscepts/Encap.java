package OopsConscepts;

public class Encap {
	 private int Rollnum;
	 private String Name;
	 private char Grade;
	 private long MNo;
	 
	 




	public int getRollnum() {
		return Rollnum;
	}






	public void setRollnum(int rollnum) {
		Rollnum = rollnum;
	}






	public String getName() {
		return Name;
	}






	public void setName(String name) {
		Name = name;
	}






	public char getGrade() {
		return Grade;
	}






	public void setGrade(char grade) {
		Grade = grade;
	}






	public long getMNo() {
		return MNo;
	}






	public void setMNo(long mNo) {
		MNo = mNo;
	}






	public static void main(String[] args) {
		Encap st =new Encap();
		st.setRollnum(101);
		st.setName("Navee");
		st.setGrade('a');
		st.setMNo(9876543210l);
		System.out.println("RollNum: "+st.getRollnum());
		System.out.println("Name: "+st.getName());
		System.out.println("Grade: "+st.getGrade());
		System.out.println("M.No: "+st.getMNo());
	}

}
