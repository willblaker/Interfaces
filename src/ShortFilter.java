public class ShortFilter implements Filter{
    public boolean accept(Object x){
        return ((String) x).length() < 5;
    }
}
