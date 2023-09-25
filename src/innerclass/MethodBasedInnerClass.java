package innerclass;

public class MethodBasedInnerClass {
    public void f1(){
        class Inner {
            public void f2(){
                System.out.println("inner class");

            }
        }
        Inner in = new Inner();

        in.f2();
    }

    public static void main(String[] args) {
        MethodBasedInnerClass mbi = new MethodBasedInnerClass();
        mbi.f1();
    }
}
