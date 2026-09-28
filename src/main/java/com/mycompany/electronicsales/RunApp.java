/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.electronicsales;
import java.util.Scanner;

// Interface
public interface RunApp {
    String getConsoleType();
    String getStore();
    int getTotalSales(); 
}
public abstract class ConsoleSales implements iConsoles{
 
 // Variables
    private String ConsoleType;
    private String StoreName;
    private int TotalSales;

    // Constructor
    public ConsoleSales(String ConsoleType, String StoreName, int TotalSales ) {
        this.ConsoleType = ConsoleType;
        this.StoreName = StoreName;
        this.TotalSales = TotalSales;
    }

    public String getConsoleType() {
        return ConsoleType;
    }
    
    public String getStore(){
        return StoreName;
    }
    
    public int getTotalSales(){
        return TotalSales;
    }
    
     public void printSales() {
         Scanner input = new Scanner(System.in);
        System.out.println("PLEASE SELECT A CONSOLE TYPE");
        System.out.println("1) PS5");
        System.out.println("2) XBOX");
        System.out.println("3) SWITCH ");
         int game = input.nextInt();
         
         System.out.print("Enter the store: ");
        String StoreName = input.nextLine();
        
       System.out.print("Enter the total sales of PS% consoles for number 1: ");
        String TotalSales = input.nextLine();
        
         ConsoleSales report = new ConsoleSales(ConsoleType, StoreName, TotalSales);
        report.printSales();
 
        input.close();
     }
}