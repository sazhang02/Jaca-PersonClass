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
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PersonClass blank = new PersonClass(0,"", "",false,"");
        blank.setAge(33);
        blank.setFirstName("Lola");
        blank.setLastName("Tony");
        blank.setMaritalStatus(true);
        blank.setGender("female");
        System.out.println(blank.getFirstname()+ " " +blank.getLastname());
        System.out.println("Age: " + blank.getAge());
        System.out.println("Married? " + blank.getMaritalStatus());
        System.out.println("Gender: "+blank.getGender());
        
        System.out.println(); 
        
        PersonClass blanktwo = new PersonClass(0,"", "",false,"");
        blanktwo.setAge(63);
        blanktwo.setFirstName("Mike");
        blanktwo.setLastName("Ike");
        blanktwo.setMaritalStatus(false);
        blanktwo.setGender("male");
        System.out.println(blanktwo.getFirstname()+ " "+ blanktwo.getLastname());    
        System.out.println("Age: " + blanktwo.getAge());
        System.out.println("Married? " +blanktwo.getMaritalStatus());
        System.out.println("Gender: " +blanktwo.getGender());
        
        System.out.println(); 
        
        PersonClass neighbor = new PersonClass(12,"Mary", "Jane", false,"female");
        System.out.println(neighbor);
        neighbor.birthday();
        neighbor.marriage("Pops");
        System.out.println(neighbor);        
        
        System.out.println();   
        
        PersonClass resident = new PersonClass(17,"Nathan", "Locks", true,"male");
        System.out.println(resident);
        resident.birthday();
        resident.marriage("Shouldntchange");
        System.out.println(resident);    
        
        System.out.println();   
        
        PersonClass unmarriedman = new PersonClass(22,"John", "Johnson", false,"male");
        System.out.println(unmarriedman);
        unmarriedman.birthday();
        unmarriedman.marriage("StillShouldntChange");
        System.out.println(unmarriedman);    
        
        System.out.println();  
        
        PersonClass marriedwoman = new PersonClass(29,"Rachel", "Snow", true,"female");
        System.out.println(marriedwoman);
        marriedwoman.birthday();
        marriedwoman.marriage("Notchanging");
        System.out.println(marriedwoman);  
        
        System.out.println();  
        
        PersonClass same = new PersonClass(43,"Pepe", "Greenboy", true,"male");
        System.out.println(same);
        //no change        
        System.out.println(same);          
    }
    
}
