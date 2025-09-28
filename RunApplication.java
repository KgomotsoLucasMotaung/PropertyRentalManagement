/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package roadconstruction;

/**
 * RunApplication class to instantiate and test the RoadConstructionReport class
 * Demonstrates the implementation of abstract classes and interfaces
 * 
 * @author Student
 * @version 1.0
 */
public class RunApplication {
    
    /**
     * Main method to run the road construction reporting application
     * Creates instances of RoadConstructionReport and displays the report
     * @param args Command line arguments (not used)
     */
    public static void main(String[] args) {
        System.out.println("Road Construction Management System");
        System.out.println("===================================");
        System.out.println();
        
        // Create instances of RoadConstructionReport with sample data
        RoadConstructionReport report1 = new RoadConstructionReport("Cape Town", 125);
        RoadConstructionReport report2 = new RoadConstructionReport("Johannesburg", 200);
        RoadConstructionReport report3 = new RoadConstructionReport("Durban", 89);
        RoadConstructionReport report4 = new RoadConstructionReport("Pretoria", 156);
        
        // Display reports for different cities
        System.out.println("Report 1:");
        report1.printRoadsConstructedReport();
        System.out.println();
        
        System.out.println("Report 2:");
        report2.printRoadsConstructedReport();
        System.out.println();
        
        System.out.println("Report 3:");
        report3.printRoadsConstructedReport();
        System.out.println();
        
        System.out.println("Report 4:");
        report4.printRoadsConstructedReport();
        System.out.println();
        
        // Demonstrate interface methods directly
        System.out.println("Interface Method Demonstration:");
        System.out.println("==============================");
        
        IRoadsConstructed interfaceRef = (IRoadsConstructed) report1;
        System.out.println("City from interface: " + interfaceRef.getCity());
        System.out.println("Total roads from interface: " + interfaceRef.getTotalRoadsConstructed());
        System.out.println();
        
        // Calculate and display total roads across all cities
        int totalRoads = report1.getTotalRoadsConstructed() + 
                        report2.getTotalRoadsConstructed() + 
                        report3.getTotalRoadsConstructed() + 
                        report4.getTotalRoadsConstructed();
        
        System.out.println("SUMMARY REPORT");
        System.out.println("==============");
        System.out.println("Total roads constructed across all cities: " + totalRoads);
        System.out.println("Average roads per city: " + (totalRoads / 4));
        System.out.println();
        
        System.out.println("Road Construction Reporting Complete!");
    }
}