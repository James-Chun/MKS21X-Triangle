public class Point {
    private double x;
    private double y;
    
    public Point (double xCoord,double yCoord) {
        x = xCoord;
        y = yCoord;
    }
    public Point (Point point) {
        x = point.x;
        y = point.y;
    }
    
    
    public double getX() {
        return this.x;
    }
    public double getY() {
        return this.y;
    }
    public double distanceTo(Point p2) {
        return Math.sqrt( Math.pow(this.x - p2.x,2) + Math.pow(this.y - p2.y, 2) );
    }
    public double distance(Point p1,Point p2) {
        return Math.sqrt( Math.pow(p1.x - p2.x,2) + Math.pow(p2.y - p2.y, 2) );
    }
    public String toString() {
        return  "(" + x + "," + y + ")";
    }
}