public class ForeverCounter extends Counter{
  public void increment(){
    setValue(getValue()+1);
  }

  public void decrement(){
    setValue(getValue()-1);
  }
}
