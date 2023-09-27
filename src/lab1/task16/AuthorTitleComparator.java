package lab1.task16;

import lab1.task12.Book;

import java.util.Comparator;

public class AuthorTitleComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        if (o1 == o2) return 0;

        int authorComparison = String.CASE_INSENSITIVE_ORDER.compare(o1.getAuthor(), o2.getAuthor());
        return (authorComparison == 0) ?
                String.CASE_INSENSITIVE_ORDER.compare(o1.getTitle(), o2.getTitle()) :
                authorComparison;
    }
}
