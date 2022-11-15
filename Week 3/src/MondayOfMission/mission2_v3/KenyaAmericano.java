package MondayOfMission.mission2_v2;



public class KenyaAmericano implements Coffee {

    public String ingredients;

    public String temp;
    public KenyaAmericano(){
        ingredients = getname();


    }

    public String getname(){
        return "KenyaAmericano";
    }



    public void brewing(){
        System.out.println(ingredients);
    }
}
