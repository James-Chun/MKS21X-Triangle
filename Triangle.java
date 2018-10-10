public class Triangle {
    private double[][] points = new double[3][];
    private String triangleName;
    
    public Triangle (double[] point1, double[] point2, double[] point3) {
        points[0] = point1;
        points[1] = point2;
        points[2] = point3;
    }
    
    public double getPerimeter() {
        return Math.sqrt( this.point1*this.point1 + point2*point2 ) + Math.sqrt( point3*point3 + point2*point2 ) + Math.sqrt( point1*point1 + point3*point3 );
    }
    
}