
/**
 * This is the abstarct student class that extends the person class.
 *
 * @author (Kemba Konteh)
 * 
 * @version (CSC142 08/172018)
 */
public abstract class Student implements Person{

    private String id;
    private String firstName;
    private String lastName;
    private Sex sex;
    private int day;
    private int month;
    private int year;
    private int credit;
    /**
     * Constrictor that constructs the student class.
     *
     * @param  id takes id as a parameter of type String.
     * @param  firstName  takes first name as a parameter of type String
     * @param  lastName takes last name as a parameter of type String
     * @param  sex takes sex as a parameter of type Sex
     * @param  day takes day as a parameter of type integer
     * @param  month takes month as a parameter of type integer
     * @param  year takes year as a parameter of type integer
     * @return    
     */

    public Student(String id, String firstName, String lastName, Sex sex, int day, int month, int year) {
        if(!checkBirth(day, month, year)||checkIfEmpty(firstName, lastName, id)){
            throw new IllegalArgumentException("Invalid input");
        }
        setId(id);
        setFirstName(firstName);
        setLastName(lastName);
        setSex(sex);
        setBirthDay(day);
        setBirthMonth(month);
        setBirthYear(year);
    }
    
    /**
     * Method checks if the id is valid or not
     *
     * @param  id takes id as a parameter of type String
     * @return   
     */

    public Boolean isValidId(String id)
    {

        if(!id.matches("[0-9]{9}")){ 
            throw new IllegalArgumentException("The id must be 9 digit numbers, please try again");
        }
        return true;
    }
    
    /**
     * Method that retrieves the student id 
     *
     * @param  
     * @return   id  returns the student id
     */
    
    public String getId() {
        return id;
    }
    
    /**
     * Method that retrieves the student first name
     *
     * @param  
     * @return  firstName  returns a student's first name 
     */
    
    public String getFirstName() {
        return firstName;
    }
    
    /**
     * Method to retrieve a student's last name 
     *
     * @param  
     * @return  lastName  returns the last name of a student
     */
    
    public String getLastName() {
        return lastName;
    }
    
    /**
     * Method that retrieves the sex of a student
     *
     * @param 
     * @return  sex returns the sex of a student
     */

    public Sex getSex() {
        return sex;
    }
    
    /**
     * Method to retrieve a student's birthday 
     *
     * @param 
     * @return  day returns a student's birthday
     */  

    public int getBirthDay() {
        return day;
    }
    
    /**
     * Method that retrieves a student's birth month
     *
     * @param  
     * @return  month  returns a student's birth month
     */
    public int getBirthMonth() {
        return month;
    }
    
    /**
     * Method that retrieves a student's birth year
     *
     * @param  
     * @return  year  returns a student's birth year
     */
    
    public int getBirthYear() {
        return year;
    }
    
    /**
     * Method that retrieves a student's credit or number of credits
     *
     * @param  
     * @return  credit returns the number of credits per student
     */
    
    public int getCredit() {
        return credit;
    }
    
    /**
     * Method that sets the id of a student
     *
     * @param  id takes id as a parameter of type String
     * @return    
     */

    public void setId(String id) {
        if(isValidId(id)){
            this.id = id;
        }
        
    }
    
    /**
     * Method that sets the first name of a student
     *
     * @param  firstName takes first name as a parameter of type String
     * @return    
     */
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    /**
     * Method that sets the last name of a student
     *
     * @param  lastName takes the last name of a student as a parameter of type String
     * @return    
     */

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    /**
     * Method that sets the sex of a student
     *
     * @param  sex takes the sex of a student as a parameter of type Sex
     * @return    
     */

    public void setSex(Sex sex) {
        this.sex = sex;
    }
    
    /**
     * Method that sets the birth day of a student
     *
     * @param day take day as a parameter of type int 
     * @return    
     */

    public void setBirthDay(int day) {
        this.day = day;
    }
    
    /**
     * Method that sets the birth month of a student 
     *
     * @param  month takes month as a parameter of type int
     * @return    
     */

    public void setBirthMonth(int month) {
        this.month = month;
    }
    
    /**
     * Method that sets the birth year of a student 
     *
     * @param  year takes year as a parameter of type int
     * @return    
     */

    public void setBirthYear(int year) {
        this.year = year;
    }
    
    /**
     * Method that sets the number of credit per student
     *
     * @param  credit takes credit as a parameter of type int
     * @return    
     */
    
    public void setCredit(int credit) {
        this.credit = credit;
    }
    
    /**
     * This is the abstract method that retrieves the price
     *
     * @param 
     * @return   
     */

    public abstract double getPrice();
    
    /**
     * Method that checks if first name,last name, and id are empty. Returns a boolean
     *
     * @param  firstName takes first name as a parameter of type String
     * @param lastName takes last name as a parameter of type String
     * @param ID takes ID as a parameter of type String
     * 
     * @return    
     */
   
    public boolean checkIfEmpty(String firstName, String lastName, String ID){
        return (firstName == "" || lastName == ""|| ID == "");
    }
    //public abstract boolean isValidid();
    
    /**
     * Method that checks birth day, month and year
     *
     * @param  day takes day as a parameter of type int
     * @param  month takes month as a parameter of type int
     * @param  year  takes year as a parameter of type int
     * @return   boolean  returns true or false depending on the result
     */
    
    public boolean checkBirth(int day, int month, int year){
        if((day >  0 && day < 31)&&(month>0&&month<13)&&(year>0&&year<2019)){
            return true;}
        else{return false;}
    }
    
    /**
     * This is the to String method displays the result as expected
     *
     * @param 
     * @return  res returns a string representation of the data
     */
   
     public  String  toString(){
        String res = "";
        res += "Name: "+ firstName+ " "+lastName+" ID: "+id +" Gender: "+sex+" Date of Birth: "+ day +"//"+month+"//"+year;
        return res;
    }
    
}
