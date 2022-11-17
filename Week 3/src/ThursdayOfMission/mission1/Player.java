package ThursdayOfMission.mission1;

public class Player {


    private PlayerLevel level;

    public Player(){
        level = new BeginnerLevel();
    }

    public PlayerLevel getLevel(){
        return level;
    }

    public void upgradeLevel(PlayerLevel playerLevel){
        this.level = playerLevel;
    }

    public void play(int x){
        level.go(x);
    }

}
