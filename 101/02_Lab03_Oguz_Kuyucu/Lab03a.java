import java.util.Scanner;
/**
 * __this program will count 1 to 50 and compute how many even numbers and odd numbers there are ___ 
 * @author __Oguz Kuyucu___
 * @version __01.11.2020__
 */ 
public class Lab03a{
    public static void main(String[]args){
        //variables
        int even;
        int odd;
        int sum;
        int sum2;
        int k;
        
        even = 0;
        odd = 0;
        
        System.out.println("Please write positive integer");//demand a number from user
        Scanner scan = new Scanner(System.in);
        k = scan.nextInt();//get number from the user
        sum2 = k * ( k + 1 ) / 2 ; //compute the sum of the numbers 1 from k  which user has given

        //loop x from 0 to 50
        for ( int x = 0; x <= 50; x++ ){
           
            //report if x in the [12,25]
            if (x < 12 | x > 25){ 
                System.out.println(x + " is out of the range ");
            }

            //count evens and odds
            if (x % 2 == 0){ 
                even = even + 1; 
            }
            else{ 
                odd = odd + 1;
            }      
            
            //say hi when the number is multiples of five
            if (x % 5 == 0) {
                System.out.println("hi five");
            }
            
            //say hi when the number is multiples of two
            if (x % 2 == 0){
                System.out.println("hi two"); 
            }
            
            //say hi when the number is multiples of three
            if (x % 3 == 0 ){
                System.out.println("hi three");
            }    
            
            //say hi when the number is multiples of seven
            if (x % 7 == 0 ){ 
                System.out.println("hi seven");    
            }
            
            //compute the numbers which cannot be divided by 7 2 5 or 3
            if( (x % 7 != 0 ) && ( x % 3 != 0 ) && ( x % 2 !=0 ) && ( x % 5 != 0 ) ){
                System.out.println("Hi others"); 
            }
            
            sum = x * ( x + 1 ) / 2;//compute sum of the numbers 1 from x
            System.out.println("the sum of the numbers 1 from " + x + " is " + sum  );// report the sum 
            
            //contol and report if sum  and sum2 are equal
            if( sum == sum2 ){
            System.out.println("Two sums are equal");
            }
            else{
            System.out.println("Two sums are not equal");
            }    
            
        }
         
    } 

}
