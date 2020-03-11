/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package catatan1;

/**
 *
 * @author hd
 */
public class Catatan1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //ARRAY
        
        String[] cars = {"Opel", "Bmw", "Nissan", "Mazda", "Mercedez"};
        System.out.println(cars[3]);
            //Output is Mazda
        
        //Change array element
        String[] type = {"Volvo","Mazda", "Bmw", "Mercedez", "Ford"};
        type[0] = "Nissan";
        System.out.println(type[0]);
            //Output is Nissan
        
        //To check the lenht of array
        String[] models = {"Honda", "Yamaha", "Bajaj", "Suzuki", "Kawasaki"};
        System.out.println(models.length);
            //Output is 5
        
        //Multidimensional Array
        int[][] myNumbers = { {1,2,3,4}, {0,9,8,7,6} };
        int x = myNumbers[1][2];
        System.out.println(x);
    }
        
    
    
}
