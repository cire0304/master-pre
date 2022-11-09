package Agorithm.Java;

import java.util.Stack;

class Solution2 {

    boolean isExistDoll(int index,int[][] board){
        for(int height = 0 ;height < board.length; height++){
            if(board[height][index] != 0) return true;
        }
        return false;
    }
    int pullUpDoll(int index, int[][] board){


        for(int height = 0 ;height < board.length; height++){
            if(board[height][index] != 0){

                int dollNum = board[height][index];
                board[height][index] = 0;
                return dollNum;
            }
        }
        return -1;
    }
    void insertDollToStack(int numOfDoll, Stack<Integer> stack){
        stack.add(numOfDoll);
    }

    int tryBoomDoll(Stack<Integer> stack){
        if (stack.size() < 2) return 0;
        int doll1 = stack.pop();
        int doll2 = stack.pop();
        if (doll1 == doll2) return 1;
        stack.add(doll2);
        stack.add(doll1);

        return  0;
    }


    public int solution2(int[][] board, int[] moves) {
        int answer = 0;
        int numOfDoll = 0;
        Stack<Integer> stack = new Stack<>();
        for(int move : moves){
            if(isExistDoll(move - 1,board)){
                numOfDoll = pullUpDoll(move - 1, board);
                insertDollToStack(numOfDoll,stack);
                // System.out.println(stack);
                answer += tryBoomDoll(stack);
            }
        }



        return answer*2;
    }
}