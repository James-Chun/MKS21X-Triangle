public class Point {
    private double[] point = new double[2];
    
    public Point (double x,double y) {
        point[0] = x;
        point[1] = y;
    }
    
    public double getX() {
        return point[0];
    }
    public double getY() {
        return point[1];
    }
    public double distanceTo(double[] point1, double[] point2) {
        return Math.sqrt( Math.pow(point1.getX() - point2.getX(),2) + Math.pow(point1.getY() - point2.getY(), 2) );
    }
}