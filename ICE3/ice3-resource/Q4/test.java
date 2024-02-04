public class test {
  public static int doSomething(int x){
    if (x > 0){
      int y = 1;
    } else {
      int y = 2;
    }
    int sum = 0;
    for (int i = 0; i < 3; i++){
      sum += y;
      y++;
    }
    return y;
  }

  public static void main(String[] args){
    System.out.println(doSomething(3));
  }
}