/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author RC_Student_Lab
 */
package com.mycompany.propertyrentalmanagement;

/**
 * PropertyModel class represents a rental property with all its details
 * This class serves as the data model for property information
 * Maven compatible version
 * 
 * @author Student
 * @version 1.0
 */
public class PropertyModel {
    public String PropertyId;
    public String PropertyAddress;
    public double PropertyRentalAmount;
    public String AgentName;
    
    /**
     * Default constructor
     */
    public PropertyModel() {
    }
    
    /**
     * Parameterized constructor to create a PropertyModel object
     * @param propertyId The unique identifier for the property
     * @param propertyAddress The address of the property
     * @param propertyRentalAmount The monthly rental amount
     * @param agentName The name of the agent managing the property
     */
    public PropertyModel(String propertyId, String propertyAddress, double propertyRentalAmount, String agentName) {
        this.PropertyId = propertyId;
        this.PropertyAddress = propertyAddress;
        this.PropertyRentalAmount = propertyRentalAmount;
        this.AgentName = agentName;
    }
    
    // Getter methods
    public String getPropertyId() {
        return PropertyId;
    }
    
    public String getPropertyAddress() {
        return PropertyAddress;
    }
    
    public double getPropertyRentalAmount() {
        return PropertyRentalAmount;
    }
    
    public String getAgentName() {
        return AgentName;
    }
    
    // Setter methods
    public void setPropertyId(String propertyId) {
        this.PropertyId = propertyId;
    }
    
    public void setPropertyAddress(String propertyAddress) {
        this.PropertyAddress = propertyAddress;
    }
    
    public void setPropertyRentalAmount(double propertyRentalAmount) {
        this.PropertyRentalAmount = propertyRentalAmount;
    }
    
    public void setAgentName(String agentName) {
        this.AgentName = agentName;
    }
    
    /**
     * Override toString method for better object representation
     * @return String representation of the PropertyModel object
     */
    @Override
    public String toString() {
        return "PropertyModel{" +
                "PropertyId='" + PropertyId + '\'' +
                ", PropertyAddress='" + PropertyAddress + '\'' +
                ", PropertyRentalAmount=" + PropertyRentalAmount +
                ", AgentName='" + AgentName + '\'' +
                '}';
    }
}