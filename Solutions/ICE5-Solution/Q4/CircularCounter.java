public class CircularCounter extends Counter {
    private int limit;

    public CircularCounter(int limit) {
        super(0);
        this.limit = limit;
    }
    
    public void decrement() {
        int num = getValue();

        if (num == 0) {
            num = limit;
        } else {
            num--;
        }

        setValue(num);
    }

    public void increment() {
        int num = getValue();

        if (num >= limit) {
            num = 0;
        } else {
            num++;
        }

        setValue(num);
    }
}