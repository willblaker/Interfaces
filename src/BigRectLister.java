import java.awt.*;
import java.util.ArrayList;

public class BigRectLister {
    public static void main(String[] args){
        ArrayList<Rectangle> rect = new ArrayList<Rectangle>();
        rect.add(new Rectangle(5,5));
        rect.add(new Rectangle(7,5));
        rect.add(new Rectangle(5,3));
        rect.add(new Rectangle(4,5));
        rect.add(new Rectangle(6,5));
        rect.add(new Rectangle(8,9));
        rect.add(new Rectangle(10,5));
        rect.add(new Rectangle(5,6));
        rect.add(new Rectangle(7,7));
        rect.add(new Rectangle(8,6));

        BigRectangleFilter filter = new BigRectangleFilter();
        collectAll(rect, filter);
    }

    public static void collectAll(ArrayList<Rectangle> r, BigRectangleFilter f){
        for(int i = 0; i < r.size(); i++){
            if(f.accept(r.get(i))){
                System.out.println("Rectangle " + i + ": ");
                System.out.println(f.accept(r.get(i)));
            }
        }
    }
}
