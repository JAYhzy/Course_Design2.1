package Book;

public class Book {

    private int ISBN;
    private String Publisher;
    private String Name;
    private int Page;
    private String Published_time;
    private String Authors;
    private String Category;

    private boolean isBorrowed; //是否被借出
    //构造器
    public Book() {

    }

    public Book(int ISBN, String publisher, String name, int page, String published_time, String authors, String category) {
        this.ISBN = ISBN;
        Publisher = publisher;
        Name = name;
        Page = page;
        Published_time = published_time;
        Authors = authors;
        Category = category;
    }

//get and set

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPublisher() {
        return Publisher;
    }

    public void setPublisher(String publisher) {
        Publisher = publisher;
    }

    public int getPage() {
        return Page;
    }

    public void setPage(int page) {
        Page = page;
    }

    public String getPublished_time() {
        return Published_time;
    }

    public void setPublished_time(String published_time) {
        Published_time = published_time;
    }

    public String getAuthors() {
        return Authors;
    }

    public void setAuthors(String authors) {
        Authors = authors;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }


    @Override
    public String toString() {
        return "Book{" +
                "ISBN=" + ISBN +
                ", Publisher='" + Publisher + '\'' +
                ", Name='" + Name + '\'' +
                ", Page=" + Page +
                ", Published_time='" + Published_time + '\'' +
                ", Authors='" + Authors + '\'' +
                ", Category='" + Category + '\'' +
                ", isBorrowed=" + isBorrowed +
                '}';
    }
}