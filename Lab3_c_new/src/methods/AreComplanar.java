package methods;

import object.Vector;

public class AreComplanar {
    public static boolean areComlanar(Vector a, Vector b, Vector c) {
        return 0 == a.getCoordinates()[0]*(b.getCoordinates()[1]*c.getCoordinates()[2] - b.getCoordinates()[2]*c.getCoordinates()[1]) - a.getCoordinates()[1]*(b.getCoordinates()[0]*c.getCoordinates()[2] - b.getCoordinates()[2]*c.getCoordinates()[0]) + a.getCoordinates()[2]*(b.getCoordinates()[0]*c.getCoordinates()[1] - b.getCoordinates()[1]*c.getCoordinates()[0]);
    }
}
