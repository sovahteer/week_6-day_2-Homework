import java.awt.print.Book;
import java.util.ArrayList;

public class Library {
    private ArrayList<Book> library;


    public Library(){
        library = new ArrayList<>();
    }

    public int bookCount(){
        return library.size();
    }

    public void addBook(Book banana){
        if(library.size() < 2);
            this.library.add(banana);
    }
}
