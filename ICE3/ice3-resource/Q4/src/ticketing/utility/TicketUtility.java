package ticketing.utility;

import ticketing.entity.*;
import java.util.List;
import java.util.ArrayList;

public class TicketUtility {
    public static double calculateAverageTicketPrice(ArrayList<Ticket> ticketList) {
        if (ticketList == null || ticketList.isEmpty()) {
            return 0.0;
        }
        float totalPrice = 0;
        int numTicket = ticketList.size();
        for (Ticket ticket : ticketList) {
            totalPrice += ticket.calculatePrice();
        }
        double finalPrice = totalPrice / numTicket;

        return Double.parseDouble(String.format("%2f", finalPrice));
    }
}
