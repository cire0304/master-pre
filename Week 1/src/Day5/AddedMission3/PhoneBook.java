package Day5.AddedMission3;
import java.lang.reflect.Array;
import java.util.*;

public class PhoneBook {

    HashMap<String,String> phoneBook = new HashMap<>();
    Phone phone;

    public void findPhoneNumberMode(){
        Scanner scanner;
        String name = "null";
        String phoneNumber;

        while(true){
            System.out.print("검색할 이름 >> ");
            scanner = new Scanner(System.in);
            name = scanner.next();
            if(name.equals("그만")) break;
            findPhoneNumber(name);
        }

    }
    public void findPhoneNumber(String name) {
        for(Map.Entry<String, String> entry : phoneBook.entrySet()){
            if(entry.getValue().equals((name))){
                System.out.println(name + "의 번호는 " + entry.getKey() + "입니다.");
                return;
            }
        }
        System.out.println(name + "을 검색할 수 없습니다.");
    }

    public void insertPhoneInfos(){
        System.out.print("인원수 >> ");
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();


        for(int i = 0; i < count; i++){
            System.out.print("이름과 전화번호( 이름과 전화번호는 빈 칸 없이 입력 >> ");
            scanner = new Scanner(System.in);
            insertPhoneInfo(scanner.nextLine());
        }
        System.out.println("저장되었습니다...");
    }

    public void insertPhoneInfo(String phoneInfo){
        phoneBook.put(extractPhoneNumber(phoneInfo), extractName(phoneInfo));
    }


    public String extractName(String phoneInfo){
        return phoneInfo.split(" ")[0];
    }
    public String extractPhoneNumber(String phoneInfo){
        return phoneInfo.split(" ")[1];
    }
}
