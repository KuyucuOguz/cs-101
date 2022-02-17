
/**
 * __Represents dice .___ 
 * @author __Oguz Kuyucu___
 * @version __17.12.2020__
 */ 
public class Dice {
    //properties
    
    //final int FACE_OF_DİE = 6;
    Die die1;
    Die die2;
    
    //constructors
    /**
    *Creates two die.
    */
    public Dice(){
        die1 = new Die();
        die2 = new Die();
        
    }
    //methods
    
    /**
    *Rolls the both dice 
    * @return sum of the face values
    */
    public int rollDice(){
        return die1.roll() + die2.roll();
    }
    
    /**
    * Gets the face value of die 1.
    * @return face value of die 1.
    */
    public int getDie1FaceValue(){
        return die1.getFaceValue();
    }
    
    /**
    * Gets the face value of die 2.
    * @return face value of die 2.
    */
    public int getDie2FaceValue(){
        return die2.getFaceValue();
    }
    
    /**
    * Gets the total values of dice.
    * @return total values of dice.
    */
    public int getDiceTotal(){
        return die1.getFaceValue() + die2.getFaceValue();
    }
    
    /**
    *Turns total values of dice to string.
    * @return total values of dice in string format .
    */
    public String toString(){
        return String.valueOf(getDiceTotal());
    }    
}
