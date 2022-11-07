package FistMission.mission2;
import java.util.*;


public class Librarian {


    private Worker worker;



    Librarian() {
        worker = new Worker();

    }


    public void printBookTitls(Library library){
        worker.printBookTitles(library);
    }

    public void updateBookIndex(int index, String title, String writer, Library library){
        addBookToLibrary(title,writer,library);
        exchangeBookIndex(library,index,library.getBookNum());
        removeBookFromLibrary(library.getBookNum(), title,library);

    }

    public  void exchangeBookIndex(Library library, int index1, int index2){
        worker.exchangeBookIndex(library,index1 - 1,index2 - 1);
    }
    public void addBookToLibrary(String title, String writer, Library library){
        worker.addBookToLibrary(title,writer, library);
    }


    void removeBookFromLibrary(int index ,String title, Library library){
        // int index = searchBookIndex(title,library);

        worker.removeBookFromLibrary(index - 1,library);
    }

    int searchBookIndex(String title, Library library){
        int i = 0;
        for(Book book : library.OfbookShelf){
            if(book.getTitle().equals(title)) return i;
            i++;
        }
        System.out.println(title + " 이름의 제목을 가진 책이 없습니다.");
        return -1;
    }
}



