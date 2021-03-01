/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Danial
 */
public class Ticket {
    public static int counter = 0;
    private int serialNum;

    public int getSerialNum() {
        return serialNum;
    }
    public int price = 0;
    
    public Ticket() {
        counter++;
        serialNum = counter;
        price = 0;
    }
    
    public int getPrice() {
        return price;
    }
    
    public String toString() {
        return "Ticket: [ serial#: " + getSerialNum() + " Price: " + price + "]";
    }
}
