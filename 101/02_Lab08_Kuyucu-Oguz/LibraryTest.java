import java.util.Scanner;
public class LibraryTest {
    public static void main(String[]args){
        //constants

        //variables
        String demand;
        Library library;
        LibraryBook book;
        String author;
        String title;

        //program code
        library = new Library();
        Scanner scan = new Scanner(System.in);
        
        //1.print an hello message and get demand from user.
        System.out.println("Hello, welcome to library test");
        System.out.println("Please type Show, Find, Add, or Exit");
        library.isEmpty();
        demand = scan.next();
        
        //2. Do what the user says
        while(!demand.equals("Exit")){
            //2.1 List library if user type Show.
            if (demand.equals("Show")){
                System.out.println(library.toString(library));
            }
            //2.2 Add book to the library if user type Add.
            else if (demand.equals("Add")){
                System.out.println("Please write title and author");
                title = scan.next();
                author = scan.next();
                library.add(title, author);
            }
            //2.3 Find book from title if user types Find
            else if(demand.equals("Find")){
                //2.3.1 get the title from the  user
                System.out.println("Please write title");
                title = scan.next();
                book = library.findByTitle(title);
                //2.3.2 if the book does not exits print an error message
                if(book == null)
                    System.out.println("Sorry, we couldn't find your book");
                //2.3.3 if the book exists, show the book and ask user what he wants to do
                else{
                    System.out.println(book.toString(book));
                    System.out.println("What do you want to do with this book? Loan, return, remove or exit");
                    demand = scan.next();
                    //2.3.3.1 if user type exit, return main menu
                    if(demand.equals("exit"))   
                        System.out.println("You returned to main menu");
                    //2.3.3.2 if user type loan, get due date and loan the book   
                    else if (demand.equals("loan")){
                        System.out.println("Please write due date.");
                        book.loan(scan.next());
                        System.out.println("You loaned the book until " +book.getDueDate());
                    }
                    //2.3.3.3 if user type return, take the book back
                    else if (demand.equals("return")){
                        book.returnbook();
                        System.out.println("You returned the book");
                    }
                    //2.3.3.4 if user type remove, remove the book
                    else if(demand.equals("remove")){
                        library.remove(book);
                        System.out.println("The book is removed");  
                    }
                }
            }
            System.out.println("Now,what do you want to do");
            demand = scan.next(); 
        }
        //3. control if the library is empty and close the scanner
        System.out.println(library.isEmpty());
        scan.close();
    } 
}
