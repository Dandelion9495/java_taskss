package lab3;
public class Dog {
    // Атрибуты класса Dog
    private String name;
    private String breed;

    // Конструктор класса Dog
    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    // Метод для установки имени собаки
    public void setName(String name) {
        this.name = name;
    }

    // Метод для получения имени собаки
    public String getName() {
        return name;
    }

    // Метод для установки породы собаки
    public void setBreed(String breed) {
        this.breed = breed;
    }

    // Метод для получения породы собаки
    public String getBreed() {
        return breed;
    }

    public static void main(String[] args) {
        // Создание двух экземпляров класса Dog с использованием конструктора
        Dog dog1 = new Dog("Buddy", "Labrador");
        Dog dog2 = new Dog("Max", "German Shepherd");

        // Выводим имя и породу каждой собаки
        System.out.println("Собака 1: Имя - " + dog1.getName() + ", Порода - " + dog1.getBreed());
        System.out.println("Собака 2: Имя - " + dog2.getName() + ", Порода - " + dog2.getBreed());

        // Изменяем атрибуты с помощью методов установки
        dog1.setName("Rocky");
        dog2.setBreed("Golden Retriever");

        // Выводим обновленные значения
        System.out.println("\nОбновленные значения:");
        System.out.println("Собака 1: Имя - " + dog1.getName() + ", Порода - " + dog1.getBreed());
        System.out.println("Собака 2: Имя - " + dog2.getName() + ", Порода - " + dog2.getBreed());
    }
}
