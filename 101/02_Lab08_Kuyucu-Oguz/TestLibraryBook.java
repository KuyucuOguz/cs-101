/**
 * __Tests library books .___
 * 
 * @author __Oguz Kuyucu___
 * @version __13.12.2020__
 */
public class TestLibraryBook{
    public static void main(String[]args){
        //variables
        LibraryBook book1;
        LibraryBook book2;
        LibraryBook book3;
        LibraryBook book4;

        //1. create 2 book
        book1 = new LibraryBook("Incognito", "David Eagleman");
        book2 = new LibraryBook("How To Java","David Davenport");
        book3 = new LibraryBook(book1);
        book4 = book1;
        
        //2. control if the books are equal in a way that Mr. Davenport wants
        System.out.println(book1==book2);
        System.out.println(book1==book3);
        System.out.println(book1==book4);
        
        System.out.println(book1.equals(book2));
        System.out.println(book1.equals(book3));
        System.out.println(book1.equals(book4));
        
        //3.get the authors of the books
        System.out.println(book1.getAuthor());
        System.out.println(book2.getAuthor());
        
        //4. loan the first book
        book1.loan("1.1.1");
        System.out.println(book1.getTimesLoaned());
        System.out.println(book1.onLoan());
        System.out.println(book1.getDueDate());
        
        //5. return the first book
        book1.returnbook();
        System.out.println(book1.getTimesLoaned());
        System.out.println(book1.onLoan());
        System.out.println(book2.getDueDate());

        //6. try toString to first book
        System.out.println(book1.toString());

        //7. control if books' titles and authors are same or not
        System.out.println(book1.hasSameAuthor(book2));
        System.out.println(book1.hasSameAuthor(book3));
        System.out.println(book1.hasSameTitle(book2));
        System.out.println(book1.hasSameTitle(book3));
    }
}