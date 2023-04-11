package school.network.study0406;

import school.network.study0330.SocketAddressObject;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.*;

public class Main {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket();
            SocketAddress socketAddress = new InetSocketAddress(InetAddress.getLoopbackAddress(), 20001);
            serverSocket.bind(socketAddress);
            System.out.println("Clinet 접속 대기..");

            Socket socket = serverSocket.accept();
            System.out.println("Clint 연결 수락");
            System.out.println("접속 Client 주소 : " + socket.getInetAddress());

//            BufferedInputStream bufferedInputStream = new BufferedInputStream()
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
