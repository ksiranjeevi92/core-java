package stringhandling;


public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();

        System.out.println("Initial capacity " + sb.capacity());

        sb.append("Hello");

        sb.append("You can do anything and everything");

        System.out.println(sb.toString());

        System.out.println("Current capacity " + sb.capacity());
    }
}
