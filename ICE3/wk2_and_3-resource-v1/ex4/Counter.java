public abstract class Counter {
  private int value;

  public Counter(){
    value = 0;
  }

  public Counter(int v){
    value = v;
  }
  public int getValue(){
    return value;
  }
  public void setValue(int v){
    value = v;
  }
  
  public abstract void increment();
  public abstract void decrement();
}
