public class BigRectangleFilter implements Filter{
    @Override
    public boolean accept(Object x) {
        int p = (int) x;
        return p > 10;
    }
}
