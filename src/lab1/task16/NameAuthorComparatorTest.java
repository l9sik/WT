package lab1.task16;

import lab1.task12.Book;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NameAuthorComparatorTest {

    private List<Book> books;

    @BeforeEach
    void setUp() {
        // Создаем список книг для тестирования
        books = new ArrayList<>();
        books.add(new Book("Book C", "Author C", 20));
        books.add(new Book("Book A", "Author A", 10));
        books.add(new Book("Book B", "Author B", 15));
    }

    @Test
    void testCompare_SortedInAscendingOrder() {
        // Сортируем книги в порядке возрастания
        Collections.sort(books, new NameAuthorComparator());

        // Проверяем, что книги отсортированы сначала по названию, а затем по автору
        assertEquals("Book A", books.get(0).getTitle());
        assertEquals("Book B", books.get(1).getTitle());
        assertEquals("Book C", books.get(2).getTitle());
    }

    @Test
    void testCompare_SortedInDescendingOrder() {
        // Сортируем книги в порядке убывания
        Collections.sort(books, Collections.reverseOrder(new NameAuthorComparator()));

        // Проверяем, что книги отсортированы сначала по названию, а затем по автору в обратном порядке
        assertEquals("Book C", books.get(0).getTitle());
        assertEquals("Book B", books.get(1).getTitle());
        assertEquals("Book A", books.get(2).getTitle());
    }
}
