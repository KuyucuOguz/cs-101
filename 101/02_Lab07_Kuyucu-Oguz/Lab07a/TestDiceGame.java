
/**
 * __Plays dice game. Stop when there is double six and report how many times dice are rolled.___
 * 
 * @author __Oguz Kuyucu___
 * @version __17.12.2020__
 */ 
public class TestDiceGame {
    public static void main(String[]args){
        //constants

        //variables
        Dice dice;
        DiceGame diceGame;

        //program code

        //1. create dice and dice game objects
        dice = new Dice();
        diceGame = new DiceGame();

        //2. Print how many roll is made.
        System.out.println("Number of rolls is " + diceGame.play(dice));

    }
}