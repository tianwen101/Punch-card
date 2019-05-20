package demo2;

public class SingletonTest {
    public static void main(String[] args) {


        Singleton object = Singleton.getInstance();
        object.showMessage();
    }
}
