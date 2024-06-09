package  lab3;
import java.util.ArrayList;

public class Book {
    // Атрибуты класса Book
    private String title;
    private String author;
    private String isbn;

    // Конструктор класса Book
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Методы для получения атрибутов книги
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    // Метод для добавления книги в коллекцию
    public static void addBook(ArrayList<Book> library, Book book) {
        library.add(book);
        System.out.println("Книга добавлена в коллекцию.");
    }

    // Метод для удаления книги из коллекции
    public static void removeBook(ArrayList<Book> library, String isbn) {
        for (int i = 0; i < library.size(); i++) {
            if (library.get(i).getIsbn().equals(isbn)) {
                library.remove(i);
                System.out.println("Книга удалена из коллекции.");
                return;
            }
        }
        System.out.println("Книга с ISBN " + isbn + " не найдена в коллекции.");
    }

    public static void main(String[] args) {
        // Создание коллекции книг
        ArrayList<Book> library = new ArrayList<>();

        // Добавление книги в коллекцию
        Book book1 = new Book("Harry Potter", "J.K. Rowling", "9780545582889");
        addBook(library, book1);

        // Вывод информации о книгах в коллекции
        System.out.println("\nИнформация о книгах в коллекции:");
        for (Book book : library) {
            System.out.println("Название: " + book.getTitle() + ", Автор: " + book.getAuthor() + ", ISBN: " + book.getIsbn());
        }

        // Удаление книги из коллекции
        removeBook(library, "9780545582889");

        // Повторный вывод информации о книгах в коллекции
        System.out.println("\nИнформация о книгах в коллекции после удаления:");
        for (Book book : library) {
            System.out.println("Название: " + book.getTitle() + ", Автор: " + book.getAuthor() + ", ISBN: " + book.getIsbn());
        }
    }
}
