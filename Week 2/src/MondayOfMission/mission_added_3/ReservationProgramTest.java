package MondayOfMission.mission_added_3;

public class ReservationProgramTest {
    public static void main(String[] args) {
//        ReservationProgram reservationProgram = new ReservationProgram();
//
//        reservationProgram.programStart();

        int num = 5;

        for(int i = 0; i<10; i = i +3){
            num = num + i;
            for(int j = 0;j<3;j=j+1){
                num = num +j;
            }
        }
        System.out.println(num);
    }
}
