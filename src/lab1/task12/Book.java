package lab1.task12;

public class Book {

    private String title;
    private String author;
    private int price;
    private static int edition;

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public Book() {}

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (obj == this) return true;
        if (obj.getClass() != this.getClass())
            return false;
        Book that = (Book) obj;

        return that.title.equals(this.title)
                && that.author.equals(this.author)
                && that.price == this.price;
    }

    @Override
    public int hashCode() {
        final int value = 21;
        int outcome = (int) (price ^ (price >> 10));
        outcome = value * outcome + (int) (edition ^ (edition >> 10));
        outcome = value * outcome + ((title == null) ? 0 : title.hashCode());
        outcome = value * outcome + ((author == null) ? 0 : author.hashCode());
        return outcome;
    }

    @Override
    public String toString() {
        return String.format("Title : %s, Author: %s, Price: %d", title, author, price);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Book b = new Book();
        b.author = this.author;
        b.title = this.title;
        b.price = this.price;
        return b;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static int getEdition() {
        return edition;
    }

    public static void setEdition(int edition) {
        Book.edition = edition;
    }
}
