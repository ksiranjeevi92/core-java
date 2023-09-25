package innerclass;

public class NonStaticInnerClass {

    private static int x = 50;

    private  int y;

    NonStaticInnerClass(int y){
        this.y = y;
    }

    void f1(){
        System.out.println("Non static outter class");
    }
    class Inner{
        void f2() {
            System.out.println(NonStaticInnerClass.x);
            System.out.println(NonStaticInnerClass.this.y);
            System.out.println("Inner class non static");
        }

        // we can not define static method in non static inner class
    }

    public static void main(String[] args) {
        NonStaticInnerClass outer = new NonStaticInnerClass(45);

        outer.f1();

        NonStaticInnerClass.Inner inner = outer.new Inner();

        inner.f2();


    }
}
