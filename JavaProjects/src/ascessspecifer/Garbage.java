package ascessspecifer;

public class Garbage {
	
	public void display() {
		int a = 10;
		Garbage kut = new Garbage();//Methods 5 calling fun only.
		
	}
	public void finalize() {
		System.out.println("Hi im Naveen");
	}

	public static void main(String[] args) {
		Garbage nav =new Garbage();
		nav=null;//Method 1
		Garbage nav1 =new Garbage();
		nav1=nav;//Method 2
		Garbage nav2 =new Garbage();
		nav2=null;//Method 3
		Garbage nav3 =new Garbage();
		nav3=null;//Method 4 all object is null ioi(island of isolation)
		System.gc();
		System.out.println(nav);
		System.out.println(nav1);
		System.out.println(nav2);
		System.out.println(nav3);
		Runtime n=Runtime.getRuntime()	;
	    n.gc();	
	    System.out.println(n);
 	}
 
}
 