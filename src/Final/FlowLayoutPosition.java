package Final;

import javax.swing.*;
import java.awt.*;

/**
 * tianwen101
 * 2019.3.25
 */
public class FlowLayoutPosition extends JFrame {
    public FlowLayoutPosition () {
        setTitle("下面四句诗，哪一句是描写夏天的？");
        Container c = getContentPane();
        setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 10));
        for (int i = 0; i < 4; i++){
            c.add(new JButton("button" + i));

        }
        setSize(300,200);
        //设置窗体关闭方式
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setVisible(true);
    }


    public static void main(String[] args) {
        new FlowLayoutPosition();
    }
}
