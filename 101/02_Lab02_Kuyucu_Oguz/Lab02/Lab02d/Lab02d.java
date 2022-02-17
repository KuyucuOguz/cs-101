import java.util.Scanner;
/**
 * __this program will try to make flowers live in a triangle shaped garden___ 
 * @author __Oguz Kuyucu___
 * @version __25.10.2020__
 */ 
public class Lab02d {
    public static void main(String[]args){
        System.out.println("Hello,please write three integer");//Hello massage and prompt
        Scanner scan = new Scanner(System.in);
       
        //variables
        int side1 = scan.nextInt();//get first side from the user
        int side2 = scan.nextInt();//get second side from the user
        int side3 = scan.nextInt();//get third side from the user
        
        //constant
        final int FLOWER_PER_SQUAREMETER=17;
        
        
        double s = (side1 + side2 + side3)/2;//The s is from heron formula.
        double area = Math.sqrt(s * (s - side1 ) * (s - side2) * (s - side3));//compute triangle's area by heron formula
        int flowers = (int)(area * FLOWER_PER_SQUAREMETER);//compute the number of flowers in integers, we can't have partial flowers
    
        System.out.println("The number of flowers is " + flowers) ;//output
    }
    
}
