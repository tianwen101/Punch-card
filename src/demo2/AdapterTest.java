package demo2;

public class AdapterTest {
    public static void main(String[] args) {
        System.out.println("特长生招募中");
        Student student1 = new Student() {
            @Override
            public void javaStudy() {
                System.out.println("我是一名java大神");
            }
        };
        student1.javaStudy();
        Student student2 = new Student() {

            @Override
            public void mathStudy() {
                System.out.println("我是一名数学大神");
            }

            @Override
            public void playBasketball() {
                System.out.println("我是篮球大神");
            }
        };
        student2.mathStudy();
        student2.playBasketball();

    }
}
