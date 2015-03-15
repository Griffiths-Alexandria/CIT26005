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
public class Sedan extends Vehicle {
    
    private final static String name = "Sedan";
    private final static String wheels = "4"; 
    private final static String doors = "4";
    private final static String windows = "4"; 
    

    public Sedan(){
        super(Sedan.name, Sedan.wheels, Sedan.doors, Sedan.windows);
    }
}