package MondayOfMission.mission_added_2;

public class Point {
    private int x, y;
    public Point() { };
    public Point(int x, int y) { this.x = x; this.y = y;};

    public int getX() {return x;}
    public int getY() {return y;}
    protected void move(int x, int y) {this.x = x; this.y = y;}




}
