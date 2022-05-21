import java.util.ArrayList;
/**
 * This is the class that represents the college student object.
 *
 * @author (Kemba Konteh)
 * @version (CSC142 08/16/2018)
 */

public class CollegeStudents {
    private ArrayList<College> collegeArr;
    /**
     * Contructs the collegeStudent object
     *
     * @param  
     * @return    
     */

    public CollegeStudents(){
        collegeArr = new ArrayList<College>();
    }
    
    /**
     * Method adds student into the list
     *
     * @param  student takes student as a parameter of type College
     * @return   
     */

    public void addStudent(College student){
        collegeArr.add(student);
    }
    
    /**
     * Method removes a student from the list
     *
     * @param  index takes index as a parameter of type int
     * @return    
     */

    public void removeStudent(int index){
        collegeArr.remove(index);
    }
    
    /**
     * Method retrieves a student
     *
     * @param  index takes index as a parameter of type int
     * @return  collegeArr.get(index) returns student at that index
     */

    public Student getStudent(int index){
        return collegeArr.get(index);
    }
    
    /**
     * Method retrieves the total number of students
     *
     * @param  
     * @return collegeArr.size() returns the number of students 
     */

    public int getTotalStudents(){
        return collegeArr.size();
    }
    
    /**
     * Method checks if a student is found on the list or not
     *
     * @param  id takes id as a parameter of type String
     * @return    -1  returns -1 if not found
     */
    
    public int isFound(String id){
        int result=-1;
        for(int i = 0; i < collegeArr.size(); i++){
            if(collegeArr.get(i).getId().equals(id)){
                result= i;
            }
        }
        return result;
    }
    
    /**
     * Method that retrieves the number of fulltime students
     *
     * @param  
     * @return  count  returns the number of fulltime students
     */

    public int getFullTime(){
        int count = 0;
        for(int i = 0; i < collegeArr.size(); i++){
            if(collegeArr.get(i).getFullTime()){
                count ++;
            }
        }
        return count;
    }
    
    /**
     * This is the toString method that displays the output nicely
     *
     * @param  
     * @return  res returns a string representation of the data
     */
   

    public String toString(){
         String res = "";
        int size = collegeArr.size();
        for (int i = 0;i<size;i++){
            res+= collegeArr.get(i)+"\n";

        }
        return res;       
        //return super.toString();
    }
    
    /**
     * This is the test method
     *
     * @param  
     * @return    t
     */

    public static void test(){
        CollegeStudents college = new CollegeStudents();
        College col = new College("955311043","Kemba ","Konteh",22,02,1998,Sex.MALE,5);
        College col1 = new College("876555757","Andrew ","Johnson",22,02,1979,Sex.MALE,4);
        College col2 = new College("343536566","Robert ","Hart",22,02,1989,Sex.MALE,10);
        College col3 = new College("547747474","Anthony ","Philips",22,02,1978,Sex.MALE,15);
        College col4 = new College("975555555","Simpson ","Thomas",22,02,1985,Sex.MALE,20);
        college.addStudent(col);
        college.addStudent(col1);
        college.addStudent(col2);
        college.addStudent(col3);
        college.addStudent(col4);
        //test
        college.removeStudent(3);

        if(!college.getStudent(3).toString().equals(col4.toString())){
            throw new IllegalArgumentException(col4.toString() + " was expected instead it found" + col.getId());
        }

        if(college.getTotalStudents()!=4){
            throw new IllegalArgumentException(4 + " was expected instead it found" + col.getId());
        }

        if(college.isFound("975555555")!=3){
            throw new IllegalArgumentException(3 + " was expected instead it found" + col.getId());
        }   
    }    

}
