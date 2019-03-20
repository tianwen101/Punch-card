package Final;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TreeTest {
    public static void main(String[] args) {
        //创建List对象。存入tree对象
        List<Tree> list = new ArrayList<>();
        list.add(new Tree(1,"鲁班星空幻想",288));
        list.add(new Tree(2,"孙尚香杀手不太冷",1000));
        list.add(new Tree(3,"孙悟空情人节限定",70));
        list.add(new Tree(4,"小乔天鹅湖之梦",888));
        //调用Collection的sore方法，会自动调用之前写的compareTo方法进行排序
        Collections.sort(list);
        //用foreach循环遍历list
        for (Tree tree:list) {
            System.out.println(tree.getId()  + " " +  tree.getName()  + " "  +  tree.getPrice());

        }
    }
}