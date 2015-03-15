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
public class Van extends Vehicle{
    
    private final static String name = "Van";
    private final static String wheels = "4"; 
    private final static String doors = "5";
    private final static String windows = "8"; 
    
    
    public Van(){
        super(Van.name,Van.wheels,Van.doors, Van.windows);
    }
}
