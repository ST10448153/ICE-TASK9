/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.joptionpaneexample;

import javax.swing.*;
/**
 *
 * @author RC_Student_lab
 */


public class Calculator {

     
     
     public static int add(){
         //user is prompted to enter number
          String num1 = JOptionPane.showInputDialog("Enter your first number:");
          System.out.println();
          
        
          String num2 = JOptionPane.showInputDialog("enter your second number: ");
          int num = Integer.parseInt(num1);
          //two values that contain string aree then converted to integers
          int a = Integer.parseInt(num1);
          int b = Integer.parseInt(num2);
          int add = a + b;
          //the output is displayed on screen
          JOptionPane.showMessageDialog(null, "The sum of these numbers is: "+add);
          return a+ b;
     }
     
     public static int subtract(){
         //user is prompted to enter number
          String num1 = JOptionPane.showInputDialog("Enter your first number:");
          System.out.println();
          
        
          String num2 = JOptionPane.showInputDialog("enter your second number: ");
          int num = Integer.parseInt(num1);
          //two values that contain string aree then converted to integers
          int a = Integer.parseInt(num1);
          int b = Integer.parseInt(num2);
          int subtract = a - b;
          //the output is displayed on screen
          JOptionPane.showMessageDialog(null, "The difference of these numbers is: "+subtract);
          return a - b;
     }
     
     public static int multiply(){
         //user is prompted to enter number
          String num1 = JOptionPane.showInputDialog("Enter your first number:");
          System.out.println();
          
        
          String num2 = JOptionPane.showInputDialog("enter your second number: ");
          int num = Integer.parseInt(num1);
          //two values that contain string aree then converted to integers
          int a = Integer.parseInt(num1);
          int b = Integer.parseInt(num2);
          int multiply = a * b;
          //the output is displayed on screen
          JOptionPane.showMessageDialog(null, "The multiplication of these numbers is: "+multiply);
          return multiply;
     }
     
     public static int divide(){
         //user is prompted to enter number
          String num1 = JOptionPane.showInputDialog("Enter your first number:");
          System.out.println();
          
        
          String num2 = JOptionPane.showInputDialog("enter your second number: ");
          int num = Integer.parseInt(num1);
          //two values that contain string aree then converted to integers
          int a = Integer.parseInt(num1);
          int b = Integer.parseInt(num2);
          int divide = a / b;
          //the output is displayed on screen
          JOptionPane.showMessageDialog(null, "The division of these numbers is: "+divide);
          return a / b;
     }
      public static void main(String[] args) {
     
        
           while(true){
            String select = JOptionPane.showInputDialog("""
                                                      Please select the operation you want with two numbers:
                                                      1.add
                                                      2.multiply
                                                      3.subtract
                                                      4.divide""");
               System.out.println();
               int option = Integer.parseInt(select);
             if (option == 0) {
                JOptionPane.showMessageDialog(null, "Thank you for using our service...");
                break;      
             }
              
              switch(option){
                  case 1 -> add();
                  case 2 -> multiply();
                  case 3 -> subtract();
                  case 4 -> divide();
              } 
              
              }
         }
         }
         
      
           
         
      

