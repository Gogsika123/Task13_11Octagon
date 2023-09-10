// Octagon.java
public class Octagon extends GeometricObject implements Comparable<Octagon>, Cloneable {
    private double side;

    public Octagon(double side) {
        this.side = side;
    }
    public double getSide() {
        return side;
    }
    @Override
    public double getArea() {
        return (2 + 4 / Math.sqrt(2)) * side * side;
    }
    @Override
    public double getPerimeter() {
        return 8 * side;
    }
    @Override
    public int compareTo(Octagon o) {
        if (this.getArea() < o.getArea()) {
            return -1;
        } else if (this.getArea() > o.getArea()) {
            return 1;
        }
        return 0;
    }
    @Override
    public Octagon clone() throws CloneNotSupportedException {
        return (Octagon) super.clone();
    }
}