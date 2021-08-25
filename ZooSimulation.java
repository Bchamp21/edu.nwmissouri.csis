/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nwmissouri.csis;

/**
 *
 * @author Dr. Case
 */
public class ZooSimulation{
 
    static String greeting = "Welcome to Bhuvan's Zoo!";
    
    
    /*
    * Execution begins here
    */
    public static void main(String args[]) {

      System.out.println(greeting.toUpperCase());
      
      RelayHorse alice = new RelayHorse();
      alice.speak();
      alice.move();
      
    }
}