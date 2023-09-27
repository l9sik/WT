package lab1.task16;

import lab1.task12.Book;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AuthorTitleComparatorTest {

    private List<Book> books;

    @BeforeEach
    void setUp() {
        // Создаем список книг для тестирования
        books = new ArrayList<>();
        books.add(new Book("Book C", "Author A", 20)); // Книга с тем же автором
        books.add(new Book("Book A", "Author A", 10)); // Книга с тем же автором
        books.add(new Book("Book B", "Author B", 15));
    }

    @Test
    void testCompare_SortedInAscendingOrder() {
        // Сортируем книги в порядке возрастания
        Collections.sort(books, new AuthorTitleComparator());

        // Проверяем, что книги отсортированы сначала по автору, а затем по названию
        assertEquals("Author A", books.get(0).getAuthor());
        assertEquals("Book A", books.get(0).getTitle());

        assertEquals("Author A", books.get(1).getAuthor());
        assertEquals("Book C", books.get(1).getTitle());

        assertEquals("Author B", books.get(2).getAuthor());
        assertEquals("Book B", books.get(2).getTitle());
    }

    @Test
    void testCompare_SortedInDescendingOrder() {
        // Сортируем книги в порядке убывания
        Collections.sort(books, Collections.reverseOrder(new AuthorTitleComparator()));

        // Проверяем, что книги отсортированы сначала по автору, а затем по названию в обратном порядке
        assertEquals("Author B", books.get(0).getAuthor());
        assertEquals("Book B", books.get(0).getTitle());

        assertEquals("Author A", books.get(1).getAuthor());
        assertEquals("Book C", books.get(1).getTitle());

        assertEquals("Author A", books.get(2).getAuthor());
        assertEquals("Book A", books.get(2).getTitle());
    }
}
