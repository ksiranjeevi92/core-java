package flowcontrol;

public class LabeledBlock {
    int x = 20;

    public static void main(String[] args) {
        int x = 20;
        li: {
            System.out.println("Enter labeled block");

            if(x == 20){

                break li;
            }
            System.out.println("End of labeled block");
        }
    }

}
