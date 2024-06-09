package lab3;
public class Rectangle {
    // Атрибуты класса Rectangle
    private double width;
    private double height;

    // Конструктор класса Rectangle
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Метод для вычисления площади прямоугольника
    public double calculateArea() {
        return width * height;
    }

    // Метод для вычисления периметра прямоугольника
    public double calculatePerimeter() {
        return 2 * (width + height);
    }

    public static void main(String[] args) {
        // Создание экземпляра класса Rectangle с использованием конструктора
        Rectangle rectangle = new Rectangle(5.0, 7.0);

        // Вычисление площади и периметра прямоугольника
        double area = rectangle.calculateArea();
        double perimeter = rectangle.calculatePerimeter();

        // Вывод результатов
        System.out.println("Площадь прямоугольника: " + area);
        System.out.println("Периметр прямоугольника: " + perimeter);
    }
}
