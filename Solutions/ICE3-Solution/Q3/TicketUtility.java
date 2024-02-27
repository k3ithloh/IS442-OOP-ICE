import java.util.List;

public class TicketUtility {
    public static double calculateAverageTicketPrice(List<Ticket> tickets) {
        if (tickets == null || tickets.size() == 0) return 0;

        double sum = 0;
        for (int i = 0; i < tickets.size(); i++) {  //we are assuming that the tickets list has valid Tickets (non null)
            sum += tickets.get(i).calculatePrice();
        }

        return sum / tickets.size();
    }
}
