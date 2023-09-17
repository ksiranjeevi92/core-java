package datatypes;

public class CommandLineArguments {
    public static void main(String [] args) throws Exception {
        if(args.length == 0) {
            throw new Exception("Invalid Arguments: Please pass Valid arguments to main()");
        }else {
            int i = Integer.parseInt(args[0]);

            int j = Integer.parseInt(args[1]);

            int multiplication = i * j;

            System.out.println("Result: " + multiplication);
        }
    }
}
