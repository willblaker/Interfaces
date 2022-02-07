import java.awt.*;

public class BigRectangleFilter implements Filter{
    public boolean accept(Object x){
        return ((((Rectangle) x).width) + (((Rectangle) x).height)) > 10;
    }
}
