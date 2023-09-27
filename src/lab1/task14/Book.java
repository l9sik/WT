package lab1.task14;

public class Book {

    private String title;
    private String author;
    private int price;
    private static int edition;

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
}

