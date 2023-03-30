package school.network.study0330;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

public class ClientObject {
    public static void main(String[] args) {
        System.out.println("<<< Client >>>");
        Socket socket = null;

        try {
            socket = new Socket(InetAddress.getLoopbackAddress(), 20000);
            System.out.println("Server에 접속");
            System.out.println("접속 Server 주소 : " + socket.getInetAddress()+ " : " +socket.getPort());
            socket.close();
        } catch (IOException ignored){
            System.out.println(ignored);
        }
    }
}
