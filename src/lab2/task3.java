package lab2;

public class task3 {
    public static void main(String[] args) {
        try {
            task2 c1 = new task2(5);
            task2 c2 = new task2(-5);
            task2 c3 = new task2(0);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex);
        }
        System.out.println("кол-во созданных объектов: " + task2.getNumberOfObjects());
    }
}