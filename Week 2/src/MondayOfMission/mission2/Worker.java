package MondayOfMission.mission2;

import java.util.ArrayList;
import java.util.Collections;

public class Worker {
    Book book;
    ArrayList<Book> books;


    void addBookToLibrary(String title, String writer, Library library){
        book = new Book(title,writer);
        library.OfbookShelf.add(book);
    }

    void removeBookFromLibrary(int index, Library library){
        if (index != -1){
            library.OfbookShelf.remove(index);
        }
    }
    public  void exchangeBookIndex(Library library, int index1, int index2){
        Collections.swap(library.OfbookShelf,index1,index2);
    }

    public void printBookTitles(Library library){
        books = library.getOfBooks();

        System.out.print(library.getName() + "의 책 목록은 (");
        for(Book book : books){
            System.out.print( book.getTitle() + ", ");
        }
        System.out.println(") 입니다.");

    }
}


