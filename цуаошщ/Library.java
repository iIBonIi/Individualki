import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private StringBuilder sb;

    Library(){
        this.books = new ArrayList<>();
        this.sb = new StringBuilder();
    }

    void addBook(Book book){
        books.add(book);
    }

    void removeBookByName(String name){
        books.removeIf(book -> book.getName().equals(name));
    }

    void removeBookByAuthor(String author){
        books.removeIf(book -> book.getAuthor().equals(author));
    }

    List<Book> getBooksInPriceRange(double minPrice, double maxPrice){
        List<Book> res = new ArrayList<>();
        for(Book book : books){
            if(book.getPrice() >= minPrice && book.getPrice() <= maxPrice)
                res.add(book);
        }
        return res;
    }

    double averagePriceByAuthor(String author){
        double allPrice = 0;
        int c = 0;
        for(Book book : books){
            if(book.getAuthor().equals(author))
                allPrice += book.getPrice();
            c++;
        }
        return c > 0 ? allPrice / c : 0;
    }

    // Метод для сортировки книг по названию в обратном алфавитном порядке
    public void sortBooksByTitleDesc() {
        books.sort((book1, book2) -> book2.getName().compareTo(book1.getName()));
    }


    // Метод для отображения всех книг в библиотеке
    String showBooks() {
        if(books.isEmpty())
            return "Библиотека пуста";
        else
            for(Book book : books)
                sb.append(book.toString()).append("\n");
            return sb.toString();
    }

}
/*
class Library {
    private List<Book> books;

    // Конструктор класса Library
    public Library() {
        this.books = new ArrayList<>();
    }

    // Метод для добавления книги
    public void addBook(Book book) {
        books.add(book);
    }

    // Метод для удаления книги по названию
    public void removeBookByTitle(String title) {
        books.removeIf(book -> book.getTitle().equals(title));
    }

    // Метод для удаления всех книг по автору
    public void removeBooksByAuthor(String author) {
        books.removeIf(book -> book.getAuthor().equals(author));
    }

    // Метод для получения списка книг в диапазоне цен
    public List<Book> getBooksInPriceRange(double minPrice, double maxPrice) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getPrice() >= minPrice && book.getPrice() <= maxPrice) {
                result.add(book);
            }
        }
        return result;
    }

    // Метод для вычисления средней цены книг автора
    public double averagePriceByAuthor(String author) {
        double totalPrice = 0;
        int count = 0;
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                totalPrice += book.getPrice();
                count++;
            }
        }
        return count > 0 ? totalPrice / count : 0;
    }

    // Метод для сортировки книг по названию в обратном алфавитном порядке
    public void sortBooksByTitleDesc() {
        books.sort((book1, book2) -> book2.getTitle().compareTo(book1.getTitle()));
    }

    // Метод для отображения всех книг в библиотеке
    public void showBooks() {
        if (books.isEmpty()) {
            System.out.println("Библиотека пуста.");
        } else {
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }
}
 */