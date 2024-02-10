public class Box{
	private int length;
	private int breadth;
	private int height;

	//Implement Here
	public Box(int length, int breadth, int height){
		this.length = length;
		this.breadth = breadth;
		this.height = height;
	}

	// ! This is wrong equals needs to take in Object as a param
	// public boolean equals(Box b){
	// 	if (this.length==b.length && this.breadth==b.breadth && this.height==b.height){
	// 		return true;
	// 	}
	// 	else{
	// 		return false;
	// 	}
	// }

	public boolean equals(Object o){
		if (o instanceof Box){
			Box b = (Box) o;
			if (this.length==b.length && this.breadth==b.breadth && this.height==b.height){
				return true;
			}
		}
		return false;
	}
}