
/**
 * __Plays a dice game .___ 
 * @author __Oguz Kuyucu___
 * @version __13.12.2020__
 */ 
public class DiceGame {
    
    //properties
    Dice dice;
        
    //constructors
    /**
    *Creates two die.
    */
    public DiceGame(){
        dice = new Dice();
    }
    //methods
    
    /**
    * Rolls dice until get double six.
    * @return number of rolls.
    */
    public int play(Dice dice){
        int numberOfRolls;
        numberOfRolls = 1;
        while (dice.getDiceTotal() != 12){
            dice.rollDice();
            numberOfRolls = numberOfRolls + 1;
        }
        return numberOfRolls;
    }  
}