
/**
 ** __Represents library books.___ 
 * @author __Oguz Kuyucu___
 * @version __13.12.2020__
 */ 
public class LibraryBook{
    //properties

    String title;
    String author;
    String dueDate;
    int timesLoaned;
    //constructors
    
    /**
    * constructor for class LibraryBook
    * @param title is title of the book
    * @param author is author of the book
    */
    public LibraryBook(String title, String author ){
        this.title = title;
        this.author = author; 
        dueDate = "";
        timesLoaned = 0;
    }
    
    /**
    * Another constructor for class LibraryBook
    * @param book is a LibraryBook
    *This is a copy constructor
    */
    public LibraryBook(LibraryBook book){
        title = book.getTitle();
        author = book.getAuthor();
        dueDate = book.getDueDate();
        timesLoaned = book.getTimesLoaned();
    }
    //methods

    /**
    * Gets the title.
    * @return title.
    */
    public String getTitle(){
        return title;
    }
    /**
    * Gets the author.
    * @return author.
    */ 
    public String getAuthor(){
        return author;
    }
    /**
    * Gets the due date.
    * @return due date.
    */
    public String getDueDate(){
        return dueDate;
    }
    /**
    * Gets how many times the book loaned.
    * @return times loaned.
    */
    public int getTimesLoaned(){
        return timesLoaned;
    }
    
    /**
    * Control if the book is on loan or not.
    * @return true or false.
    */
    public boolean onLoan(){
        if (dueDate.equals(""))
            return false;
        else
            return true;
    }
    /**
    * Loans the book.Creates a due date and adds 1 to times loaned.
    */
    public void loan(String dueDate){
        this.dueDate = dueDate;
        timesLoaned = timesLoaned + 1; 
    }
    /**
    * Returns the book. Sets due date to empty string. 
    * @return face value of die 1.
    */
    public void returnbook(){
        dueDate = "";
    }
    /**
    * Set the library book object to string.
     *@param libraryBook
    * @return title and author.
    */
    public String toString(LibraryBook libraryBook){
        return title + " " + author;
    }
    /**
    * Controls if two books are same.
    * parameter book is a book that is compared to other book
    * @return true if they are same, otherwise false.
    */
    public boolean equals(LibraryBook book){
        if(hasSameTitle(book) && hasSameAuthor(book))
            return true;
        else
            return false;
    }
    /**
    * Controls if two books have same title.
    * parameter book is a book that is compared to other book
    * @return true if titles are same, otherwise false.
    */
    public boolean hasSameTitle(LibraryBook book){
        if (getTitle().equals(book.getTitle()))
            return true;
        else
            return false;
    }
    /**
    * Controls if two books have same author.
    * @param book is a book that is compared to other book
    * @return true if authors are same, otherwise false.
    */
    public boolean hasSameAuthor(LibraryBook book){
        if(getAuthor().equals(book.getAuthor()))
            return true;
        else
            return false;
    }
}