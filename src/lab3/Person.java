package lab3;
public class Person {
    // Атрибуты класса Person
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Person person1 = new Person("Alice", 30);
        Person person2 = new Person("Bob", 25);

        System.out.println("Имя: " + person1.getName() + ", Возраст: " + person1.getAge());
        System.out.println("Имя: " + person2.getName() + ", Возраст: " + person2.getAge());
    }
}
