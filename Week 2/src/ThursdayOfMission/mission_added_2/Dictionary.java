package ThursdayOfMission.mission_added_2;

public class Dictionary {
    private static String[] kor = {"사랑", "아기", "돈", "미래", "희망"};
    private static String[] eng = {"love","baby","money","future","hope"};

    public static String kor2Eng(String word){
        System.out.println("한영 단어 검색 프로그램입니다.");
        for(int i=0;i<kor.length;i++){
            if(kor[i].equals(word)) {
                System.out.printf("%s는 %s",word, eng[i]);
                return eng[i];
            }
        }
        System.out.println("찾는 단어가 없습니다.");
        return null;
    }


}
