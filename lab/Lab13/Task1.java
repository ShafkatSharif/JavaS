/*write a program that takes 10 positive integers from user and prints the sum. If any negative 
value  is  entered,  the  program  should  catch  it  as  an  exception  and  display  “Input  positive 
integer only”. The program must continue taking input until it gets 10 positive integers.*/

package Lab13;
import java.util.Scanner;

class InvalidNumberException extends Exception{
	public String toString() {
		return "Input positive integers only";
	}
}

public class Task1  {
	static Scanner in = new Scanner(System.in);  
	int s=0;
	  Task1() throws InvalidNumberException{
		  int a[] = new int[10];
		  for(int n=0 ; n<10; n++) {
			  a[n] = in.nextInt();
		  }
		  for(int n=0 ; n<10; n++) {
		  if(a[n]<0) throw new InvalidNumberException();
		  else s+=a[n];
	  }
	  System.out.println(s);
	  }
	  
		


	public static void main(String[] args) {
		try {
		   System.out.println("Enter numbers");
		   Task1 a = new Task1();
		}
		catch(InvalidNumberException e) {
			System.out.println(e);
		}
	}
	

}
