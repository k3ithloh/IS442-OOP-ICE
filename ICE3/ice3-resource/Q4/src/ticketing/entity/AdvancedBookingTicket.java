package ticketing.entity;

public class AdvancedBookingTicket extends Ticket {
    private int numDaysInAdvance;

    public AdvancedBookingTicket(String title, int numDaysInAdvance) {
        super(title);
        this.numDaysInAdvance = numDaysInAdvance;
    }

    public double calculatePrice() {
        double basePrice = super.calculatePrice();
        double discount = 0.5 * numDaysInAdvance;
        double maxDiscount = basePrice / 2;
        if (discount > maxDiscount) {
            return maxDiscount;
        } else {
            return basePrice - discount;
        }
    }
}
