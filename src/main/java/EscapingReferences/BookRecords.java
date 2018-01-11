package EscapingReferences;

import java.util.HashMap;
import java.util.Map;

/**
 * The below class has a bug
 */
public class BookRecords {
    private static Map<String, Book> records;

    public void addBooks(Book b) {
        records.put(b.getAuthor(), b);
    }

    /**
     * @return There is an issue with this class as map is returned
     * which can be modified once we get the reference
     */
    public Map<String, Book> getBookDetails() {
        return this.records;
    }


    public static void main(String[] args) {
        bookBuilder();
        BookRecords record = new BookRecords();
        /**
         * Now I take the reference of the book by using getBookDetails()
         */
        Map<String, Book> referenceOfBooks = record.getBookDetails();

        referenceOfBooks.forEach((k, v) -> System.out.println(k + " : " + v.getTitle()));
        referenceOfBooks.clear();

        /**
         * Since we have cleared the records from referenceOfBooks, we will get no values
         * from records as it was also pointing to the same object in the stack
         */
        records.forEach((k, v) -> System.out.println(k + ":" + v.getAuthor()));
    }

    public static Map<String, Book> bookBuilder() {
        records = new HashMap<>();
        Book book1 = new Book("As the Crow Flies", "Jeffrey Archer");
        Book book2 = new Book("Kane and Able", "Jeffrey Archer");
        Book book3 = new Book("Prodigal Daughter", "Jeffrey Archer");
        records.put(book1.getTitle(), book1);
        records.put(book2.getTitle(), book2);
        records.put(book3.getTitle(), book3);
        return records;
    }
}
