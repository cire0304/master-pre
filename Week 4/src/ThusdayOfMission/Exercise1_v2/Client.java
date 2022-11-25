package ThusdayOfMission.Exercise1_v2;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    BufferedReader in = null;
    //BufferedWriter out = null;

    Scanner scanner = new Scanner(System.in);
    Socket socket = null;

    public Client() throws IOException {
        socket = new Socket("127.0.0.1", 2400);
        System.out.println("서버 연결 됨");


        Scanner scanner = new Scanner(System.in);
    }

    public void receive() throws IOException {
        Thread thread = new Thread() {

            @Override
            public void run() {
                while (true) {
                    try {
                        in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                        String message = in.readLine();
                        System.out.println("서버 : " + message);

                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
            }

        };
        thread.start();
    }

    public void send() throws IOException {

        Thread thread = new Thread() {
            @Override
            public void run() {
                while (true) {
                    try {


//                        OutputStream out= socket.getOutputStream();
//                        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(out, "UTF-8"));
//                        System.out.print("메세지 입력 : ");
//                        String message = scanner.nextLine();
//                        writer.write(message);
//                        writer.flush();

                        OutputStream out= socket.getOutputStream();
                        PrintWriter writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(out,"UTF-8")),true);
                        System.out.print("메세지 입력 : ");
                        String message = scanner.nextLine();
                        writer.println(message);


                    } catch (Exception e) {
                    }
                    ;
                }
            }
        };
        thread.start();
    }


    public static void main(String[] args) throws IOException {


        Client client = new Client();
        client.send();
        client.receive();


    }
}
