/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.helloworld;


/**
 *
 * @author nhatho
 */
public class Items {
    private String name;
    private int DPCI;
    private double price;
    
    public Items(){
        
    }
    
    public Items(String nameIn, int DPCIIn, double priceIn){
        this.name = nameIn;
        this.DPCI = DPCIIn;
        this.price = priceIn;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getDPCI() {
        return DPCI;
    }
    
    public void setDPCI(int DPCI){
        this.DPCI = DPCI;
    }
    
    public double getPrice() {
        return price;
    }
    
    public void setPrice(float price){
        this.price = price;
    }
    
    public void displayAll(){
        System.out.println(getName() + "  DPCI: " + getDPCI() + " " + getPrice());
    }
    
}
