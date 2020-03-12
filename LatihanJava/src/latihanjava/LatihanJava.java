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
public class LatihanJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Inheritance
        Kiddy kiddy = new Kiddy();
        System.out.println(kiddy.first_attribute);
        System.out.println(kiddy.second_attribute);
        System.out.println(kiddy.third_attribute);
        kiddy.printHello();
        kiddy.sendHello();
        kiddy.sayFourthAttribute();
        
        //POlimorphism Cat & Dog
        Animal cat = new Cat();
        cat.sound();
    
        Animal dog = new Dog();
        dog.sound();
        
        //Polimorphism
    Operational op = new Operational();
    op.operation("Hai Guys");
    op.operation(2);
    op.operation(50, 10);
    
    //Abstarction
    Employee emp = new Employee();
    emp.sendEmailToEmployee("Rofi Chandra", "M");
    
    //Encapsulation
    Book book = new Book();
    book.setTittle("Harry Potter");
    book.setISBN("9821321312");
    book.setPrice(100000);
    book.setYear("2019");
    
        System.out.println(book.getTittle());
        System.out.println(book.getISBN());
        System.out.println(book.getPrice());
        System.out.println(book.getYear());
    
    //Encapsulation
    Email email = new Email();
    email.setTitle("Tugas 2SC4 - Rofi 1920010205");
    email.setSender("Rofi Chandra Saputra");
    email.setRecipient("mhudyaramadhana@gmail.com");
    email.setBody("Selamat Pagi,Pak. Saya ingin menyerahkan tugas pertama dengan melampirkan file berikut.");
    email.setAttachment("Tugas 2SC$.pdf");
    
        System.out.println(email.getTitle());
        System.out.println(email.getSender());
        System.out.println(email.getRecipient());
        System.out.println(email.getBody());
        System.out.println(email.getAttachment());
    }
}

    

