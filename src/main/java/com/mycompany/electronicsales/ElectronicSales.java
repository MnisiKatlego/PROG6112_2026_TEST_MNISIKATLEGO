/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.electronicsales;


public class ElectronicSales {

    public static void main(String[] args) {
    // Rows = cities, Columns = PS5, XBOX, SWITCH
        String[] cities = {"CAPE TOWN", "PE", "PRETORIA"};
 
        int[][] sales = {
                {1000, 2000, 3000},   // CAPE TOWN
                {2000, 3000, 4000},   // PORT ELIZABETH
                {1500, 1100, 1200},   // PRETORIA
        };
 
        printReport(cities, sales);
        printTotalSales(cities, sales);
    }
 
    // Prints the two-dimensional array as a formatted sales report
    public static void printReport(String[] employeeNumbers, int[][] sales) {
        System.out.println("-".repeat(60));
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("-".repeat(60));
 
        // Header row
        System.out.printf("%-14s", "");
        System.out.printf("%-14s%-14s%-14s%n", "PS5", "XBOX", "SWITCH");
 
        // Data rows
        for (int row = 0; row < sales.length; row++) {
            System.out.printf("%-14s", employeeNumbers[row]);
            for (int col = 0; col < sales[row].length; col++) {
                System.out.printf("%-14s", + sales[row][col]);
            }
            System.out.println();
        }
        System.out.println("-".repeat(60));
    }
 
    // Sums each employee's three sales figures and prints the total
    public static void printTotalSales(String[] employeeNumbers, int[][] sales) {
        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println("-".repeat(60));
        System.out.println();
 
        for (int row = 0; row < sales.length; row++) {
            int total = 0;
            for (int col = 0; col < sales[row].length; col++) {
                total += sales[row][col];
            }
            System.out.printf("%-10s  %.1f%n", employeeNumbers[row], (double) total);
        }
        System.out.println("-".repeat(60));
      //  System.out.println("CITY WITH THE MOST SALES: " + cities[total]);
      
    }
    
}