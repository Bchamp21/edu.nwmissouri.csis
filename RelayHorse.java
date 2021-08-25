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
public class RelayHorse extends Animal {
    
    @Override
    public void speak() {
        System.out.println("I'm an RelayHorse!");
    }
    
    @Override
    public void move() {
        System.out.println("When I move, I Run, Run, Run.");
    }
    
}