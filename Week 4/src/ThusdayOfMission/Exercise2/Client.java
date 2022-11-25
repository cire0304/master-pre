package ThusdayOfMission.Exercise2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.*;
import java.net.Socket;
import java.util.Scanner;

import static jdk.jfr.internal.consumer.EventLog.stop;

public class Client {

    Socket socket;
    BufferedReader in;
    BufferedWriter out;
    Scanner scanner;

    public Client() {
        scanner = new Scanner(System.in);

    }


    void startClient() {

        try {
            socket = new Socket("127.0.0.1", 50000);
            send();
            receive();

        } catch (IOException e) {
            if (!socket.isClosed()) {
                stopClient();
            }
        }

    }

    void stopClient() {
        System.out.println("연결 끊음");
        if (socket != null && !socket.isClosed()) {
            try {
                socket.close();
            } catch (Exception e) {
            }
        }
    }

    void receive() {

        Thread thread = new Thread() {
            @Override
            public void run() {
                while (true) {
                    try {
                        in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

                        if (socket.isClosed()) {
                            throw new IOException();
                        }

                        String inputMessage = in.readLine();
                        System.out.println(inputMessage);

                    } catch (Exception e) {
                        stopClient();
                        break;
                    }
                }


            }
        };

       thread.start();

    }

    void send() {
        Thread thread = new Thread() {
            @Override
            public void run() {

                try {
                    while (true) {
                        out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
                        System.out.print("메세지 출력 : ");
                        String outputMessage = scanner.nextLine();
                        if (socket.isClosed()) {
                            break;
                        }
                        System.out.println("서버에 메세지를 전송합니다.");
                        out.write(outputMessage); out.flush();
                        System.out.println("서버에 메세지를 전송했습니다.");

                    }

                } catch (Exception e) {
                    stopClient();

                }

            }
        };
        thread.start();

    }


}
