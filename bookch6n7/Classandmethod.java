package bookch6n7;
import java.util.Scanner;
class box{
	double height,width,depth;
	
	double volume() {
		return width*depth*height;
	}
	void setDim(double w, double h, double d) {
		width = w;
		height = h;
		depth = d;
	}
	
}
public class Classandmethod {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		box mybox1 = new box();
		box mybox2 = new box();
		double vol;
		System.out.println("Enter the values of mybox1: ");
		mybox1.setDim(in.nextDouble(),in.nextDouble(),in.nextDouble());
		System.out.println("Enter the values of mybox2: ");
		mybox2.setDim(in.nextDouble(),in.nextDouble(),in.nextDouble());
		vol = mybox1.volume();
		System.out.println("Volume of box1: "+vol);
		vol = mybox2.volume();
		System.out.println("Volume of box2: "+vol);
	}
	

}
