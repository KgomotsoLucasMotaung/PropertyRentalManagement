/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.propertyrentalmanagement;

import java.util.Scanner;

/**
 * Main class for Property Rental Management System
 * Maven compatible version with correct package structure
 * 
 * @author Student
 * @version 1.0
 */
public class PropertyRentalManagement {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Property propertyManager = new Property();
        
        System.out.println("Welcome to Property Rental Management System");
        System.out.println("===========================================");
        
        while (true) {
            displayMenu();
            
            System.out.print("Enter your choice: ");
            String choice = scanner.nextLine().trim();
            
            switch (choice) {
                case "1" -> propertyManager.EnterProperty();
                case "2" -> propertyManager.SearchProperty();
                case "3" -> propertyManager.UpdateProperty();
                case "4" -> propertyManager.DeleteProperty();
                case "5" -> propertyManager.PropertyRentalReport();
                case "6" -> propertyManager.ExitPropertyApplication();
                default -> System.out.println("Invalid choice. Please select a valid option (1-6).");
            }
            
            System.out.println("\nPress Enter to continue...");
            scanner.nextLine();
            System.out.println();
        }
    }
    
    /**
     * Method to display the main menu options
     */
    private static void displayMenu() {
        System.out.println("PROPERTY RENTAL MANAGEMENT SYSTEM");
        System.out.println("==================================");
        System.out.println("Please select one of the following menu items:");
        System.out.println("(1) Enter new property for rent");
        System.out.println("(2) Search for rental property");
        System.out.println("(3) Update property for rent");
        System.out.println("(4) Delete property for rent");
        System.out.println("(5) Property rental report");
        System.out.println("(6) Exit application");
        System.out.println();
    }
}