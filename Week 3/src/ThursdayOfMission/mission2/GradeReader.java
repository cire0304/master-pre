package ThursdayOfMission.mission2;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class GradeReader {

    public Deque<String> fileRead(String file) throws IOException {
        Deque<String> lines = new ArrayDeque<>();

        BufferedReader br = new BufferedReader(new FileReader( new File(file)));
        String line = null;
        while((line = br.readLine()) != null){
            lines.add(line);
        }
        lines.poll();
        br.close();
        return lines;
    }

    public Deque<Deque<String>> getInfos(String file) throws IOException {
        Deque<String> lines = fileRead(file);
        Deque<Deque<String>> infos = new ArrayDeque<>();
        Deque<String> info ;
        String line = null;
        while((line = lines.poll()) != null){
            info = new ArrayDeque<>(Arrays.asList(line.split(" ")));
            infos.add(info);
        }
        return infos;
    }

}
