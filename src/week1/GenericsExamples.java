package week1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class GenericsExamples {

    public static void main(String[] args) {
        Collection<String> words = new ArrayList();
        words.add("first");
        words.add("second");
        words.add("third");
        //words.add(4);
        for(Object word : words) {
            System.out.println(word + " is "  +  ((String)word).length()+ " in length.");
           // System.out.println(word + " is a "  + word.getClass());
        }

        //This works
        List<Shape> shapes = new LinkedList<>();
        for(int i=0; i <10; ++i) {
            shapes.add(new Circle(Math.random()));
        }
        System.out.println(totalArea(shapes));

        // This doesn't yet work

        List<Circle> shapes2 = new LinkedList<>();
        for(int i=0; i <10; ++i) {
            shapes2.add(new Circle(Math.random()));
        }
        System.out.println(totalArea(shapes2));


    }

    // in order to get the second example with shapes2 to work, we need to change
    // the totalArea method to include a wildcard ? indicating this is a class
    // that extends Shape
    public static double totalArea(Collection<? extends Shape> shapes) {
    //public static double totalArea(Collection<Shape> shapes) {
        double totalArea = 0;
        for(Shape shape : shapes) {
            if(shape!=null) {
                totalArea += shape.calculateArea();
            }
        }
        return totalArea;
    }
}
