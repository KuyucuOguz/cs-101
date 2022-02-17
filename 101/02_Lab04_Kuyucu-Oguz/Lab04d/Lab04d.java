package Lab04.Lab04d;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * __this program will create a file and put a random number inside it___ 
 * @author __Oguz Kuyucu___
 * @version __19.11.2020__
 */ 
public class Lab04d {
    public static void main(String[]args)throws IOException{
        Scanner scan = new Scanner(System.in);
    
        //variables
        int numberOfValues;
        double random;
        String fileName;
        int NumberOfValuesSoFar;
        
        //program code

        //1.get user how many number he/she wish
        System.out.println("Please write how many numbers you want to create");
        numberOfValues = scan.nextInt();
        
        //2.get a file name from the user 
        System.out.println("Please write file name");//demand file name from the user
        fileName = scan.nextLine();//obtain file name from the user
        
        //3.create a file
        PrintWriter fout = new PrintWriter( fileName + ".txt" );
        
        //4.generate random values
        NumberOfValuesSoFar = 1;
        while(NumberOfValuesSoFar <= numberOfValues){
            random = Math.random();//determine a random value in [0,1)
            random =(int)(random * 100000);
            fout.println( random );//put random number inside the file
            NumberOfValuesSoFar = NumberOfValuesSoFar + 1;
        }   
        fout.close();
        scan.close();
    }
}
