package ThusdayOfMission.Exercise1_v2;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;


public class Server {

    BufferedReader in = null;
    BufferedWriter out = null;

    Scanner scanner = new Scanner(System.in);
    Socket socket = null;
    ServerSocket serverSocket = null;

    public Server() {
        Scanner scanner = new Scanner(System.in);
    }

    public void serverStart() {
        try {
            serverSocket = new ServerSocket(2400);
            System.out.println("서버가 연결되었습니다.");
            socket = serverSocket.accept();
            System.out.println("클라이언트가 입장했습니다.");
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        } catch (Exception e) {};

        recieve();
        send();

    }

    public void recieve() {
        Thread thread = new Thread() {

            @Override
            public void run() {
                while(true) {
                    try {
                        String message = in.readLine();
                        System.out.println("클라이언트 : " + message);

                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
            }

        };
        thread.start();
    }

    public void send() {

        Thread thread = new Thread() {
            @Override
            public void run() {
                while(true) {
                    try {

                        OutputStream out= socket.getOutputStream();
                        PrintWriter writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(out,"UTF-8")),true);
                        System.out.print("메세지 입력 : ");
                        String message = scanner.nextLine();
                        writer.println(message);

//                        OutputStream out= socket.getOutputStream();
//                        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(out, "UTF-8"));
//                        System.out.print("메세지 입력 : ");
//                        String message = scanner.nextLine();
//                        writer.write(message);
//                        writer.flush();




                    } catch (Exception e) {};
                }
            }
        };
        thread.start();
    }


    public static void main(String[] args) throws IOException{


        Server server = new Server();
        server.serverStart();




    }




}
