/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.propertyrentalmanagement;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Property class manages all property rental operations
 * Contains methods for CRUD operations on property data
 * Maven compatible version
 * 
 * @author Student
 * @version 1.0
 */
public class Property {
    private ArrayList<PropertyModel> propertyList;
    private Scanner scanner;
    
    /**
     * Constructor initializes the property list and scanner
     */
    public Property() {
        propertyList = new ArrayList<>();
        scanner = new Scanner(System.in);
    }
    
    /**
     * Method to enter a new property for rent
     * Captures all property details from user input
     */
    public void EnterProperty() {
        System.out.println("CAPTURE A NEW PROPERTY");
        System.out.println("************************");
        
        System.out.print("Enter the property id: ");
        String id = scanner.nextLine().trim();
        
        // Check if property ID already exists
        if (findPropertyById(id) != null) {
            System.out.println("Error: Property with ID " + id + " already exists!");
            return;
        }
        
        System.out.print("Enter the property address: ");
        String address = scanner.nextLine().trim();
        
        // Get validated rental amount
        double rentalAmount = getRentalAmount();
        
        System.out.print("Enter the agent name: ");
        String agentName = scanner.nextLine().trim();
        
        // Create and add new property
        PropertyModel newProperty = new PropertyModel(id, address, rentalAmount, agentName);
        propertyList.add(newProperty);
        
        System.out.println("Property rental details have been successfully processed.");
    }
    
    /**
     * Method to search for a property by ID
     * Displays property details if found, error message if not found
     */
    public PropertyModel SearchProperty() {
        System.out.print("Enter the property id to search: ");
        String searchId = scanner.nextLine().trim();
        System.out.println("---------------------------------------------");
        
        PropertyModel property = findPropertyById(searchId);
        
        if (property != null) {
            displayPropertyDetails(property);
            System.out.println("---------------------------------------------");
            return property;
        } else {
            System.out.println("Property with Property Id: " + searchId + " was not found!");
            System.out.println("---------------------------------------------");
            return null;
        }
    }
    
    /**
     * Overloaded SearchProperty method for testing purposes
     * @param propertyId The property ID to search for
     * @return PropertyModel if found, null otherwise
     */
    public PropertyModel SearchProperty(String propertyId) {
        return findPropertyById(propertyId);
    }
    
    /**
     * Method to update an existing property
     * Allows updating address, rental amount, and agent name
     */
    public boolean UpdateProperty() {
        System.out.print("Enter the property id to update: ");
        String updateId = scanner.nextLine().trim();
        
        PropertyModel property = findPropertyById(updateId);
        
        if (property != null) {
            System.out.print("Enter the new property address: ");
            String newAddress = scanner.nextLine().trim();
            
            double newRentalAmount = getRentalAmount();
            
            System.out.print("Enter the new agent name: ");
            String newAgentName = scanner.nextLine().trim();
            
            // Update property details
            property.setPropertyAddress(newAddress);
            property.setPropertyRentalAmount(newRentalAmount);
            property.setAgentName(newAgentName);
            
            System.out.println("Property updated successfully!");
            return true;
        } else {
            System.out.println("Property with ID " + updateId + " not found!");
            return false;
        }
    }
    
    /**
     * Overloaded UpdateProperty method for testing
     * @param propertyId The property ID to update
     * @param newAddress New address
     * @param newRentalAmount New rental amount
     * @param newAgentName New agent name
     * @return true if update successful, false otherwise
     */
    public boolean UpdateProperty(String propertyId, String newAddress, double newRentalAmount, String newAgentName) {
        PropertyModel property = findPropertyById(propertyId);
        
        if (property != null) {
            property.setPropertyAddress(newAddress);
            property.setPropertyRentalAmount(newRentalAmount);
            property.setAgentName(newAgentName);
            return true;
        }
        return false;
    }
    
