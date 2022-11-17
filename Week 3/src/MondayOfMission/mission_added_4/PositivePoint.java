package MondayOfMission.mission_added_4;

public class PositivePoint extends Point{

    public PositivePoint(){};
    public PositivePoint(int x, int y){
        move(x,y);
    };
    protected void move(int x, int y) {
        if(x >= 0 && y>= 0)
            super.move(x,y);
    }


    public String toString(){

        return "의 색의 (" + getX() + ", " + getY() + ")의 점" ;
    }

}
