package ThusdayOfMission.Exercise1;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) throws IOException {


        BufferedReader in = null;
        BufferedWriter out = null;

        Scanner scanner = new Scanner(System.in);
        Socket socket = null;


        try {
            socket = new Socket("127.0.0.1", 50000);
            System.out.println("서버 연결 됨");

            out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            while (true) {


                System.out.print("입력하기 : ");
                String outputMessage = scanner.nextLine();
                if ("quit".equalsIgnoreCase(outputMessage)) {
                    System.out.println("채팅을 종료합니다.");
                    break;
                }
                out.write(outputMessage + "\n"); out.flush();

                //=================================
                String inputMessage = in.readLine();
                if ("quit".equalsIgnoreCase(inputMessage)) {
                    System.out.println("클라이언트가 나갔습니다.");
                    break;
                }
                System.out.println("From Server : " + inputMessage);



            }


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            scanner.close();
            out.close();
            in.close();
            socket.close();
        }




    }
}
