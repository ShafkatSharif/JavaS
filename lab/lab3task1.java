/*
1.	Generate a random integer n between 5 and 20 (inclusive). Use for loop to 
print all integers from 0 to n separated by a space. To generate a random integer 
between min and max range:
int n = (int)(min+Math.random()*(max-min+1))
Sample Output:
Random integer: 7
0 1 2 3 4 5 6 7
*/

package lab;

public class lab3task1 {
	public static void main(String args[]) {
		
		
		int n  = (int)(5+Math.random()*(20-5+1));
		System.out.println("Random numner: "+n);
		for(int i=0;i<=n;i++) {
	    System.out.print(i+" ");
		}
	}

}
