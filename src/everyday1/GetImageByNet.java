package everyday1;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;


public class GetImageByNet {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://b-ssl.duitang.com/uploads/item/201806/21/20180621141043_ahuig.thumb.700_0.jpg");
        HttpURLConnection coon = (HttpURLConnection) url.openConnection();
        coon.setRequestMethod("GET");
        coon.setConnectTimeout(5*1000);
        InputStream inputStream = coon.getInputStream();
        ByteArrayOutputStream out1 = new ByteArrayOutputStream();
        byte[] buffer = new byte[1024];
        int len = 0;
        while ((len = inputStream.read(buffer)) != -1) {
            out1.write(buffer, 0,len);
        }
        inputStream.close();
        byte[] date = out1.toByteArray();
        File imageFile = new File("G:/1.jpg");
        OutputStream out2 = new FileOutputStream(imageFile);
        out2.write(date);
        out2.close();
    }
}