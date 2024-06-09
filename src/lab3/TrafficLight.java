package lab3;
public class TrafficLight {
    // Атрибуты класса TrafficLight
    private String color;
    private int duration;

    // Конструктор класса TrafficLight
    public TrafficLight(String color, int duration) {
        this.color = color;
        this.duration = duration;
    }

    // Метод для изменения цвета светофора
    public void changeColor(String newColor) {
        this.color = newColor;
    }

    // Метод для проверки, является ли текущий цвет красным
    public boolean isRed() {
        return color.equalsIgnoreCase("red");
    }

    // Метод для проверки, является ли текущий цвет зеленым
    public boolean isGreen() {
        return color.equalsIgnoreCase("green");
    }

    public static void main(String[] args) {
        // Создание экземпляра светофора
        TrafficLight trafficLight = new TrafficLight("red", 60);

        // Изменение цвета светофора
        trafficLight.changeColor("green");

        // Проверка текущего цвета светофора
        if (trafficLight.isRed()) {
            System.out.println("Светофор горит красным.");
        } else if (trafficLight.isGreen()) {
            System.out.println("Светофор горит зеленым.");
        } else {
            System.out.println("Светофор горит другим цветом.");
        }
    }
}
