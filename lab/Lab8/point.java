package Lab8;

public class point {
   private int x , y;
    point(int x , int y){
        this.x = x;
        this.y = y;
    }
    point(){};
     int getX(){
       return x;
    }
    int getY(){
        return y;
    }
    void setX(int x){
        this.x = x;
    }
    void setY(int y){
        this.y = y;
    }
    public String toString(){
         return "("+x+","+y+")";
    }
    public double distance(point point)
    {
        return Math.sqrt(Math.pow((point.x-this.x),2)+Math.pow((point.y-this.y),2));
    }


}
