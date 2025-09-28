/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package roadconstruction;

/**
 * Interface for roads construction reporting
 * Defines contract for classes that handle road construction data
 * 
 * @author Student
 * @version 1.0
 */
public interface IRoadsConstructed {
    /**
     * Method to get the city name
     * @return String representing the city name
     */
    String getCity();
    
    /**
     * Method to get the total number of roads constructed
     * @return int representing the total number of roads constructed
     */
    int getTotalRoadsConstructed();
}