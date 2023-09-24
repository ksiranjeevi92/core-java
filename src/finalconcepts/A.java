package finalconcepts;

public final class A {
    final float pi = 3.14f;

    final static double pi2 = Math.PI;

    public static void main(String[] args) {
        final A a1 = new A();

        System.out.println(A.pi2);
        //xa1.pi = 3.25f
       // a1 = new A();
    }

}
