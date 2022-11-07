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
                {1,0,1,1,1},
                {1,0,1,0,1},
                {1,0,1,1,1},
                {1,1,1,0,1},
                {0,0,0,0,1}};
        int[][] visited = new int[5][5];


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

            for(int i = 0;i<4;i++){
                x = nx + dx[i];
                y = ny + dy[i];

                if( 0 <= x && x < 5 && 0 <= y && y < 5 ){
                    if(map[y][x] == 1 && visited[y][x] == 0){
                        visited[y][x] = 1;
                        stack.push(new Node(x,y));
                        for(Node s : stack){
                            System.out.println(s.getX() + " ," + s.getY());
                        }

                        printCurrentPosition(x,y);
                    }
                }
            }


        }



    }
    public static void printCurrentPosition(int x, int y){
        int[][] map = new int[5][5];
        int[][] map_ = {
                {1,0,1,1,1},
                {1,0,1,0,1},
                {1,0,1,1,1},
                {1,1,1,0,1},
                {0,0,0,0,1}};

        for(int i = 0;i<5;i++){
            for(int j =0;j<5;j++){
                if( i == y && j == x){
                    System.out.print("X");
                }
                else {
                    System.out.print("O");
                }
            }
            System.out.print("    ");
            for(int k =0;k<5;k++){
                System.out.print(map_[i][k]);
            }
            System.out.println("");
        }
        System.out.println("=============================");

    }











}
