package project;

public class Book
{
    private int id;
    private String title;
    private String author;
    private int pages;
    public static int count;

    // constructeur
    public Book(String title, String author, int pages) {
        this.id = ++count; // auto-increment
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    // getters/setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Le livre " + this.title + " de " + this.author
                    + " a " + this.pages + " pages";
    }

}