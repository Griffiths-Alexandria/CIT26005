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
public class Motorcycle extends Vehicle{
    
    private final static String name = "Motorcycle";
    private final static String wheels = "2"; 
    private final static String doors = "0";
    private final static String windows = "0"; 
    
    
    public Motorcycle(){
        super(Motorcycle.name, Motorcycle.wheels, Motorcycle.doors,  Motorcycle.windows);
    }
    
}
