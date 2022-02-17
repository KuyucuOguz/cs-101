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
    
    public LibraryBook(String title, String author ){
        this.title = title;
        this.author = author; 
        dueDate = "";
        timesLoaned = 0;
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
    * @return title and author.
    */
    public String toString(){
        return title + " " + author;
    }
}