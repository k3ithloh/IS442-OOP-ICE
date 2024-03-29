public class CircularCounter extends Counter {
    private int limit;

    public CircularCounter(int limit) {
        super(0);
        this.limit = limit;
    }

    @Override
    public void decrement() {
        if (getValue() == 0) {
            setValue(limit);
        } else {
            setValue(getValue() - 1);
        }
    }

    @Override
    public void increment() {
        if (getValue() == limit) {
            setValue(0);
        } else {
            setValue(getValue() + 1);
        }
    }
}
