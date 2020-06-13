package methods;

import object.Vector;

public class VectorsIntersection {
    public static double getAngle(Vector a, Vector b) {
        double[] aCoordinates = a.getCoordinates();
        double[] bCoordinates = b.getCoordinates();
        double angle = 0;
        for(int i = 0; i < 3; i++) {
            angle = angle + aCoordinates[i]*bCoordinates[i];
        }
        double aLength = 0;
        double bLength = 0;
        for(int i = 0; i < 3; i++) {
            aLength = aLength + aCoordinates[i]*aCoordinates[i];
        }
        for(int i = 0; i < 3; i++) {
            bLength = bLength + bCoordinates[i]*bCoordinates[i];
        }
        return Math.acos(angle/Math.sqrt(aLength*bLength));
    }
}
