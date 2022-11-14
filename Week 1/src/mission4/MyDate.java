package mission4;

public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year =year;
    }

    public String isValid(){
        if (day == 1 || day == 3 || day == 5 || day == 7 || day == 8 || day == 10 || day == 12)
        {
            return checkValidOf31Days();
        }
        else if (day == 4 ||day == 6 ||day == 9 ||day == 11){
            return checkValidOf30Days();
        }
        return checkValidOf28Days();
    }

    private String checkValidOf31Days(){
        if (0 <= day && day <= 31){
            showDate();
            return "유효한 날짜 입니다.";
        }
        return "유효하지 않은 날짜입니다.";
    }
    private String checkValidOf30Days(){
        if (0 <= day && day <= 30){
            showDate();
            return "유효한 날짜 입니다.";
        }
        return "유효하지 않은 날짜입니다.";
    }
    private String checkValidOf28Days(){
        if (0 <= day && day <= 28){
            showDate();
            return "유효한 날짜 입니다.";
        }
        showDate();
        return "유효하지 않은 날짜입니다.";
    }

        private void showDate(){
        System.out.print(year + "년" + month + "월" + day + "일은 " );
    }









}
