package lab;
import java.util.*;
public class lab4task1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int c=0,a[]= new int[6];
		float s=0;
         for (int i=0;i<6;i++) {
        	 a[i] = in.nextInt();	
         }
         for (int i=0;i<6;i++) {
        	 s+=a[i];	
         }
         
         float avg=s/6;
         for (int i=0;i<6;i++) {
        	 if(a[i]>avg) {
        		 c++;
        	 }	
         }
         float persentage = c*100/6;
         System.out.println("Avg: "+avg+"\nPersantage: "+persentage);
	}

}
