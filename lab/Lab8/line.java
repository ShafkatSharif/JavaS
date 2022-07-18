package Lab8;

public class line {
    private point start = new point();
    private point end = new point();
    line(point start , point end)
    {
        this.start = start;
        this.end = end;
    }
    line(int x1, int y1, int x2 , int y2){
        start.setX(x1);
        start.setY(y1);
        end.setX(x2);
        end.setY(y2);
    }
    point getStart(){
        return start;
    }
    point getEnd(){
        return end;
    }
    void setStart(point start)
    {
        this.start = start;
    }
    void setEnd(point end)
    {
        this.end = end;
    }
    public double length(){
        return start.distance(this.end);
    }

}
