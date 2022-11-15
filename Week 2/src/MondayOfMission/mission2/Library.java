package MondayOfMission.mission2;

import java.util.ArrayList;

public class Library {

    String name;
    ArrayList<Book> OfbookShelf;

    Library(String name){
         OfbookShelf = new ArrayList<>();
         this.name = name;
    }

    public ArrayList<Book> getOfBooks(){
        return OfbookShelf;
    }
    public String getName(){
        return this.name;
    }

    public int getBookNum(){
        return OfbookShelf.size();
    }


}
