package nonstaticmembersinjava;

public class NonStaticMembers {
    int num;

    NonStaticMembers(){
        this.num = 1;
        System.out.println("Inside the empty constructor");
    }

    NonStaticMembers(int num) {
        this.num = num;
    }

    public static void main(String[] args) {
        System.out.println("Hello world");
        NonStaticMembers nsm = new NonStaticMembers(23);
        new NonStaticMembers();

        System.out.println(nsm.num);
    }

    {
        System.out.println("Non static block");
    }
}
