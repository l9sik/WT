package lab1.task16;

import lab1.task12.Book;

public class AuthorTitlePriceComparator extends AuthorTitleComparator{
    @Override
    public int compare(Book o1, Book o2) {
        if (o1 == o2) return 0;

        int authorTitleComparison = super.compare(o1, o2);
        return (authorTitleComparison == 0) ?
                Integer.compare(o1.getPrice(), o2.getPrice()) :
                authorTitleComparison;
    }
}
