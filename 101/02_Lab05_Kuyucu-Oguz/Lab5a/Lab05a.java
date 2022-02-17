/**
 * __this program will print a rectangle___ 
 * @author __Oguz Kuyucu___
 * @version __22.11.2020__
 */ 
import java.util.Scanner;
public class Lab05a {
    public static void main(String[]args){
        //variables
        int width;
        int height;
        int thickness;
        int thicknessSoFar;
        int widthSoFar;
        String response;
        
        response = "y";
        Scanner scan = new Scanner(System.in);
        //1get width,height and thickness from user
        //1.1demand width,height and thickness from user
        System.out.println("Welcome, please write width, height and wall thickness by order");
        
        do {
            //1.2get width height and thickness from the user
            width = scan.nextInt();
            height = scan.nextInt();
            thickness = scan.nextInt();
            
            //2.check whether the datas are valid if not print an error message
            if(width <= 0 & height <= 0 & thickness <= 0 & height < 2 * thickness & width < 2 * thickness){
                System.out.println("datas are not valid");
            }
            //3if datas are valid,form a rectangle
            else{
                //3.1form rectangle's top side
                for(thicknessSoFar = 0 ; thicknessSoFar < thickness; thicknessSoFar++ ){
                    for(widthSoFar = 0 ; widthSoFar < width ; widthSoFar++ ){
                        System.out.print("*");        
                    }   
                System.out.println("");
                }
                //3.2form rectangle's middle side
                for(widthSoFar = 0 ; widthSoFar < height - 2 * thickness ; widthSoFar++ ) {
                    
                    for(thicknessSoFar = 0 ;thicknessSoFar < thickness ; thicknessSoFar++ ){
                        System.out.print("*");        
                    }
                    
                    for(thicknessSoFar = 0 ; thicknessSoFar < width - 2 * thickness ; thicknessSoFar++  ){
                        System.out.print(" ");
                    }
                           
                    for(thicknessSoFar = 0 ; thicknessSoFar < thickness ; thicknessSoFar++ ){
                        System.out.print("*");
                    } 
                    System.out.println(""); 
                }
                //3.3form rectangle's bottom side
                for(thicknessSoFar = 0 ; thicknessSoFar < thickness; thicknessSoFar++ ){
                    for(widthSoFar = 0; widthSoFar < width ; widthSoFar++){
                        System.out.print("*");        
                    }   
                System.out.println("");
                }       
            }
            response = scan.next();
            if(width == 2*thickness )
                //4if there isn't hole in rectangle, print an error message.
                System.out.println("There is no hole in rectangle");
        }while (response.equals("y")); 
    }
}