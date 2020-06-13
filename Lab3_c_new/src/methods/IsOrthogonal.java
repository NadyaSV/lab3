package methods;

import object.Vector;

public class IsOrthogonal {
    public static boolean isOrthogonal(Vector a, Vector b) {
        return 0 == VectorsIntersection.getAngle(a, b);
    }
}
