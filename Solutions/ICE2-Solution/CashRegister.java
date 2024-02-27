public class CashRegister {
    int purchase;
    int payment;

    public CashRegister() {}

    int getCents(double amount) {
        return (int)(amount * 100);
    }

    //c
    void registerPurchase(double amount) {
        this.purchase += getCents(amount);
    }

    //d
    void makePayment(int dollars, int cents) {
        this.payment += dollars * 100 + cents;
    }

    //e
    double getPurchaseAmount() {
        return (double) purchase / 100;
    }

    //f
    double giveChange() {
        return ((double) (payment - purchase)) / 100;
    }
}
