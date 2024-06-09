package lab2;

public class task2 {
    private double radius;
    private static int numberOfObjects = 0;
    public task2() {
        this(1.0);
    }
    public task2(double newRadius) {
        setRadius(newRadius);
        numberOfObjects++;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double newRadius) throws IllegalArgumentException {
        if (newRadius >= 0) {
            radius = newRadius;
        } else {
            throw new IllegalArgumentException("радиус не может быть отрицательным");
        }
    }
    public static int getNumberOfObjects() {
        return numberOfObjects;
    }
    public double findArea() {
        return radius * radius * Math.PI;
    }
    public static void main(String[] args) {
        task2 circle1 = new task2();
        task2 circle2 = new task2(5.0);

        System.out.println("радиус круга 1: " + circle1.getRadius());
        System.out.println("площадь круга 1: " + circle1.findArea());
        System.out.println("радиус круга 2: " + circle2.getRadius());
        System.out.println("площадь круга 2: " + circle2.findArea());
        System.out.println("количество объектов: " + task2.getNumberOfObjects());
    }
}