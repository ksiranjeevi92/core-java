package innerclass;

public class Outer {
    static void f1() {
        System.out.println("Outer static method");
    }
    static class Inner{
        static void f2() {
            System.out.println("Inner static method");
        }

        void f3() {
            System.out.println("Non static method");
        }
    }

    public static void main(String[] args) {
        Outer.f1();
        Outer.Inner.f2();

        Outer.Inner inner = new Outer.Inner();

        inner.f3();
    }
}
