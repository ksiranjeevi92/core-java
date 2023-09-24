package flowcontrol;

public class IfElseDemo {
    public static void main(String[] args) {
        int x = 10, y = 20;

        if(x > y) {
            System.out.println("X is greater");
        }else if(y > x){
            System.out.println("Y is greater");
        }
        else{
            System.out.println("both the number are equal");
        }
    }

}
