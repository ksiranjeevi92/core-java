package innerclass;

public class AnonymousRunnableClass {
    public static void main(String[] args) {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.print("Anonymous runnable");
            }
        });
        t.start();
    }
}
