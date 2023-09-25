package multithreading;

public class MultiThreaded extends Thread{
    public static void main(String[] args) {
        MultiThreaded mt = new MultiThreaded();

        mt.start();

        for (int j =0;j<=200; j++){
            System.out.print("j:"  + j + "\t");
            
        }
    }

    public void run() {
        for (int i =0;i<=200; i++){
            System.out.print("i:"  + i + "\t");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
