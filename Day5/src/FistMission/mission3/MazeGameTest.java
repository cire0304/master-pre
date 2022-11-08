package FistMission.mission3;

import java.util.Stack;
import java.util.Arrays;

class Node{
    int x, y;

    public Node(int x, int y){
        this.x = x;
        this.y = y;
    }
    int getX(){
        return x;
    }
    int getY(){
        return y;
    }
}

public class MazeGameTest {

    public static void main(String[] args) {

        int[] dx = {1,0,-1,0};
        int[] dy = {0,1,0,-1};
        int[][] map = {
                {0,0,1,1,1,1,1},
                {1,0,0,0,0,0,1},
                {1,1,1,0,1,1,1},
                {1,1,1,0,1,1,1},
                {1,0,0,0,0,0,1},
                {1,0,1,1,1,1,1},
                {1,0,0,0,0,0,0},
                {1,1,1,1,1,1,0}};
        int[][] visited = new int[8][7]; visited[0][0] = 1;


        Stack<Node> stack = new Stack<>();
        stack.push(new Node(0,0));

        Node position;

        int nx = 0;
        int ny = 0;
        int x = 0;
        int y = 0;

        while(!stack.empty()){

            position = stack.pop();
            nx = position.getX();
            ny = position.getY();

            printCurrentPosition(nx,ny);
            if(nx == map[0].length && ny == map.length) {
                System.out.println("목적지에 도착했습니다.");
                // break;
            }

            for(int i = 0;i<4;i++){
                x = nx + dx[i];
                y = ny + dy[i];

                if( 0 <= x && x < map[0].length && 0 <= y && y < map.length ){
                    if(map[y][x] == 0 && visited[y][x] == 0){
                        visited[y][x] = 1;
                        stack.push(new Node(x,y));
                    }
                }
            }
            printStackElement(stack);
            System.out.println("=============================");
        }



    }
    public static void  printStackElement(Stack<Node> stack){
        System.out.print("현재 스택 원소 : ");
        for(Node s : stack){
            System.out.print("(" + s.getX() + ", " + s.getY() + ")");
        }
        System.out.println("");
    }

    public static void printCurrentPosition(int x, int y){
        int[][] map = new int[8][7];
        int[][] map_ = {
                {0,0,1,1,1,1,1},
                {1,0,0,0,0,0,1},
                {1,1,1,0,1,1,1},
                {1,1,1,0,1,1,1},
                {1,0,0,0,0,0,1},
                {1,0,1,1,1,1,1},
                {1,0,0,0,0,0,0},
                {1,1,1,1,1,1,0}};

        for(int i = 0;i<map.length;i++){
            for(int j =0;j<map[0].length;j++){
                if( i == y && j == x){
                    System.out.print("X");
                }
                else {
                    System.out.print("O");
                }
            }
            System.out.print("    ");
            for(int k =0;k<map[0].length;k++){
                System.out.print(map_[i][k]);
            }
            System.out.println("");
        }
        System.out.println("현재 위치      지도" );
        System.out.println("현재 좌표 : (" + x + ", " + y + ")");
    }











}
