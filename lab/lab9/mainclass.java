package lab9;

public class mainclass {
	
		
	public static void main(String args[]) {
	Faculty f1 = new Faculty("asif","male",20,"13124","CSE",1000,"a","A");
	System.out.println(f1.getName());
	System.out.println(f1.getAge());
	System.out.println(f1.getSalary());
	System.out.println(f1.getInitial());
	System.out.println(f1.toString());
	f1.printinfo();
	}
}