    /**
     * Method to delete a property from the system
     * Requires user confirmation before deletion
     */
    public boolean DeleteProperty() {
        System.out.print("Enter the property id to delete: ");
        String deleteId = scanner.nextLine().trim();
        
        PropertyModel property = findPropertyById(deleteId);
        
        if (property != null) {
            System.out.print("Are you sure you want to delete property " + deleteId + " from the system? Yes (y) to delete: ");
            String confirmation = scanner.nextLine().trim().toLowerCase();
            
            if (confirmation.equals("y")) {
                propertyList.remove(property);
                System.out.println("---------------------------------------------");
                System.out.println("Property with Property Id: " + deleteId + " WAS deleted!");
                System.out.println("---------------------------------------------");
                return true;
            } else {
                System.out.println("Delete operation cancelled.");
                return false;
            }
        } else {
            System.out.println("Property with ID " + deleteId + " not found!");
            return false;
        }
    }
    
    /**
     * Overloaded DeleteProperty method for testing
     * @param propertyId The property ID to delete
     * @return true if deletion successful, false otherwise
     */
    public boolean DeleteProperty(String propertyId) {
        PropertyModel property = findPropertyById(propertyId);
        
        if (property != null) {
            propertyList.remove(property);
            return true;
        }
        return false;
    }
    
    /**
     * Method to validate property rental amount
     * Ensures amount is >= R1500 and is numeric
     */
    public boolean PropertyAmountValidation(double amount) {
        return amount >= 1500.0;
    }
    
    /**
     * Method to display property rental report
     * Shows all properties in the system
     */
    public void PropertyRentalReport() {
        System.out.println("PROPERTY RENTAL REPORT - 2025");
        System.out.println("********************************");
        
        if (propertyList.isEmpty()) {
            System.out.println("No properties found in the system.");
            return;
        }
        
        for (int i = 0; i < propertyList.size(); i++) {
            PropertyModel property = propertyList.get(i);
            System.out.println("Property " + (i + 1));
            System.out.println("---------------------------------------------");
            displayPropertyDetails(property);
            System.out.println("---------------------------------------------");
        }
    }
    
    /**
     * Method to exit the property application
     */
    public void ExitPropertyApplication() {
        System.out.println("Thank you for using the Property Rental Management System!");
        System.exit(0);
    }
    
    /**
     * Helper method to get validated rental amount from user
     * @return Valid rental amount >= R1500
     */
    private double getRentalAmount() {
        while (true) {
            System.out.print("Enter the monthly rental amount: R ");
            String amountInput = scanner.nextLine().trim();
            
            try {
                double amount = Double.parseDouble(amountInput);
                if (PropertyAmountValidation(amount)) {
                    return amount;
                } else {
                    System.out.println("Invalid rental amount. Please enter an amount greater than or equal to R 1500.");
                    System.out.print("Please re-enter the monthly rental amount: R ");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number for the rental amount.");
                System.out.print("Please re-enter the monthly rental amount: R ");
            }
        }
    }
    
    /**
     * Helper method to find a property by ID
     * @param propertyId The property ID to search for
     * @return PropertyModel if found, null otherwise
     */
    private PropertyModel findPropertyById(String propertyId) {
        for (PropertyModel property : propertyList) {
            if (property.getPropertyId().equals(propertyId)) {
                return property;
            }
        }
        return null;
    }
    
    /**
     * Helper method to display property details
     * @param property The property to display
     */
    private void displayPropertyDetails(PropertyModel property) {
        System.out.println("PROPERTY ID: " + property.getPropertyId());
        System.out.println("PROPERTY ADDRESS: " + property.getPropertyAddress());
        System.out.printf("MONTHLY RENTAL AMOUNT: R %.2f%n", property.getPropertyRentalAmount());
        System.out.println("AGENT NAME: " + property.getAgentName());
    }
    
    /**
     * Getter method for property list (used for testing)
     * @return ArrayList of PropertyModel objects
     */
    public ArrayList<PropertyModel> getPropertyList() {
        return propertyList;
    }
    
    /**
     * Method to add a property (used for testing)
     * @param property PropertyModel to add
     */
    public void addProperty(PropertyModel property) {
        propertyList.add(property);
    }

}