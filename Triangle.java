public class Triangle {
    private Point v1 ;
    private Point v2 ;
    private Point v3 ;

    public Triangle (double x1, double y1, double x2, double y2, double x3, double y3) {
        v1 = new Point (x1, y1);
        v2 = new Point (x2, y2);
        v3 = new Point (x3, y3);
    }
    public Triangle (Point p1, Point p2, Point p3) {
        v1 = p1;
        v2 = p2;
        v3 = p3;
    }
    
    public double getPerimeter() {
        return v1.distanceTo(v2) + v3.distanceTo(v2) + v1.distanceTo(v3);
    }
    
    public String toString() {
        return "Triangle:" + v1 +" " + v2 + " " + v3;
    }
    public Point getVertex(int index) {
        if (index == 0) {
            return new Point(v1);
        }
        if (index == 1) {
            return new Point(v2);
        }
        return new Point(v3);
    }
    public void setVertex (int index, Point newP) {
        if (index == 0){
            v1 = newP;
        }
        if (index == 1){
            v2 = newP;
        }
        v3 = newP;
    }
}