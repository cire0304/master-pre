package ThusdayOfMission;

import java.io.*;
import java.net.Socket;

public class EchoClientMain{

    public static void main (String args[]) throws IOException{
        Socket socket = new Socket("127.0.0.1", 50000);
        BufferedWriter bw;
        BufferedReader br;
        bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        bw.write("Hello, CodeSquad" + "\n");
        bw.flush();
        System.out.println(br.readLine());
        System.out.println(br.readLine());
        System.out.println(br.readLine());
        br.close();
        bw.close();
        socket.close();
    }
}