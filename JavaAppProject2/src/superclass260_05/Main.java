/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superclass260_05;

/**
 *
 * @author griffiths
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
    Main(){
        
    }
    
public static void main(String[] args) {
    
    Sedan sedan = new Sedan();
    sedan.display();
    
    Van van = new Van();
    van.display();
    
    Motorcycle motor = new Motorcycle();
    motor.display();
    }
}
 
    

