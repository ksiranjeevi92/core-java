package java8.labdas;

public class RunnableLambdaExample {
    public static void main(String[] args) {

        Runnable runnable = new Runnable(

        ) {
            @Override
            public void run() {
                System.out.println("Inside the runnable: 1");
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();

       Runnable lambdaRunnable = () -> {
           System.out.println("Inside Runnable: 2");
           System.out.println("Inside Runnable: 3");
       };

        new Thread(lambdaRunnable).start();

        new Thread(() -> System.out.println("Inside Runnable:4")).start();
    }
}
