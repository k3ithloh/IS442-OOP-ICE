public class CircularCounter extends Counter{
  private int limit;

  CircularCounter(int l){
    limit = l;
  }

  public void increment(){
    int v = getValue() + 1;
    v = v % (limit + 1);
    setValue(v);
  }

    public void decrement(){
    int v = getValue() - 1;
    v = (v+limit+1) % (limit+1);
    setValue(v);
  }
}
