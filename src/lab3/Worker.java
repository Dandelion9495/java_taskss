package lab3;
import java.time.LocalDate;
import java.time.Period;

public class Worker {
    // Атрибуты класса Worker
    private String name;
    private double salary;
    private LocalDate hireDate;

    // Конструктор класса Worker
    public Worker(String name, double salary, LocalDate hireDate) {
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    // Метод для расчета стажа работы
    public int calculateExperienceYears() {
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(hireDate, currentDate);
        return period.getYears();
    }

    public static void main(String[] args) {
        // Создание экземпляра класса Worker с использованием конструктора
        LocalDate hireDate = LocalDate.of(2018, 6, 15); // Пример даты приема на работу
        Worker worker = new Worker("John Doe", 50000.0, hireDate);

        // Вывод информации о работнике и его стаже работы
        System.out.println("Имя: " + worker.name);
        System.out.println("Зарплата: " + worker.salary);
        System.out.println("Дата приема на работу: " + worker.hireDate);
        System.out.println("Стаж работы (в годах): " + worker.calculateExperienceYears());
    }
}
