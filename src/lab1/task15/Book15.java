package lab1.task15;

import lab1.task12.Book;

public class Book15 extends Book implements Comparable{
    private int isbn;


    @Override
    public int compareTo(Object o) {
        if (o == null) throw new NullPointerException();
        return Integer.compare(this.isbn, ((Book15)o).isbn);
    }
}
