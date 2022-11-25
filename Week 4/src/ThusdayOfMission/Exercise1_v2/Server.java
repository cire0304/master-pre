package ThusdayOfMission.Exercise1;

import java.net.ServerSocket;
import java.util.Scanner;
import java.net.Socket;
import java.io.*;


public class Server {

    public static void main(String[] args) throws IOException{


        BufferedReader in = null;
        BufferedWriter out = null;

        Scanner scanner = new Scanner(System.in);
        Socket socket = null;
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(50000);
            System.out.println("연결 대기중.....");
            socket = serverSocket.accept();
            System.out.println("연결 되었습니다.");

            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

            while (true) {




                String inputMessage = in.readLine();
                if ("quit".equalsIgnoreCase(inputMessage)) {
                    System.out.println("클라이언트가 나갔습니다.");
                    break;
                }
                System.out.println("클라이언트 : " + inputMessage);

                //=================================
                System.out.print("입력하기 : ");
                String outputMessage = scanner.nextLine();

                if ("quit".equalsIgnoreCase(outputMessage)) {
                    System.out.println("채팅을 종료합니다.");
                    break;
                }
                out.write(outputMessage + "\n"); out.flush();


            }


        } catch (IOException e) {
                e.printStackTrace();
            }
        finally {
            scanner.close();
            out.close();
            in.close();
            socket.close();
            serverSocket.close();
        }




    }




}
