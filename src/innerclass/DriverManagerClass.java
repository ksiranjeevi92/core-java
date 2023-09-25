package innerclass;

public class DriverManagerClass {
    static Connection getConnection(){
        Connection con = new Connection(){

            @Override
            public void connect() {
                System.out.println("Anonymous inner class method");
            }
        };
        return con;
    }
}
