public class AdvancedBookingTicket extends Ticket {
    private int numDaysInAdvance;

    public AdvancedBookingTicket(String title, int numDaysInAdvance) {
        super(title);
        this.numDaysInAdvance = numDaysInAdvance;
    }

    @Override
    public double calculatePrice() {
        double origPrice = super.calculatePrice();
        double discount = 0.5 * numDaysInAdvance;

        if (discount > origPrice / 2) {
            discount = origPrice / 2;
        }
        
        return origPrice - discount;
    }
}
