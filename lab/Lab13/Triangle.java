
package Lab13;

public class Triangle {
	int a, b, c ;
	Triangle(int a , int b , int c) throws IlligalTriangleException{
		this.a = a;
		this.b = b; 
		this.c = c;
		
		if((a+b)<c||(a+c)<b||(b+c)<a)
			throw new IlligalTriangleException();
	}
   
}
