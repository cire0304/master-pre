package Day5.AddedMission1;

public class Rectangle {

    int xOne, yOne;
    int xTwo, yTwo;
    int width, height;


    public Rectangle(int x, int y, int width, int height){
        this.xOne = x;
        this.yOne = y;
        this.width = width;
        this.height = height;

        this.xTwo = this.width + this.xOne;
        this.yTwo = this.height + this.yOne;
    }


    public int square(){
        return width * height;
    }
    public void show(){
        System.out.println("사각형의 넓이는 " + square() + " 입니다.");
    }

    boolean contains(Rectangle r){
        return isContainPoint(r.xOne, r.yOne) && isContainPoint(r.xTwo, r.yTwo);
    }

    boolean isContainPoint(int x, int y){
        return (xOne < x && x < xTwo) && (yOne < y && y < yTwo);
    }

}

