package interfaces;

public class Honda implements Car{

    @Override
    public void go() {
        System.out.println("Inside Honda go");
    }

    @Override
    public void stop() {
        System.out.println("Inside Honda Stop");
    }
}
