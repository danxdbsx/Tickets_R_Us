/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Danial
 */
public class DiscountTicket extends WebTicket{
    public static int WEB_TICKET_PRICE = 30;
    public static int WEB_TICKET_LT_WEEK_PRICE = 40;
    public static double DISCOUNT = 0.5;
    public String discType = "";

    public DiscountTicket(){
    }
    
    public DiscountTicket (int days, String type) {
        super();
        if (days >= 7) {
            price = (int) (WEB_TICKET_PRICE*DISCOUNT);
        }
        else {
            price = (int) (WEB_TICKET_LT_WEEK_PRICE*DISCOUNT);
        }
        this.discType = type;
    }
    
    @Override
    public String toString() {
        return "Ticket: [ serial#: " + getSerialNum() + " Price: " + price + " Type: " + this.discType + "]";
    }
}
