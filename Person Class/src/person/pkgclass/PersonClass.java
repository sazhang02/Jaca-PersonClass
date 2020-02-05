/* Samantha Zhang
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person.pkgclass;

/**
 *
 * @author sazhang
 */
public class PersonClass {

    /**
     * @param args the command line arguments
     */

    private int age;
    private String firstname;
    private String lastname;
    private boolean maritalstatus;
    private String gender;
    
    public PersonClass(int a, String fn, String ln, boolean ms, String g)
    {

        age = a;
        firstname = fn;
        lastname = ln;
        maritalstatus = ms;
        gender = g;
    }


    public int getAge()
    {
        return age;
    }
    
    public String getFirstname()
    {
        return firstname;
    }

    public String getLastname()
    {
        return lastname;
    }

    public boolean getMaritalStatus()
    {
        return maritalstatus;
    }

    public String getGender()
    {
        return gender;
    }    
    
    
    
    public void setAge(int a)
    {
        age = a;   
    }    

    public void setFirstName(String fn)
    {
        firstname = fn;   
    }  

    public void setLastName(String ln)
    {
        lastname = ln;   
    }
        
    public void setMaritalStatus(boolean ms)
    {
        maritalstatus = ms;   
    }
    
    public void setGender(String g)
    {
        gender = g;   
    }
    
    
    public int birthday()
    {
        age++;
        System.out.println("Happy Birthday! New age: " + age);
        return age;        
    }
    
    public void marriage(String name)
    {
        if (maritalstatus)
        {
            System.out.println("Already married");
        }
        else
        {
            maritalstatus = true;
            System.out.println("Congrats on your marriage!");
            if (gender == "female")
            {
                setLastName(name);
                
            }
        }
    }
    
    public String toString()
    {
        return firstname + " " + lastname + "\nAge: " + age + "\nMarried? " + maritalstatus + "\nGender: " + gender;
    }
    
}
