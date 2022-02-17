
/**
 * __this program will place -1 at the spesific place___ 
 * @author __Oguz Kuyucu___
 * @version __19.11.2020__
 */ 
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Scanner;
public class Lab04f {
    public static void main(String[]args)throws IOException{
        
        //variables
        int location;
        int a;
        double random;
        int lines;        
        String FileName;
        
        Scanner scan = new Scanner(System.in);

        //1.get location from the user
        System.out.println("Please write minus one's location");
        location = scan.nextInt();
        
        //2.get number of lines from the user
        System.out.println("Please write how many lines you wish");//Demand number of lines from the user
        lines = scan.nextInt();//get lines from user
        
        //3. get file name from the user and create a file
        System.out.println("Please write file name");
        FileName = scan.next();
        PrintWriter fout = new PrintWriter( FileName + ".txt" );
        
        //4. put -1 in the location and put random numbers which are inside (-30,99970) interval other than specified location
        for(a = 0; a < lines ; a++){
            random =Math.random();
            //print random number other than location
            if (a + 1 != location)
                fout.println((int) (random * 100000 - 30));
            //print -1 in location
            else
                fout.println(-1);       
        }
        fout.close();
        scan.close();
    }
}
