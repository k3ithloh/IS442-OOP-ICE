import java.util.ArrayList;

public class TaxCalculator {
  public static double calculateTotalPayableTax(ArrayList<TaxableProduct> pList){
    double totalTax = 0.0;
    double tax = 0.0;
    for (TaxableProduct tp : pList){
      tax = tp.computeTax();
      totalTax += tax;
    }
    return totalTax;

  }
}
