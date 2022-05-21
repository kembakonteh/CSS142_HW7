
/**
 * This home work gives a summary of all the concepts we have learned 
 * through out the quarter starting from procedural to object oreinted 
 * programming. The program makes use of polymophism, inheritance and so on...
 *
 * @author (Kemba Konteh)
 * 
 * @version (CSC142 08/16/2018)
 */
public class College extends Student{
    public static final double CREDIT_PRICE = 100;
    /**
     * constructor that constructs the college object and extends the student
     * object
     *
     * @param id takes id as a parameter of type String
     * @param firstName takes first name as a parameter of type String
     * @param lastName takes last name as a parameter of type String
     * @param day takes day as a parameter of type int 
     * @param month takes month as a parameter of type int
     * @param year takes year as a parameter of type int
     * @param sex takes sex as a parameter of type Sex
     * @param credit takes credit as a parameter of type int 
     * 
     * @return    
     */
    

    public College(String id, String firstName, String lastName, int day, int month, int year, Sex sex, int credit){
        super(id, firstName, lastName, sex, day, month, year);
        setCredit(credit);
    }
    
    /**
     * Method that retrieves the price
     *
     * @param  
     * @return getCredit() * CREDIT_PRICE returns the price 
     */
   
    @Override
    public double getPrice() {
        return getCredit() * CREDIT_PRICE;
    }
    
    /**
     * Method that checks if a paticular student is fulltime or not
     *
     * @param  
     * @return  false  returns a boolean depending on the result
     */
   
    public boolean getFullTime(){
        boolean flag = false;
        if(getCredit() > 13)
            flag= true;
        return flag;
    }
    
    /**
     * This is the toString method that displays the data 
     *
     * @param 
     * @return res returns a strinf representation of the data
     */
    

    public String toString(){
        String res="";
        res+= super.toString() + "Credit: "+ super.getCredit() + "Tuition: "+getPrice();
       return res; 
    }
    
    /**
     * test
     *
     * @param  
     * @return    
     */
   

    public static void test(){
        College col = new College("955311043","Kemba","Konteh",02,10,1988,Sex.MALE,5);
        if(!col.getId().equals("955311043")){
            throw new IllegalArgumentException("955311043 was expected instead it found" + col.getFullTime());
        }
        
        if(col.getCredit() !=5){
            throw new IllegalArgumentException("Credit not correct");
        }
        
        if(col.getPrice() != col.getCredit()*CREDIT_PRICE){
            throw new IllegalArgumentException("Incorrect Price");
        }
        
        if(col.getFirstName() != "Kemba"){
            throw new IllegalArgumentException("Incorrect first name");
        }
        
        if(col.getLastName() != "Konteh"){
            throw new IllegalArgumentException("Incorrect last name");
        }
        
        if(col.getSex() != Sex.MALE){
            throw new IllegalArgumentException("Incorrect/wrong sex");
        }
        
        if(col.getBirthDay() != 02){
            throw new IllegalArgumentException("Incorrect birth day");
        }     
        
        if(col.getBirthMonth() != 10){
            throw new IllegalArgumentException("Incorrect birth month");
        } 
        
        if(col.getBirthYear() != 1988){
            throw new IllegalArgumentException("Incorrect birth year");
        }        
        
        if(col.getFullTime() != false){
            throw new IllegalArgumentException("Student is not FullTime");
        }        
        
    }
}
