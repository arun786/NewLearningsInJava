# Escaping References

    /**
     * Book class is well defined class, the data in the class
     * cannot be changed accidently, the value can be changed using
     * either using a setter or the constructor
     */
    public class Book {
        private String title;
        private String author;
    
        public Book(String title, String author) {
            this.title = title;
            this.author = author;
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
    }


Note : The below class has a bug, we are returning back a reference of the 
same object which was created and then manipulating it.

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

### The above code is fine tuned, we will be returning a new hashMap as below

        /**
         * @param args Wrap the map with a new Map and return the new object
         */
        public Map<String, Book> getBookDetailsRectified() {
            return new HashMap<>(records);
        }
        
Note : though we have a new HashMap but this can cause issues, so we will use 
need to use immutable map