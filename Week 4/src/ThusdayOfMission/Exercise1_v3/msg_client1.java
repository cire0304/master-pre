package ThusdayOfMission.Exercise1_v3;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class msg_client1 {
    public static void main(String[] args) {
        try {
            Socket socket=new Socket("127.0.0.1",2400);
            System.out.println("서버 접속 성공");
            Scanner sc=new Scanner(System.in);
            System.out.println("이름을 설정해주세요.");
            Sender sThread=new Sender(socket,sc.nextLine());
            Receiver rThread=new Receiver(socket);
            sThread.start();
            rThread.start();
            sThread.join();
            rThread.join();
            socket.close();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            System.out.println("서버 접속 실패");
        }

    }
}
