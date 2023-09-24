package finalconcepts;

public class MyCircle implements CalculateArea{
    int r = 25;
    @Override
    public void calculateArea() {
        System.out.println(this.pi * (r ^ 2));
    }
}
