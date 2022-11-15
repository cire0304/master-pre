package MondayOfMission.mission_added_1;

public class ColorPoint extends Point{
    private String color;


    public ColorPoint(int x, int y, String color){
        super(x,y);
        move(x,y);
        this.color = color;
    }

    public void setXY(int x, int y){
        move(x,y);
    }

    public void setColor(String color){
        this.color = color;
    }

    public String toString(){

        return color + "의 색의 (" + getX() + ", " + getY() + ")의 점" ;
    }



}
