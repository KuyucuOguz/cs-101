import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * __Calculates word lenghts in the sentence .___
 * @author __Oguz Kuyucu___
 * @version __23.12.2020__
 */
public class WordLength {
    public static void main(String[] args) throws FileNotFoundException {
        //constants
        
        //variables
        int letterNumberOfSentence;
        int letterNumberOfWord;
        int lengthSoFar;
        String sentence;
        int memoryLocation;
        ArrayList <Integer> letterFrequency;
        
        //program code
        
        //1. Read the file
        Scanner scan = new Scanner(new File("sentence.txt"));

        //2. Create an arraylist for lenght of words and set letter number of word and letter number of sentence to 0

        letterNumberOfWord = 0;
        letterNumberOfSentence = 0;

        //3.Read the sentence and calculate words's lenghts and add them in arraylist
        sentence = scan.nextLine();
        letterFrequency  = new ArrayList<Integer>();
        while(letterNumberOfSentence <= sentence.length() - 1 ){
            //3.1 Determine the words and count how many letters are there
            if(sentence.charAt(letterNumberOfSentence) != ' ' && sentence.charAt(letterNumberOfSentence) != ','
            && sentence.charAt(letterNumberOfSentence) !='.' && sentence.charAt(letterNumberOfSentence)!=';' )
            {
                letterNumberOfWord = letterNumberOfWord + 1;
            }
            //3.2 When word ends, add 1 for letter number's memory location.
            //Letter number's memory location is memory location -1
            else if(letterNumberOfWord != 0)
            {
                //3.2.1 if there is no memory location, create memory location.
                for(memoryLocation = 0; memoryLocation <= letterNumberOfWord; memoryLocation++){
                    if(letterFrequency.size() <= memoryLocation )
                        letterFrequency.add(0);
                }
                //3.2.2 add 1 to letter number's memory location and set letter number of word 0
                letterFrequency.set(letterNumberOfWord - 1, letterFrequency.get(letterNumberOfWord - 1 ) + 1 ); 
                letterNumberOfWord = 0;
            }
            letterNumberOfSentence = letterNumberOfSentence + 1;
        }
        
        //4. Report maximum letter number in arraylist
        System.out.println("The longest word has length " + (letterFrequency.size() - 1));
        System.out.println();
        
        //5.Report word lengths
        for(lengthSoFar = 1; lengthSoFar < letterFrequency.size(); lengthSoFar++ ){
            System.out.println(letterFrequency.get(lengthSoFar - 1) + "words of length " + (lengthSoFar) );
        } 
        System.out.println();

        //6.Detect the most frequent word lenght and its frequency and report.
        System.out.println("the most frequent number is " + getLocationOfMax(letterFrequency) 
        + " and its frequency is " + getMax(letterFrequency));

    } 
    
    /**
    * Gets the biggest number in arraylist
    *@param inputArray is the arraylist which will be searhed for biggest number
    *@return maxNumber
    */
    public static int getMax(ArrayList inputArray){
        int maxValue; 
        maxValue = (int) inputArray.get(0);
        for(int elementSoFar=1; elementSoFar < inputArray.size() ; elementSoFar++){ 
            if((int)inputArray.get(elementSoFar) > maxValue){ 
                maxValue = (int)inputArray.get(elementSoFar);
            }
        }
        return maxValue;
    }
    /**
    *Gets the biggest number's location in arraylist
    *@param inputArray is the arraylist which will be searhed for biggest number
    *@return location of max number
    */
    public static int getLocationOfMax(ArrayList inputArray){
        int elementNumberOfMax;
        int maxValue;
        
        maxValue = (int) inputArray.get(0);
        elementNumberOfMax = 0;

        for(int elementSoFar=1; elementSoFar < inputArray.size() ; elementSoFar++){ 
            if((int)inputArray.get(elementSoFar) > maxValue){ 
                maxValue = (int)inputArray.get(elementSoFar);
                elementNumberOfMax = elementSoFar + 1; 
            }
        }
        return elementNumberOfMax;
    }
}
