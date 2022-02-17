public class BookTest {
    public static void main(String[]args){
        //constants

        //variables
        LibraryBook book1;
        LibraryBook book2;

        //program code

        book1 = new LibraryBook("111","555");
        book2 = new LibraryBook("222","555");
        System.out.println(book2.hasSameAuthor(book1));
        System.out.println(book2.hasSameTitle(book1));

    }
    
}
