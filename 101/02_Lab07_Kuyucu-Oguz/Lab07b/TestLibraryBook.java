/**
 * __Tests library books .___ 
 * @author __Oguz Kuyucu___
 * @version __13.12.2020__
 */ 
public class TestLibraryBook{
    public static void main(String[]args){
        //variables
        LibraryBook book1;
        LibraryBook book2;

        //1. create 2 book
        book1 = new LibraryBook("Incognito", "David Eagleman");
        book2 = new LibraryBook("How To Java","David Davenport");
        
        //2.get the authors of the books
        System.out.println(book1.getAuthor());
        System.out.println(book2.getAuthor());
        
        //3. loan the first book
        book1.loan("1.1.1");
        System.out.println(book1.getTimesLoaned());
        System.out.println(book1.onLoan());
        System.out.println(book1.getDueDate());
        
        //4. return the first book
        book1.returnbook();
        System.out.println(book1.getTimesLoaned());
        System.out.println(book1.onLoan());
        System.out.println(book2.getDueDate());

        //5. try toString to first book
        System.out.println(book1.toString());
    }
}