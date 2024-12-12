public class Book {
    private String name;
    private String author;
    private int page;
    private int year;
    private double price;
    Book(String name, String author, int page, int year, double price){
        this.name = name;
        this.author = author;
        this.page = page;
        this.year = year;
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public String getAuthor(){
        return author;
    }

    public int getPage(){
        return page;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString(){
        return "Название: " + name + "Автор: " + author + "Страница: " + page + "Год выпуска: " + year + "Цена: " + price;
    }
}