package MondayOfMission.mission_added_3;

public class ColorPoint extends Point {
    private String color;

    public ColorPoint(){
        super();
    }

    public ColorPoint(int x, int y){
    super(x,y);
    }

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
