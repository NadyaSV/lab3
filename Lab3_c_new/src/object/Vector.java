package object;


public class Vector {
    double[] coordinates = new double[3];
    public double[] getCoordinates() {
        return this.coordinates;
    }
    public void setCoordinates(double x,double y, double z) {
        this.coordinates[0] = x;
        this.coordinates[1] = y;
        this.coordinates[2] = z;
    }
    public Vector(double x, double y, double z) {
        this.coordinates[0] = x;
        this.coordinates[1] = y;
        this.coordinates[2] = z;
    }
}