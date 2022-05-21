
/**
 * This is the class that represents the person object. It is the interface
 * class and has all the methods
 *
 * @author (Kemba Konteh)
 * @version (CSC142 08/16/2018)
 */
public interface Person
{

    public String getFirstName();
   

    public String getLastName();
    
    public String getId();

    public Sex getSex();

    public int getBirthDay();

    public int getBirthMonth();

    public int getBirthYear();

    public void setFirstName(String firstName);

    public void setLastName(String lastName);

    public void setId(String id);

    public void setSex(Sex sex);

    public void setBirthDay(int day);

    public void setBirthMonth(int month);

    public void setBirthYear(int year);

    public String toString();

}
