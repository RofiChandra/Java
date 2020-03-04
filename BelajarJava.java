/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajarjava;

import java.util.Scanner;
/**
 *
 * @author hd
 */
public class BelajarJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // To print out data
        System.out.println("Hello World");
        
        //Declare data type and print out
        String greeting = "Hello, Have a nice day!";
        int number = 10;
        Boolean question = true;
        Double comma = 24.5;
        
        System.out.println(greeting);
        System.out.println(number);
        System.out.println(question);
        System.out.println(comma);
        
        //Get input from  keyboard
        String Nama, Umur, Hobby, Kelebihan, Kekurangan;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Nama :");
        String nama = keyboard.nextLine();
        System.out.print("Umur :");
        String umur = keyboard.nextLine();
        System.out.print("Hobby :");
        String hobby = keyboard.nextLine();
        System.out.print("Kelebihan :");
        String kelebihan = keyboard.nextLine();
        System.out.print("Kekurangan :");
        String kekurangan = keyboard.nextLine();
        
        System.out.println("----------");
        System.out.println("Nama :" + nama);
        System.out.println("Umur :" + umur);
        System.out.println("Hobby :" + hobby);
        System.out.println("Kelebihan :" + kelebihan);
        System.out.println("Kekurangan :" + kekurangan);
//        
//        //IF Statement
        int result = 65;
        
        if(result < 75) {
            System.out.println("Improve your skill even better");
        }
        
//        //Else statement
        int score = 80;
        
        if(score < 75) {
            System.out.println("Improve your skill even better");
        }
        else {
            System.out.println("Keeping up your skill");
        }
        
        System.out.print("Insert your result :");
        Scanner input = new Scanner (System.in);
        int point = input.nextInt();
        
        if(point <= 75){
            System.out.println("Improve your skill even better");
        }
        else {
            System.out.println("Keeping up your skill");
        }
               
//        //IF Else Statement
        int angka = 20;
        
        if(angka < 15 ) {
            System.out.println("It's under 15");
        }
        else if (angka < 31) {
            System.out.println("It's above 15 and under 31");
        }
        else {
            System.out.println("It's above 31");
        }
        
        //Switch Case
        System.out.println("Pilihan : \n 1.Teknik Informatika \n 2.Teknik Industri \n 3.Teknik Sipil");
        System.out.print("Masukkan pilihan anda: ");
        Scanner inputan = new Scanner (System.in);
        String hasil = inputan.nextLine();
        
        switch(hasil){
            case "1":
                System.out.println("Anda memilih Teknik Informatika");
                break;
            case "2":
                System.out.println("Anda memilih Teknik Industri");
                break;
            case "3":
                System.out.println("Anda memilih Teknik Sipil");
                break;
                
        }
        
        //Looping
        
        //Loop For
        int max = 10;
                for(int i = 1; i<=max;i++) {
                    System.out.println(i);
                }
        
        //Loop Foreach
        int arr[] = {3, 1, 2, 5, 4};
        
        for (int i=0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        
        String words[] = {"Hai", "You", "Are", "Adorable"};
        
        for (String word : words) {
            System.out.println(word);
        }
        
        //Loop While Do
        int maxi = 5 ;
                int i = 0;
        while(i<maxi) {
            System.out.println("You are amazing");
            i++;
        }
        
        //Loop Do While
        int maks = 5;
        int x = 0;
        do {
            System.out.println("You are great");
            x++;
        } while (x<maks);        
    }
}
