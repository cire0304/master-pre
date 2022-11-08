package FistMission.mission_added_2;


public class Day {
    private String work; //하루의 할 일을 나타내는 문자열

    public void saveTodayWork(String work) {
        this.work = work;
    }

    public String getTodayWork() {
        return work;
    }

    public String hasWork() {
        if (work == null) {
            return "없습니다.";
        } else {
            return work + "입니다.";
        }
    }
}