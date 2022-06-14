package lab;
import java.util.*;

public class task3 {
	public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
		int height,width;
		float pi= 3.14f;
		System.out.print("Enter the height and width: ");
		height = s.nextInt();
		width = s.nextInt();
		
		if(height!=0&&width!=0)
		{
			float result = (3*pi)+(height*width)+((height*height)/(2*pi*width*width));
			System.out.print("Result= "+ result);
		}
		
		
	}

}
