package ThusdayOfMission.Example;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class EchoServerMain{




    public static void main (String args[]) throws IOException {
//        ThusdayOfMission.Exercise.ServerSocket ss = new ThusdayOfMission.Exercise.ServerSocket(10000);
//        Socket socket = ss.accept();
//        InputStream is = socket.getInputStream();
//        OutputStream os = socket.getOutputStream();



        ServerSocket ss = new ServerSocket (50000);

        System.out.println (50000 + " Port Echo Server Running...");
        while (true) {
            Socket socket = ss.accept();
            System.out.println (new Date().toString() + " : " + socket.toString());
            System.out.println (socket.getLocalPort());
            System.out.println (socket.getPort());
            BufferedReader br;
            BufferedWriter bw;
            br = new BufferedReader(new InputStreamReader(socket.getInputStream()));


            bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));


            String temp = br.readLine();
            System.out.println(temp);
            bw.write(temp + " 1\n"); bw.flush();
            bw.write(temp + " 2\n"); bw.flush();
            bw.write(temp + " 3\n"); bw.flush();
            br.close();
            bw.close();
            socket.close();
        }
    }
}