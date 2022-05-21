

import java.io.FileNotFoundException;
/**
 * This is the ESL object that extends the student object
 * 
 * @author (Kemba Konteh)
 * @version (CSC142 08/16/2018)
 */
public class ESL extends Student{
    public static final int CREDIT = 5;
    public static final double PRICE = 25.0;
    private Level level;
    /**
     * constructs the ESL object
     *
     * @param  id takes id as a parameter of type String
     * @param firstName takes first name as a parameter of type String
     * @param lastName takes last name as a parameter of type String
     * @param day takes day as a parameter of type int
     * @param month takes month as a parameter of type int
     * @param year takes year as a parameter of type int
     * @param sex takes sex as a parameter of type Sex
     * @param level as a parameter of type Level
     * 
     * @return    
     */

    public ESL(String id, String firstName, String lastName, int day, int month, int year, Sex sex,Level level){
        super(id, firstName, lastName, sex, day, month, year);
        setLevel(level);
        setCredit(CREDIT);
    }
    
    /**
     * Method that retrieves the price 
     *
     * @param 
     * @return  price returns the price 
     */
    
    @Override
    public double getPrice() {
        return PRICE;
    }
    
    /**
     * Method that retrieves the level
     * @param  
     * @return  level  returns the level
     */
   
    public Level getLevel() {
        return level;
    }
    
    /**
     * Method that sets the level
     *
     * @param  level takes level as a parameter of type Level
     * @return    the sum of x and y
     */

    public void setLevel(Level level) {
        this.level = level;
    }
    
    /**
     * This the toString method that nicely displays the result
     *
     * @param  
     * @return  res returns a string representation of the data
     */

    public String toString(){
        String res = super.toString() + "Level: "+level;
        return res;
    }
    
    /**
     * Test
     *
     * @param  
     * @return   
     */
    public static void test(){
        ESL esl = new ESL("955311043","Kemba","Konteh",22,02,1998,Sex.MALE,Level.ESL2B);
        if(!esl.getId().equals("955311043")){
            throw new IllegalArgumentException("Invalid ID found");
        }
        
        if(esl.getCredit() != CREDIT){
            throw new IllegalArgumentException("Not a full time");
        }
        
        if(esl.getPrice() != PRICE){
            throw new IllegalArgumentException("Incorrect Price");
        }
        
        if(esl.getLevel() != Level.ESL2B){
            throw new IllegalArgumentException("Incorrect level");
        }
        
        if(esl.getFirstName() != "Kemba"){
            throw new IllegalArgumentException("Incorrect first name");
        }
        
        if(esl.getLastName() != "Konteh"){
            throw new IllegalArgumentException("Incorrect last name");
        }
        
        if(esl.getSex() != Sex.MALE){
            throw new IllegalArgumentException("Incorrect/wrong sex");
        }
        
        if(esl.getBirthDay() != 22){
            throw new IllegalArgumentException("Incorrect birth day");
        }     
        
        if(esl.getBirthMonth() != 02){
            throw new IllegalArgumentException("Incorrect birth month");
        } 
        
        if(esl.getBirthYear() != 1998){
            throw new IllegalArgumentException("Incorrect birth year");
        }        
             
        
    }
}
