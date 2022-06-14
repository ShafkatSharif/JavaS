package lab;
import java.util.*;

public class lab2task2 {
	public static void main(String args[]) {
	Scanner s = new Scanner(System.in);
	int i,id[]= new int[5],sec[]= new int[5];
	String name[] = new String[5],gender[]= new String[5];
	float cgpa[]= new float[5];
	System.out.println("Enter the info of students= ");
	for(i=0;i<5;i++)
	{
		System.out.println("Enter student no "+(i+1)+" info ");
		System.out.print("Enter student name= ");
		name[i]=s.next();
		System.out.println("Enter student id= ");
		id[i]=s.nextInt();
		System.out.print("Enter student sec= ");
		sec[i]=s.nextInt();
		System.out.print("Enter student Gender= ");
		gender[i]=s.next();  
		System.out.print("Enter student's Cgpa= ");
		cgpa[i]=s.nextFloat();
	}
	
	for(i=0;i<5;i++)
	{
		if(gender[i].equals("female") && name[i].length()==4)
		{
			System.out.println("ID:"+id[i]);
			System.out.println("sec:"+sec[i]);
		}
		
	}
	
	for(i=0;i<5;i++)
	{
		if(gender[i].equals("male") && name[i].startsWith("S"))
		{
			System.out.println("Name:"+name[i]);
			System.out.println("CGPA:"+cgpa[i]);
		}
		
	}
	}

}
