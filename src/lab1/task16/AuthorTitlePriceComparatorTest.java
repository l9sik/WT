package lab1.task16;

import lab1.task12.Book;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AuthorTitlePriceComparatorTest {

    private List<Book> books;

    @BeforeEach
    void setUp() {
        // Создаем список книг для тестирования
        books = new ArrayList<>();
        books.add(new Book("Book A", "Author A", 20)); // Книга с тем же автором и названием, но разной ценой
        books.add(new Book("Book A", "Author A", 10)); // Книга с тем же автором и названием, но разной ценой
        books.add(new Book("Book B", "Author B", 15));
        books.add(new Book("Book B", "Author B", 25)); // Книга с тем же автором и названием, но разной ценой
    }

    @Test
    void testCompare_SortedInAscendingOrder() {
        // Сортируем книги в порядке возрастания
        Collections.sort(books, new AuthorTitlePriceComparator());

        // Проверяем, что книги отсортированы сначала по автору, затем по названию и, наконец, по цене
        assertEquals("Author A", books.get(0).getAuthor());
        assertEquals("Book A", books.get(0).getTitle());
        assertEquals(10, books.get(0).getPrice());

        assertEquals("Author A", books.get(1).getAuthor());
        assertEquals("Book A", books.get(1).getTitle());
        assertEquals(20, books.get(1).getPrice());

        assertEquals("Author B", books.get(2).getAuthor());
        assertEquals("Book B", books.get(2).getTitle());
        assertEquals(15, books.get(2).getPrice());

        assertEquals("Author B", books.get(3).getAuthor());
        assertEquals("Book B", books.get(3).getTitle());
        assertEquals(25, books.get(3).getPrice());
    }

    @Test
    void testCompare_SortedInDescendingOrder() {
        // Сортируем книги в порядке убывания
        Collections.sort(books, Collections.reverseOrder(new AuthorTitlePriceComparator()));

        // Проверяем, что книги отсортированы сначала по автору, затем по названию и, наконец, по цене в обратном порядке
        assertEquals("Author B", books.get(0).getAuthor());
        assertEquals("Book B", books.get(0).getTitle());
        assertEquals(25, books.get(0).getPrice());

        assertEquals("Author B", books.get(1).getAuthor());
        assertEquals("Book B", books.get(1).getTitle());
        assertEquals(15, books.get(1).getPrice());

        assertEquals("Author A", books.get(2).getAuthor());
        assertEquals("Book A", books.get(2).getTitle());
        assertEquals(20, books.get(2).getPrice());

        assertEquals("Author A", books.get(3).getAuthor());
        assertEquals("Book A", books.get(3).getTitle());
        assertEquals(10, books.get(3).getPrice());
    }
}
