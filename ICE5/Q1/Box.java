public class Box {
  private int length;
  private int breadth;
  private int height;

  public Box(int length, int breadth, int height){
    this.length = length;
    this.breadth = breadth;
    this.height = height;
  }

  public void setHeight(int height){
  this.height = height;
  }

  @Override
  public Object clone(){
    return new Box(this.length, this.breadth, this.height);
  }

  // same reference as the given object
  @Override
  public boolean equals(Object another){
    if (another == this){
      return true;
    }
  
  // checking if the instance is of the correct type of Box
    if (another instanceof Box){
      // type casting to make the object a Box
      Box b = (Box) another;
      if(length == b.length && breadth == b.breadth && height == b.height){
                return true;
            }
    }
    return false;
  }

    @Override
  public String toString(){
    return String.format("height: %d, breadth: %d, length: %d", height,breadth,length);
  }
}
