/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classesandobjectse;

/**
 *
 * @author upgra
 */
public class cars {
    String manufacturer;
    String model;
    String colour;
    int numWheels;
    
    public void Drive (double direction) {
        System.out.printf("the %s %s is driving at %s degrees", colour, manufacturer, direction);
    }
}
