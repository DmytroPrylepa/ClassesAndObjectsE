/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classesandobjectse;

/**
 *
 * @author upgra
 */
public class Cars {

    String manufacturer;
    String model;
    String colour;
    int numWheels;

    public Cars(String manufacturer, String model, String colour, int numWheels) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.colour = colour;
        this.numWheels = numWheels;
    }
    
    public void Drive (double direction) {
        System.out.printf("the %s %s is driving at %s degrees", colour, manufacturer, direction);
    }

     public void Drive(String direction)   {
        System.out.println("The " + colour + " " + manufacturer + " " + model + " is driving " + direction);
    }
}