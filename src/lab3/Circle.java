package lab3;
public class Circle {
    // Атрибуты класса Circle
    private double radius;

    // Конструктор класса Circle
    public Circle(double radius) {
        this.radius = radius;
    }

    // Метод для получения радиуса круга
    public double getRadius() {
        return radius;
    }

    // Метод для установки радиуса круга
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Метод для вычисления площади круга
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Метод для вычисления окружности круга
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        // Создание экземпляра класса Circle с использованием конструктора
        Circle circle = new Circle(5.0);

        // Вычисление площади и окружности круга
        double area = circle.calculateArea();
        double circumference = circle.calculateCircumference();

        // Вывод результатов
        System.out.println("Площадь круга: " + area);
        System.out.println("Окружность круга: " + circumference);

        // Изменение радиуса круга и пересчет площади и окружности
        circle.setRadius(7.0);
        area = circle.calculateArea();
        circumference = circle.calculateCircumference();

        // Вывод результатов после изменения радиуса
        System.out.println("\nПосле изменения радиуса:");
        System.out.println("Площадь круга: " + area);
        System.out.println("Окружность круга: " + circumference);
    }
}
