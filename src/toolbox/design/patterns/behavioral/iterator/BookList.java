package toolbox.design.patterns.behavioral.iterator;

/**
 * Implements the iterator creation interface to return an instance of the
 * proper concrete iterator.
 * 
 * @author billy
 * 
 */
public class BookList implements Aggregate<String> {

    private final String[] books;

    public BookList(String[] books) {
        this.books = books;
    }

    @Override
    public Iterator<String> createIterator() {
        return new BooksListIterator();
    }

    /**
     * Implements the iterator interface and keeps track of the current position
     * in the traversal of the aggregate.
     * 
     * @author billy
     * 
     */
    private class BooksListIterator implements Iterator<String> {

        private int currentPosition = 0;

        public BooksListIterator() {
        }

        @Override
        public String first() {
            currentPosition = 0;
            return currentItem();
        }

        @Override
        public String next() {
            String item = currentItem();
            if (currentPosition < books.length)
                ++currentPosition;

            return item;
        }

        @Override
        public String currentItem() {
            return books[currentPosition];
        }

        @Override
        public boolean isDone() {
            boolean done = false;

            if (currentPosition >= books.length)
                done = true;

            return done;
        }

    }

}
