package ThursdayOfMission.mission1;

public abstract class PlayerLevel {
    public abstract void run();
    public abstract void jump();
    public abstract void turn();
    public abstract void showLevelMessage();

    public void go(int x){
        showLevelMessage();
        run();
        for(int i = 0; i<x;i++){
            jump();
        }
        turn();
    }
}
