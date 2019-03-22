package Final;
/**
 *
 */


import java.util.Calendar;
import java.util.Date;

public class Tim {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();//创建candlar对象
        int year = c.get(Calendar.YEAR);//获取年
        int month = c.get(Calendar.MONTH)+1;//获取月份，0表示1
        int day = c.get(Calendar.DAY_OF_MONTH);//获取日期
        int hour = c.get(Calendar.HOUR_OF_DAY);//获取小时
        int minute = c.get(Calendar.MINUTE);//获取分钟
        int second = c.get(Calendar.SECOND);//获取秒

        System.out.println("当前时间，" + year + "-" + month + "-" + day + " " + hour + ":" + minute + ":" + second);

        Date d = c.getTime();//将Calendar对象转换为DATE对象
        Long time = c.getTimeInMillis();//获取当前秒数
        System.out.println("当前时间：" + d);
        System.out.println("当前毫秒数：" + time);
    }
}
