import java.util.List;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Война и мир", "Лев Толстой", 1200, 1869, 500);
        Book book2 = new Book("Преступление и наказание", "Федор Достоевский", 600, 1866, 400);
        Book book3 = new Book("Евгений Онегин", "Александр Пушкин", 300, 1833, 350);
        Book book4 = new Book("Анна Каренина", "Лев Толстой", 800, 1877, 600);

        Library library = new Library();

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);

        System.out.print("Все книги в библиотеке");
        library.showBooks();

        library.removeBookByName("Евгений Онегин");
        System.out.println("\nПосле удаления книги 'Евгений Онегин':");
        library.showBooks();

        library.removeBookByAuthor("Лев Тостой");
        System.out.println("\nПосле удаления книг автора 'Лев Толстой':");
        library.showBooks();

        List<Book> booksInRange = library.getBooksInPriceRange(400, 500);
        System.out.println("\nКниги в ценовом диапазоне от 400 до 500 руб.:");
        for(Book book : booksInRange)
            System.out.println(book);

        double averagePrice = library.averagePriceByAuthor("Федер Достоевский");
        System.out.println("\nСредняя цена книг Федора Достоевского: " + averagePrice);

        library.sortBooksByTitleDesc();
        System.out.println("\nПосле сортировки по названию в обратном алфавитном порядке:");
        library.showBooks();
    }
}
/*


        // Вычислить среднюю цену книг автора 'Федор Достоевский'
        double averagePrice = library.averagePriceByAuthor("Федор Достоевский");
        System.out.println("\nСредняя цена книг Федора Достоевского: " + averagePrice);

        // Сортировка книг по названию в обратном алфавитном порядке
        library.sortBooksByTitleDesc();
        System.out.println("\nПосле сортировки по названию в обратном алфавитном порядке:");
        library.showBooks();
    }
}
 */
/*
public class Main {
    public static void main(String[] args) {
        // Создание объектов книг
        Book book1 = new Book("Война и мир", "Лев Толстой", 1200, 1869, 500);
        Book book2 = new Book("Преступление и наказание", "Федор Достоевский", 600, 1866, 400);
        Book book3 = new Book("Евгений Онегин", "Александр Пушкин", 300, 1833, 350);
        Book book4 = new Book("Анна Каренина", "Лев Толстой", 800, 1877, 600);

        // Создание объекта библиотеки
        Library library = new Library();

        // Добавление книг в библиотеку
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);

        // Показать все книги
        System.out.println("Все книги в библиотеке:");
        library.showBooks();

        // Удалить книгу по названию
        library.removeBookByTitle("Евгений Онегин");
        System.out.println("\nПосле удаления книги 'Евгений Онегин':");
        library.showBooks();

        // Удалить все книги автора Лев Толстой
        library.removeBooksByAuthor("Лев Толстой");
        System.out.println("\nПосле удаления книг автора 'Лев Толстой':");
        library.showBooks();

        // Получить книги в диапазоне цен
        List<Book> booksInRange = library.getBooksInPriceRange(400, 500);
        System.out.println("\nКниги в ценовом диапазоне от 400 до 500 руб.:");
        for (Book book : booksInRange) {
            System.out.println(book);
        }
 */