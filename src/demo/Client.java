package demo;

import java.io.IOException;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        //创建客户端对象指定连接的服务器IP和端口
        Socket socket = new Socket("192.168.43.63",10086);
        System.out.println("已和服务器建立连接，远程主机地址：" + socket.getRemoteSocketAddress());


    }
}