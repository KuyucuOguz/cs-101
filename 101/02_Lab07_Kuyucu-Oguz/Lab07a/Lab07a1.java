
/**
 * __Plays a dice game .___ 
 * @author __Oguz Kuyucu___
 * @version __12.12.2020__
 */ 
public class Lab07a1 {
    public static void main(String[]args){
     
        //variables
        int dice1;
        int dice2;
        int sumOfDices;
        int numberOfRolls;
        //program code

        //1 dies dices in traditional way
        
        //1.1 set numberOfRolls and sumOfDices to 0
        numberOfRolls = 0;
        sumOfDices = 0;
        
        //1.2die dices until twelwe 
        while(sumOfDices != 12){
            dice1 =(int) ((Math.random() * 6) + 1);
            dice2 =(int) ((Math.random() * 6) + 1);
            sumOfDices = dice1 + dice2;
            numberOfRolls = numberOfRolls + 1;
        }
        //1.3 report number of rolls
        System.out.println("Number of rolls is " + numberOfRolls);
        
    
    }  
}