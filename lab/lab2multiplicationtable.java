package lab;

public class lab2multiplicationtable {
	 public static void main(String[] args){
	        System.out.println("Multiplication Table\n");
	        
	        for(int i=1; i<=5; i++)
	        {
	        	System.out.println("Multiplication table of "+i);
	            for(int j=1; j<=10; j++){
	            	
	                System.out.println(i+" X "+j+" = "+(i*j));
	            }
	            System.out.print("\n");
	        }
	    }
	}


