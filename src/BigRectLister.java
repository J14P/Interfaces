import java.util.ArrayList;

public class BigRectLister {
    public static void main(String[] args) {
        ArrayList rectangle = new ArrayList();

        rectangle.add(7);
        rectangle.add(10);
        rectangle.add(15);
        rectangle.add(25);
        rectangle.add(11);
        rectangle.add(5);
        rectangle.add(3);
        rectangle.add(9);
        rectangle.add(14);
        rectangle.add(21);

        System.out.println("Rectangles that have a perimeter bigger than 10");
        collectAll(rectangle);
    }

    public static void collectAll(ArrayList o){
        BigRectangleFilter brf = new BigRectangleFilter();
        for (int i = 0; i < 10; i++)
        {
            if(brf.accept(o.get(i)))
            {
                System.out.println("Rectangle: " + (i+1) + " with a perimeter of: " + o.get(i));
            }
        }
    }
}
