/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.helloworld;

/**
 *
 * @author nhatho
 */
public class Shelf {
    private char section;
    private int space;
    private boolean open;
    
    
    public Shelf(char sectionIn, int spaceIn, boolean openIn){
        this.section = sectionIn;
        this.space = spaceIn;
        this.open = openIn;
    }
    
    public char getSection(){
        return section;
    }
    
    public int getSpace(){
        return space;
    }
    
    public boolean getOpen(){
        return open;
    }
    
    public void display(){
        System.out.println(" Current location is Section :" + getSection() + " Space: " + getSpace());
        System.out.println("Availible ? : " + getOpen()) ;
    }
    
    
    
    
    
}
