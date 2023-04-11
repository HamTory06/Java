package school.network.study0406;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class TcpClientObject {
    public static void main(String[] args) throws IOException {
        System.out.println("<<< Client >>>");
        try {
            Socket socket = new Socket(InetAddress.getLoopbackAddress(), 20001);
            System.out.println("Server에 접속");
            System.out.println("접속 Server 주소: " + socket.getInetAddress() + " : " + socket.getPort());

            DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
            DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(socket.getOutputStream()));

            dataOutputStream.writeUTF("안녕하세요");
            dataOutputStream.flush();

            String str = dataInputStream.readUTF();
            System.out.println("server: " + str);

            socket.close();

        } catch (Exception e){


        }
    }
}
