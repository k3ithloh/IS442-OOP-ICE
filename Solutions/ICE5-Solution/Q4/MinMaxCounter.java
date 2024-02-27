public class MinMaxCounter extends Counter {
    private int min;
    private int max;
    
    public MinMaxCounter(int min, int max) {
        super(min);
        this.min = min;
        this.max = max;
    }

    public void decrement() {
        int num = getValue();
        if (num > min) {
            setValue(num - 1);
        }
    }

    public void increment() {
        int num = getValue();
        if (num < max) {
            setValue(num + 1);
        }
    }
}