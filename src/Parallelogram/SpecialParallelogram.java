package Parallelogram;

public class SpecialParallelogram {
    public static void main(String[] args) {
        //接口也可以进行向上转型操作
        DrawImage[] images = {new Rectangle(), new Spuare(), new Diamond()};
        //遍历“画图形”接口类型的数组
        for (int i = 0; i < images.length; i++) {
            images[i].draw();
        }
    }
}
