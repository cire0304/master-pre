package ThusdayOfMission.Exercise1_v3;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.lang.reflect.Field;
public class msg_client {
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

class Receiver extends Thread{
    Socket socket;
    public Receiver(Socket s) {
        socket=s;
    }
    @Override
    public void run() {
        InputStream input;//읽는 stream
        BufferedReader reader;// input 내용을 buffer로 받아옴
        try {
            while(true) {
                String s = null;
                input = socket.getInputStream();
                reader=new BufferedReader(new InputStreamReader(input,"UTF-8")); //읽기
                if((s=reader.readLine())!=null )
                {
                    if (s.equals("/quit")) break;
                    System.out.println(s);
                }
            }
        }catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

class Sender extends Thread{
    Socket socket;
    String name;
    Scanner sc;
    public Sender(Socket s,String n) {
        sc=new Scanner(System.in);
        socket=s;
        name=n;
    }
    @Override
    public void run() {
        try {
            OutputStream out= socket.getOutputStream();
            PrintWriter writer = new PrintWriter(
                    new BufferedWriter(
                            new OutputStreamWriter(out,"UTF-8")
                    )
                    ,true);
            writer.println("/init_name "+name);
            while(true) {
                //쓰기
                //PrintWriter writer=new PrintWriter(out,true); //
                String s=sc.nextLine();
                if (s.equals("/quit")) {
                    writer.println(s);
                    break;
                }
                writer.println(name+": "+s);
                //writer.flush();
            }
        }
        catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}