package lab3;
public class Employee {
    // Атрибуты класса Employee
    private String name;
    private String position;
    private double salary;

    // Конструктор класса Employee
    public Employee(String name, String position, double salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    // Метод для расчета зарплаты
    public double calculateSalary() {
        // Здесь можно добавить логику расчета зарплаты, если это необходимо
        return salary;
    }

    // Метод для обновления зарплаты
    public void updateSalary(double newSalary) {
        this.salary = newSalary;
        System.out.println("Зарплата сотрудника " + name + " обновлена: " + newSalary);
    }

    public static void main(String[] args) {
        // Создание экземпляра класса Employee с использованием конструктора
        Employee employee1 = new Employee("John", "Manager", 50000.0);

        // Вывод информации о сотруднике
        System.out.println("Имя: " + employee1.name);
        System.out.println("Должность: " + employee1.position);
        System.out.println("Зарплата: " + employee1.salary);

        // Расчет зарплаты сотрудника
        double calculatedSalary = employee1.calculateSalary();
        System.out.println("Рассчитанная зарплата: " + calculatedSalary);

        // Обновление зарплаты сотрудника
        employee1.updateSalary(55000.0);
    }
}
