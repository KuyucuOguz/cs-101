
import java.util.ArrayList;

/**
 ** __Represents a library.___ 
 * @author __Oguz Kuyucu___
 * @version __20.12.2020__
 */ 
public class Library {
    //properties

    ArrayList<LibraryBook> bookList;

    // constructors

    /**
    *constructor for class Library
    *creates an array
    */
    public Library() {
        bookList = new ArrayList<LibraryBook>();
    }

    // methods

    /**
     * Controls if a library is empty.
     * 
     * @return true if the library is empty, otherwise false.
     */
    public boolean isEmpty() {
        if (bookList.size() == 0)
            return true;
        else
            return false;
    }

    /**
     * Converts bookList to string.
     * @param library is a booklist which will be transformed to string
     * @return list.
     */
    public String toString(Library library) {
        String list;
        LibraryBook book;
        list = "";
        for (int bookNumber = 0; bookNumber < bookList.size(); bookNumber++) {
            book = bookList.get(bookNumber);    
            list = list +" \n "+ book.getTitle()+" " + book.getAuthor();
        }
        return list;
    }
    /**
    *Adds a book to list
    *@param title is title of the book.
    *@param author is author of the book.
    */
    public void add(String title, String author){
        LibraryBook book;
        book = new LibraryBook(title,author);
        bookList.add(book);
    }
    /**
    *Remove a book from the list
    *@param book is the book that will be removed.
    */
    public void remove(LibraryBook book){
        for(int bookNumber = 0; bookNumber < bookList.size(); bookNumber++ ){
            if(bookList.get(bookNumber).equals(book))
                bookList.remove(bookNumber);
        }
    }
    /**
    *Finds books location by title
    *@param title is the title that will be searched.
    *@return book which has expected title.
    */
    public LibraryBook findByTitle(String title){
        for(int bookNumber = 0; bookNumber < bookList.size(); bookNumber++ ){
            if(bookList.get(bookNumber).getTitle().equals(title)){
                return bookList.get(bookNumber);
            }  
        }
        return null;
    }
}
