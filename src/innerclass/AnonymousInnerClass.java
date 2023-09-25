package innerclass;

public class AnonymousInnerClass {
    public static void main(String[] args) {
        Connection con = DriverManagerClass.getConnection();
        con.connect();
    }
}
