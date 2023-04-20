package school.network.Message.study0420;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Server {
    public Server(int port) {
        this.port = port;
        this.simpleDateFormat = new SimpleDateFormat("HH:mm:ss"); // 시/분/초
        this.clientThreads = new ArrayList<>();
    }

    public void start() {
        // 서버 시작( ServerSocket 생성 및 accept() )
        isRunning = true;
        try {
            ServerSocket serverSocket = new ServerSocket(port);
            display("[서버 시작]");
            while (isRunning) {
                Socket socket = serverSocket.accept(); // 클라이언트 요청 수락
                if (!isRunning) break;
//                 ClientThread clientThread = new ClientThread(socket);
//                 clientThreads.add(clientThread);
//                 clientThread.start(); // 스레드 시작
            } // while
        } catch (IOException e) {
            display("서버 예외 발생 " + e);
        }
        System.out.println("[서버 종료]");
    }

    public void stop() {
        // 서버 종료
    }

    private void display(String message) {
        // HH:mm:ss 포맷 형식으로 message 콘솔에 출력
        String time = simpleDateFormat.format(new Date()) + " " + message; // HH:mm:ss message
        System.out.println(time);
    }

    private synchronized boolean broadcast(String message) {
        // Server에 연결된 모든 Client에게 message 전달
        return true;
    }

    private synchronized void remove(int id){
        // id에 해당하는 클라이언트 연결 종료
    }


    public static int uniqueId; //번호

    private ArrayList<ClientThread> clientThreads;

    private SimpleDateFormat simpleDateFormat;

    private int port; //서버 포트

    private boolean isRunning;

    private String notif = " *** ";
}
