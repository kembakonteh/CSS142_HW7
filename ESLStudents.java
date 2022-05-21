import java.util.*;
/**
 * Class that represents the ESLStudents objects
 *
 * @author (Kemba Konteh)
 * @version (CSC 142 08/16/2018)
 */

public class ESLStudents {
    private ArrayList<ESL> eslArr;
    /**
     * Constructor that constructs the ESLStudents object
     *
     * @param  
     * @return  
     */

    public ESLStudents(){
        eslArr = new ArrayList<ESL>();
    }
    
    /**
     * Method that adds student to the list
     *
     * @param student takes student as a parameter of type ESL
     * @return    
     */
    
    public void addStudent(ESL student){
        eslArr.add(student);
    }
    
    /**
     * Method that removes a student from the list
     *
     * @param  index Takes index as a parameter of type int
     * @return    the sum of x and y
     */
    
    public void removeStudent(int index){
        eslArr.remove(index);
    }
    
    /**
     * Method that retrieves a student
     *
     * @param  index takes index as a parameter of type int
     * @return  eslArr.get(index) returns student at that index
     */

    public Student getStudent(int index){
        return eslArr.get(index);
    }
    
    /**
     * Method that gets the total students 
     *
     * @param  
     * @return eslArr.size() returns the number of students
     */

    public int getTotalStudents(){
        return eslArr.size();
    }
    
    /**
     * Method that checks to see if a student is in the list
     *
     * @param  id takes id as a parameter of type String
     * @return  -1 returns -1 if not found
     */

    public int isFound(String id){
        int result = -1;
        for(int i = 0; i < eslArr.size(); i++){
            if(eslArr.get(i).getId().equals(id)){
                result= i;
            }
        }
        return result;
    }
    
    /**
     * Method that retrieves the number of students in a level
     *
     * @param  level takes level as a parameter of type Level
     * @return  count returns the student count
     */

    public int getStudentLevel(Level level){
        int count = 0;
        for(int i = 0; i < eslArr.size(); i++){
            if(eslArr.get(i).getLevel()==level){
                count ++;
            }
        }
        return count;
    }
    
    /**
     * toString method that nicely displays the result
     *
     * @param  
     * @return res returns a string representation of the data
     */

    public String toString(){
         String res = "";
        int size = eslArr.size();
        for (int i=0;i<size;i++){
            res += eslArr.get(i)+"\n";

        }
        return res;
        //return super.toString();
    }
    
    /**
     * Test 
     *
     * @param  
     * @return    
     */

    public static void test(){
        ESLStudents eslStudent = new ESLStudents();
        ESL esl = new ESL("955311043","Kemba ","Konteh",22,02,1998,Sex.MALE,Level.ESL1A);
        ESL esl1 = new ESL("876555757","Andrew ","Johnson",22,02,1979,Sex.MALE,Level.ESL5A);
        ESL esl2 = new ESL("343536566","Robert ","Hart",22,02,1989,Sex.MALE,Level.ESL1A);
        ESL esl3 = new ESL("547747474","Anthony ","Philips",22,02,1978,Sex.MALE,Level.ESL4B);
        ESL esl4 = new ESL("975555555","Simpson ","Thomas",22,02,1985,Sex.MALE,Level.ESL6A);
        eslStudent.addStudent(esl);
        eslStudent.addStudent(esl1);
        eslStudent.addStudent(esl2);
        eslStudent.addStudent(esl3);
        eslStudent.addStudent(esl4);
        //test
        eslStudent.removeStudent(3);

        if(!eslStudent.getStudent(3).toString().equals(esl4.toString())){
            throw new IllegalArgumentException(esl4.toString() + " was expected instead it found" + esl.getId());
        }

        if(eslStudent.getTotalStudents()!=4){
            throw new IllegalArgumentException(4 + " was expected instead it found" + esl.getId());
        }

        if(eslStudent.isFound("975555555")!=3){
            throw new IllegalArgumentException(3 + " was expected instead it found" + esl.getId());
        }   

        if(eslStudent.getStudentLevel(Level.ESL1A)!=2){
            throw new IllegalArgumentException( 2 + " was expected instead it found" + esl.getId());
        }
        
        System.out.println("Test was succesful");
    }    
}