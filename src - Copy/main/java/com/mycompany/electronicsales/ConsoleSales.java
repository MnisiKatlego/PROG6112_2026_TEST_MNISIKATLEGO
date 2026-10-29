/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.electronicsales;

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

    // Get staff number
    @Override
    public String getConsoleType() {
        return ConsoleType;
    }
    
    // Get staff location
    @Override
    public String getStore(){
        return StoreName;
    }
    
     // Get staff location
    @Override
    public int getTotalSales(){
        return TotalSales;
    }
}

