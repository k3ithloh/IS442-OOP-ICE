import java.lang.reflect.Array;
import java.util.ArrayList;

public class ShapeUtility {

  public static Octagon getLargestOctagon(ArrayList<Shape> shapeList) {
    Octagon largestOctagon = null;
    double largestArea = 0.0;
    if (shapeList == null || shapeList.size() == 0) {
      return null;
    }
    for (Shape tempShape : shapeList) {
      if (tempShape instanceof Octagon) {
        double tempArea = tempShape.getArea();
        if (tempArea > largestArea) {
          Octagon tempOctagon = (Octagon) tempShape;
          largestOctagon = tempOctagon;
          largestArea = tempArea;
        }
      }
    }
    return largestOctagon;
  }

  public static ArrayList<Shape> getAllNonRectangles(ArrayList<Shape> shapeList) {
    ArrayList<Shape> notRectangleArray = new ArrayList<Shape>();

    if (shapeList == null) {
      return notRectangleArray;
    }

    for (Shape tempShape : shapeList) {
      if (!(tempShape instanceof Rectangle)) {
        notRectangleArray.add(tempShape);
      }
    }
    return notRectangleArray;
  }

  public static ArrayList<Square> getAllSquareWithMinArea(ArrayList<Shape> shapeList,
      int minArea) {
    ArrayList<Square> squareWithMinArea = new ArrayList<Square>();
    if (shapeList == null) {
      return squareWithMinArea;
    }
    for (Shape tempShape : shapeList) {
      if (tempShape instanceof Square) {
        Square tempSquare = (Square) tempShape;
        if (tempSquare.getArea() > minArea) {
          squareWithMinArea.add(tempSquare);
        }
      }
    }
    return squareWithMinArea;
  }

  public static ArrayList<Rectangle> getAllRectangleWithMinLength(ArrayList<Shape> shapeList, int minLength) {
    ArrayList<Rectangle> rectangleWithMinLength = new ArrayList<Rectangle>();
    if (shapeList == null) {
      return rectangleWithMinLength;
    }
    for (Shape tempShape : shapeList) {
      if (tempShape instanceof Rectangle) {
        Rectangle tempRectangle = (Rectangle) tempShape;
        if (tempRectangle.getLength() > minLength) {
          rectangleWithMinLength.add(tempRectangle);
        }
      }
    }
    return rectangleWithMinLength;
  }
}
