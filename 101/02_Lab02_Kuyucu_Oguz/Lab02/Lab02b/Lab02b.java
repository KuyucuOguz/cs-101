import java.util.Scanner;
/**
 * __this program will tell your age and surname___ 
 * @author __Oguz Kuyucu___
 * @version __25.10.2020__
 */ 

public class Lab02b {
    
    public static void main(String[]args){
        //variables
        //int age;
        //String surname;
        
        
        System.out.println("Welcome,please write your age");//prompt
        
        Scanner scan = new Scanner(System.in);
        
        int age = scan.nextInt();//get age from the user
        
        System.out.println("Please write your surname");//prompt
        
        Scanner scan2 = new Scanner(System.in);
        
        String surname = scan2.nextLine();//get surname from the user
        
        System.out.println("Your surname is " + surname);//output
        
        System.out.println("You are " + age + " years old");//output       
    
    }    
}
