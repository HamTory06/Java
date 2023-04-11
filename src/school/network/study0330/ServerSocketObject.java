package school.network.study0330;

import java.io.*;
import java.net.*;

public class ServerSocketObject {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket();
            serverSocket.bind(new InetSocketAddress(InetAddress.getLoopbackAddress(), 20000));
            System.out.println(serverSocket.isBound());
        } catch (IOException ignored){

        }

        try{
//            serverSocket.setSoTimeout(2000);
            Socket socket = serverSocket.accept();
            System.out.println("Client 연결");
            System.out.println("접속 Client 주소: "+
                    socket.getInetAddress() + " : " + socket.getPort());


            //Input
            InputStream inputStream = socket.getInputStream();
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
            DataInputStream dataInputStream = new DataInputStream(bufferedInputStream);

            //Output
            OutputStream outputStream = socket.getOutputStream();
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);
            DataOutputStream dataOutputStream = new DataOutputStream(bufferedOutputStream);

            socket.close();
            serverSocket.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}