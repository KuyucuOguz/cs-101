/**
 * __Creates dice .___
 * 
 * @author __Oguz Kuyucu___
 * @version __13.12.2020__
 */
public class Die {
    
    // properties
    final int FACE_OF_DİE = 6;
    int faceValue;

    // constructors
    public Die() {
        roll();
    }

    // methods

    /**
     * __Rolls die .___
     * 
     * @return face value
     */
    public int roll() {
        faceValue = (int) (Math.random() * FACE_OF_DİE) + 1;
        return faceValue;
    }

    /**
     * Gets the face value.
    * @return face value
    */
    public int getFaceValue() {
        return faceValue;
    }

    /**
    * Makes die string.
    * @return face value in string form.
    */
    public String toString() {
        String faceValue;
        faceValue= String.valueOf(this.faceValue);
        return faceValue;
    }
}