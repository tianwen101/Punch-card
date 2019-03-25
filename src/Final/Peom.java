package Final;

import javax.swing.*;
import java.awt.*;

public class Peom extends JFrame {
    public Peom () {
        setTitle("本窗体使用流方式布局");
        Container c = getContentPane();
        setLayout(new GridLayout(5,1,5,5));
        setSize(400,200);
        setResizable(false);
        c.add(new JButton("下面四句诗，哪一句是描写夏天的？"));
        c.add(new JButton("秋风萧瑟天气凉，草木摇荡露为霜"));
        c.add(new JButton("白雪纷纷何所似，撒盐空中差可拟"));
        c.add(new JButton("接天莲叶无穷碧，映日荷花别样红"));
        c.add(new JButton("竹外桃花三两只， 春江水暖鸭先知"));
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Peom();
    }
}
