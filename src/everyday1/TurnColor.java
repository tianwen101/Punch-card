package everyday1;

import javax.swing.*;

public class TurnColor extends Thread {
    private JLabel bgLabel;

    public void setBgLabel(JLabel bgLabel) {
        this.bgLabel = bgLabel;
    }

    @Override
    public void run() {
        // 线程始终处于被启用状态
        while (true) {
            try {
                Thread.sleep(5000); // 线程休眠5秒
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            bgLabel.setIcon(new ImageIcon(TrafficLights.class.getResource("/img/8.jpg"))); // 黄灯
            try {
                Thread.sleep(2000); // 线程休眠2秒
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            bgLabel.setIcon(new ImageIcon(TrafficLights.class.getResource("/img/9.jpg"))); // 红灯
            try {
                Thread.sleep(8000); // 线程休眠8秒
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            bgLabel.setIcon(new ImageIcon(TrafficLights.class.getResource("/img/10.jpg"))); // 绿灯
        }
    }
}