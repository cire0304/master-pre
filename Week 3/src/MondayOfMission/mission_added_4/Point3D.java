package MondayOfMission.mission_added_4;

public class Point3D extends Point {
    private int z;

    public Point3D(int x, int y, int z){
        super(x,y);
        this.z = z;
    }

    public void moveUp(){
        this.z += 1;
    }
    public void moveDown(){
        this.z -= 1;
    }
    public void move(int x, int y, int z){
        super.move(x,y);

        this.z = z;
    }

    public String toString(){

        return "의 색의 (" + getX() + ", " + getY() + ", " + z  + ")의 점" ;
    }
}
