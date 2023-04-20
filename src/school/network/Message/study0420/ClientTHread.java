package school.network.Message.study0420;

import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class ClientTHread extends Thread{
    Socket socket;
    ObjectInputStream inputStream;
    ObjectOutputStream outputStream;

    int id;// 고유 아이디

    String userName;
    ChatMessage charMessage; //메시지 타입
    boolean keepGoing; //Thread 진행 여부
}
