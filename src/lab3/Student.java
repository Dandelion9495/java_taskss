package  lab3;
import java.util.ArrayList;
import java.util.List;

public class Student {
    // Атрибуты класса Student
    private String name;
    private int grade;
    private List<String> courses;

    // Конструктор класса Student
    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
        this.courses = new ArrayList<>();
    }

    // Метод для добавления курса
    public void addCourse(String course) {
        courses.add(course);
        System.out.println("Курс " + course + " добавлен для студента " + name);
    }

    // Метод для удаления курса
    public void removeCourse(String course) {
        if (courses.contains(course)) {
            courses.remove(course);
            System.out.println("Курс " + course + " удален для студента " + name);
        } else {
            System.out.println("Студент " + name + " не записан на курс " + course);
        }
    }

    public static void main(String[] args) {
        // Создание экземпляра класса Student
        Student student = new Student("John", 10);

        // Добавление и удаление курсов
        student.addCourse("Math");
        student.addCourse("Physics");
        student.removeCourse("Biology");
        student.removeCourse("Math");
    }
}
