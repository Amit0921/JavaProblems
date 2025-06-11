public class Main {
    public static void main(String[] args) {

//        MySingleton m1 = MySingleton.getInstance();
//        MySingleton m2 = MySingleton.getInstance();
//        MySingleton m3 = MySingleton.getInstance();
        MySingleton m1 = new MySingleton();
        MySingleton m2 = new MySingleton();
        MySingleton m3 = new MySingleton();
        m1.setData(1);

        System.out.println(m1.hashCode());
        System.out.println(m2.hashCode());
        System.out.println(m3.hashCode());
        System.out.println(m1.getData());
        System.out.println(m2.getData());
        System.out.println(m3.getData());


    }
}
