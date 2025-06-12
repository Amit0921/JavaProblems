package singletonDesign;

public class MySingleton {

    private static MySingleton instance; // Private static variable to hold the single instance
    private int data; // Sample data member

    private MySingleton() { }// Private constructor to prevent external instantiation

    public static synchronized MySingleton getInstance() {
        if (instance == null) {
            synchronized (MySingleton.class) { // Double-checked locking for thread safety
                if (instance == null) {
                    instance = new MySingleton(); // Create the instance only once
                }
            }
        }
        return instance;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

}
