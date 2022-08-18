/*Create a Triangle class. Now create IllegalTriangleException class that extends Exception. 
If the sum of any two sides is not greater than the third side, the Triangle class should throw 
IllegalTriangleException.*/
package Lab13;

public class task3 {
	public static void main(String[] args) {
		
	
	try {
		Triangle a= new Triangle(6, 1 ,1);
		System.out.println("Valid triangle");
	}
	catch(IlligalTriangleException e){
		System.out.println(e);
	}

}
}
