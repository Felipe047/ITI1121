import java.util.ArrayList;

public class Library {

    private ArrayList<Book> library = new ArrayList<Book>();

    public Book getBook(int i) {
        return library.get(i);
    }

    public int getSize() {
        return library.size();
    }

    public void addBook (Book b) {
        library.add(b);
        this.sort();
    }

    public void sort() {
        BookComparator q = new BookComparator();
        library.sort(q);
    }


    public void printLibrary() {
        for (int i = 0; i < library.size(); i++) {
            System.out.println(library.get(i).toString());
        }
    }
}
