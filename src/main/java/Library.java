import java.awt.print.Book;
import java.util.ArrayList;

public class Library {
    private ArrayList<Book> library;
    private int capacity;


    public Library(int limit){
        library = new ArrayList<>();
        capacity = limit;
    }

    public int bookCount(){
        return library.size();
    }

    public void addBook(Book banana){
        if(library.size() < capacity)
            this.library.add(banana);
    }
}
