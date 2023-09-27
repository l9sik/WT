package lab1.task16;

import lab1.task12.Book;

import java.lang.reflect.Field;
import java.util.Comparator;

public class NameComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        if (o1 == o2) return 0;
        return String.CASE_INSENSITIVE_ORDER.compare(o1.getTitle(), o2.getTitle());
    }
}
