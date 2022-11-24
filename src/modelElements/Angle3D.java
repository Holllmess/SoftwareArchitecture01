package modelElements;

public class Angle3D {
    private Vector3D vector01;
    private Vector3D vector02;
    private double angle;

    public Vector3D getVector01() {
        return vector01;
    }

    public Vector3D getVector02() {
        return vector02;
    }

    public double getAngle() {
        return angle;
    }

    public Angle3D(Vector3D vector01, Vector3D vector02) {
        this.vector01 = vector01;
        this.vector02 = vector02;
    }
}
