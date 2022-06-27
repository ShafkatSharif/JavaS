/**/
package bookch6n7;
import java.util.*;
class Box {
    double width,height,depth;

    Box (double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }

    double volume() {
        return width*depth*height;
    }

}
public class constructor {

    public static void main(String args[]) {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter values of 1st: ");
        Box mybox1 =  new Box(in.nextDouble(),in.nextDouble(),in.nextDouble());
        System.out.println("Enter values of 2nd: ");
        Box mybox2 =  new Box(in.nextDouble(),in.nextDouble(),in.nextDouble());
        double vol;
        vol = mybox1.volume();
        System.out.println("The volume of 1st: "+vol);
        vol = mybox2.volume();
        System.out.println("The volume of 2nd: "+vol);
    }
}

