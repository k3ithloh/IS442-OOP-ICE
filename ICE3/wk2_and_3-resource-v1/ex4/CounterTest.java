public class CounterTest{
	public static void main(String[] args) {
		ForeverCounter foreverCounter = new ForeverCounter();
		CircularCounter circularCounter = new CircularCounter(5);
		System.out.println ("Forever: " + foreverCounter.getValue() + ", Circular: " + circularCounter.getValue());
		System.out.println("Incrementing ...");
		for (int i=0;i<10;i++) {
			foreverCounter.increment();
			circularCounter.increment();
			System.out.println ("Forever: " + foreverCounter.getValue() + ", Circular: " + circularCounter.getValue());
		}
		System.out.println("Decrementing ...");
		for (int i=0;i<10;i++) {
			foreverCounter.decrement();
			circularCounter.decrement();
			System.out.println ("Forever: " + foreverCounter.getValue() + ", Circular: " + circularCounter.getValue());
		}
	}
}