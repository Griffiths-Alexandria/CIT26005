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
public abstract class Vehicle {
    
    private String wheels = null; 
    private String doors = null; 
    private String windows = null; 
    private String name = null;
    
    public Vehicle(){
        
    }
    
    public Vehicle(String name, String wheels, String doors, String windows){
        setName(name); 
        setWheels(wheels);
        setDoors(doors);
        setWindows(windows);
        
    }

    public String getWheels() {
        return wheels;
    }

    public void setWheels(String wheels) {
        this.wheels = wheels;
    }

    public String getDoors() {
        return doors;
    }

    public void setDoors(String doors) {
        this.doors = doors;
    }

    public String getWindows() {
        return windows;
    }

    public void setWindows(String windows) {
        this.windows = windows;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    

    protected void display(){
        System.out.println("The "+ name + " has "+ wheels + " wheels " + doors + " doors and " + windows + " windows." );
        
    }
}
