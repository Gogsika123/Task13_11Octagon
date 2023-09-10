public class Main {//test octagon
    public static void main(String[] args) {
        Octagon octagon1 = new Octagon(5);
        Octagon octagon2 = null;
        try {
            octagon2 = octagon1.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning not supported");
        }
        System.out.println("Octagon 1 - Area: " + octagon1.getArea());
        System.out.println("Octagon 1 - Perimeter: " + octagon1.getPerimeter());
        System.out.println("Octagon 2 (Cloned) - Area: " + octagon2.getArea());
        System.out.println("Octagon 2 (Cloned) - Perimeter: " + octagon2.getPerimeter());
        int comparisonResult = octagon1.compareTo(octagon2);
        if (comparisonResult == 0) {
            System.out.println("Octagon 1 and Octagon 2 have the same area.");
        } else if (comparisonResult < 0) {
            System.out.println("Octagon 1 has a smaller area than Octagon 2.");
        } else {
            System.out.println("Octagon 1 has a larger area than Octagon 2.");
        }
    }
}
