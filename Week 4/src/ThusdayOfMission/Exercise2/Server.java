package ThusdayOfMission.Exercise2;

import com.sun.source.tree.Scope;


import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Server {

    ServerSocket serverSocket;
    List<Client> connections = new Vector<Client>();

    void startServer() {


        try {
            serverSocket = new ServerSocket(50000);
            System.out.println("서버가 생성되었습니다.");
        } catch (Exception e) {
            if (!serverSocket.isClosed()) {
                System.out.println("서버 연결에 에러가 발생했습니다. 프로그램을 종료합니다.");
                stopServer();
                return;
            }
        }

        // Thread thread = new Thread() {
        //@Override
        // public void run() {

        while (true) {
            try {
                Socket socket = serverSocket.accept();
                String message = "[연결 수락 + " + socket.getRemoteSocketAddress() + ":" + Thread.currentThread().getName() + "] \n";
                System.out.println(message);

                Client client = new Client(socket);
                connections.add(client);
                System.out.printf("현재 연결 클라이언트는 %d명 입니다. \n", connections.size());


            } catch (IOException ex) {
                if (!serverSocket.isClosed()) {
                    stopServer();
                    System.out.println("연결 수락에 에러가 발생했습니다. 프로그램을 종료합니다.");
                }
                break;

            }

        }
    }
    // };

    //thread.start();

    //}

    void stopServer() {
        try {
            for (Client client : connections) {
                client.socket.close();
                connections.remove(client);
            }
            if (serverSocket != null && !serverSocket.isClosed()) {
                serverSocket.close();
            }

        } catch (Exception e) {
        }
        ;

    }

    class Client {

        BufferedWriter out = null;
        BufferedReader in = null;
        Socket socket;

        public Client(Socket socket) {
            this.socket = socket;
            try {
                in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            } catch (Exception e) {
            }
            ;
            receive();

        }

        void receive() {

            Thread thread = new Thread() {

                @Override
                public void run() {
                    try {

                        while (true) {
                            System.out.println("입력 스트림을 생성하였습니다.");
                            if (socket.isClosed()) {
                                throw new IOException();
                            }
                            System.out.println("입력 대기 중입니다.");
                            String inputMessage = in.readLine();
                            System.out.println("입력을 받았습니다.");
                            for (Client client : connections) {
                                client.send(inputMessage);
                            }
                            System.out.println("모든 클라이언트에게 메세지를 전달하였습니다.");
                        }

                    } catch (Exception e) {
                        try {
                            connections.remove(Client.this);
                            System.out.println("[클라이언트 통신 안됨: " + socket.getRemoteSocketAddress() + ":" + Thread.currentThread().getName() + "]");
                            socket.close();
                        } catch (IOException e1) {
                        }
                        ;
                    }
                }

            };
            thread.start();

        }

        void send(String data) {

            Thread thread = new Thread() {
                @Override
                public void run() {
                    try {
                        System.out.println("메세지를 전송합니다.");
                        out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
                        out.write(data);
                        out.flush();


                    } catch (Exception e) {
                        try {
                            System.out.println("[클라이언트 통신 안됨: " + socket.getRemoteSocketAddress() + ":" + Thread.currentThread().getName() + "]");
                            connections.remove(Client.this);
                            socket.close();
                        } catch (Exception e1) {
                        }
                        ;
                    }
                }
            };

            thread.start();

        }
    }


}
