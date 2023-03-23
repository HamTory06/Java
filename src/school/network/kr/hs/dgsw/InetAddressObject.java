package school.network.kr.hs.dgsw;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressObject {
    public static void main(String[] args) {
        try {
            InetAddress ia1 = InetAddress.getByName("www.google.com");
            byte[] googleIP = new byte[] {(byte)172,(byte)217,(byte)25,(byte)164};
            InetAddress ia2 = InetAddress.getByAddress(googleIP);
            InetAddress ia3 = InetAddress.getByAddress("www.google.com", new byte[] {(byte)172,(byte)217,(byte)161,36});
            System.out.println(ia1);
            System.out.println(ia2);
            System.out.println(ia3);
            System.out.println();
        } catch (IOException e){
            e.printStackTrace();
        }

    }
}
