/*Write a program that creates an integer array of size 100 and initialize it with random values:
int a = (int) (Math.random() * 10000);
The program then takes an integer from user, use it as an index and tries to print the 
corresponding element of that array. If index is out of array size, the program should catch it 
and display appropriate message.*/

package Lab13;
import java.util.*;
public class task2  {
	
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
		int a[]  = new int[100];
		for(int i = 0 ; i<100 ; i++) {
			a[i] = (int) (Math.random()*10000);
		}
		int and = in.nextInt();
		try {
			System.out.println(a[and]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
