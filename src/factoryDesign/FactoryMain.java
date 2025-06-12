package factoryDesign;

public class FactoryMain {
    public static void main(String[] args) {

//        Here we are exposing the inner feature to the client (new Android())
//        OS os = new Android();
//        os.specification();

//        Here the inner feature has not been exposed to the client
        OperatingSystemFactory osf = new OperatingSystemFactory();
        OS os = osf.getInstance("dfgd");
        os.specification();

    }
}
