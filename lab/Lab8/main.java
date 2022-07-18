package Lab8;

public class main {
    public static void main(String[] args) {
        point point1 = new point(3,2);
        point point2 = new point(1,2);
        line l = new line(point1,point2);
        System.out.println("length of "+point1+" and "+point2+" ="+l.length());
    }
}
