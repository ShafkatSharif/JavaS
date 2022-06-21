package lab;
import java.util.*;
public class lab4task2 {
	public static void main (String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n= in.nextInt();
		int a[] = new int[n];
		int n3,n1=0,n2=1; 
		System.out.print(n1+" "+n2+" ");
		for(int i=2;i<n;i++) {
			n3=n1+n2;
			for(int j=0;j<n;j++) {
				a[j]=n3;
				System.out.print(a[j]+" ");
				break;
			}
			n1=n2;
			n2=n3;
		}
	}

}
