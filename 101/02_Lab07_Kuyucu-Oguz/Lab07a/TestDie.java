
/**
 * __Plays a dice game .___ 
 * @author __Oguz Kuyucu___
 * @version __13.12.2020__
 */ 
public class TestDie {
    public static void main(String[]args){
        //variables
        Die die1;
        Die die2;
        
        //program code
        
        //1. create two dices
        die1 = new Die();
        die2 = new Die();
        
        //2. roll dice
        die1.roll();
        die2.roll();
        
        //3. look at what happens while trying to sytem.out.println(die1)
        System.out.println(die1);
        System.out.println(die2);
        
        //4. call objects methods
        System.out.println(die1.getFaceValue());
        System.out.println(die2.getFaceValue());
        
        //5. try toString
        die1.toString();
        die2.toString();
        System.out.println(die1);
        System.out.println(die2);
        
        //6. roll both dice and report the result
        die1.roll();
        die2.roll();
        
        System.out.println("die1 is " + die1.getFaceValue());
        System.out.println("die2 is " + die2.getFaceValue());
        System.out.println("The sum is " + (die1.getFaceValue() + die2.getFaceValue()) );

    }
}