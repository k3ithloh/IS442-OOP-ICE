// package ICE3.ice3-resource.Q4;

public class AdvancedBookingTicket extends Ticket {
  private int numDaysInAdvance;

  public AdvancedBookingTicket(String title, int numDaysInAdvanced){
    super(title);
    this.numDaysInAdvance = numDaysInAdvanced;
  }

  public double calculatePrice(){
    return super.calculatePrice();
  }
}
