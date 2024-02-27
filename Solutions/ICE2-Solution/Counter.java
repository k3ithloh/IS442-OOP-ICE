// this is for Q8
public class Counter {
    private int value;

    public Counter() {
        this.value = 0;
    }

    public Counter(int v) {
        this.value = v;
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int newValue) {
        this.value = newValue;
    }

    void increment() {
        this.value++;
    }

    void decrement() {
        this.value--;
    }

    void reset() {
        this.value = 0;
    }
}



