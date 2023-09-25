package garbagecollection;

public class GCDemo {

    int objID;
    GCDemo(int objID){
        this.objID = objID;
        System.out.println("Created " + this.objID);
    }
    public static void main(String[] args) {
        new GCDemo(23);
        System.gc();
        new GCDemo(33);

    }

    @Override
    protected void finalize() {
        System.out.println("Finilized " + this.objID);
    }
}
