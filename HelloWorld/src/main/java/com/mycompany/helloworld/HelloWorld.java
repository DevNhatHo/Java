package com.mycompany.helloworld;
import java.util.Scanner;


/**
 *
 * @author nhatho 
 */
public class HelloWorld {

    public static void main(String[] args) {
        
        greeting();
        
        Items tv = new Items("Vizio", 1001,  499.99);
        Items candles = new Items("Pumkin", 1002, 5.99);
        Shelf a = new Shelf("a", 1,true );
        

        //tv.displayAll();
        //candles.displayAll();
    }
    public static void greeting(){
        System.out.println("Welcome to Nhats's inventory system! We can  insert, pull or salvage an item? ");
        
    }
}
