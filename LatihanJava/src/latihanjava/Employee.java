/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanjava;

/**
 *
 * @author hd
 */
public class Employee {
    
    public void sendEmailToEmployee(String name, String gender) {
        if(gender.equals("M")) {
            name = "Mr. " + name;
        } else {
            name = "Ms. " + name;
        }
        System.out.println("Sending email to " + name);
    }
}
