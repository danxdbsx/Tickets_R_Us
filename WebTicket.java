/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Danial
 */
public class WebTicket extends Ticket{
    public static int WEB_TICKET_PRICE = 30;
    public static int WEB_TICKET_LT_WEEK_PRICE = 40;
    
    
    public WebTicket() {
    }
    
    public WebTicket(int days) {
        if (days >= 7) {
            price = WEB_TICKET_PRICE;
        }
        else {
            price = WEB_TICKET_LT_WEEK_PRICE;
        }
    } 
    
    
}
