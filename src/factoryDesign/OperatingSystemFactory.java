package factoryDesign;

public class OperatingSystemFactory {

    public OS getInstance(String str){
        if(str.equals("power"))
            return new Android();
        else if (str.equals("secure"))
            return new IOS();
        else
            return new Windows();
    }
}
