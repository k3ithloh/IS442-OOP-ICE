// import java.awt.Shape;
import java.util.*;

public class ShapeUtility {
    public static Octagon getLargestOctagon(ArrayList<Shape> shapeList) {
        if (shapeList == null || shapeList.isEmpty()) {
            return null;
        }

        Shape largest = null;
        for (Shape shape : shapeList) {
            if (shape instanceof Octagon) {
                if (largest == null || shape.getArea() > largest.getArea()) {
                    largest = shape;
                }
            }
        }

        return (Octagon)largest;
    }

    public static ArrayList<Shape> getAllNonRectangles(ArrayList<Shape> shapelist) {
        ArrayList<Shape> ans = new ArrayList<>();
        
        if (shapelist == null) {
            return ans;
        }

        for (Shape shapes : shapelist) {
            if (!(shapes instanceof Rectangle)) {
                ans.add(shapes);
            }
        }

        return ans;
    }

    public static ArrayList<Square> getAllSquareWithMinArea(ArrayList<Shape> shapeList, int minArea) {     
        ArrayList<Square> result = new ArrayList<>();

        if (shapeList == null || shapeList.isEmpty()) {
            return result;
        }        
        
        for (Shape shape : shapeList) {
            if (shape instanceof Square && shape.getArea() >= minArea) {    
                result.add((Square)shape);                
            }
        }

        return result;
    }

    public static ArrayList<Shape> getAllRectangleWithMinLength(ArrayList<Shape> shapeList, int length) {        
        ArrayList<Shape> result = new ArrayList<>();

        if (shapeList == null) {
            return result;
        }
        
        for (Shape shape : shapeList) {
            if (shape instanceof Rectangle) {
                Rectangle rectangle = (Rectangle) shape;
                if (rectangle.getLength() >= length) {
                    result.add(rectangle);
                }
            }
        }

        return result;
    }
}