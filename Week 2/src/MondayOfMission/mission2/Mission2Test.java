package MondayOfMission.mission2;

public class Mission2Test {
    public static void main(String[] args) {

        Librarian librarian = new Librarian();
        Library oneLibrary = new Library("oneLibrary");
        Library oneLibraryCopy = oneLibrary;
        Library twoLibrary = new Library("twoLibrary");


        librarian.addBookToLibrary("태백산맥", "조경래", oneLibrary);
        librarian.addBookToLibrary("이기적 유전자", "리처드 도킨즈", oneLibrary);
        librarian.addBookToLibrary("자전거 도둑", "박완서", oneLibrary);
        librarian.addBookToLibrary("토지", "박경리", oneLibrary);
        librarian.addBookToLibrary("대변동", "제레드 다이아몬드", oneLibrary);

        librarian.addBookToLibrary("태백산맥", "조경래", twoLibrary);
        librarian.addBookToLibrary("이기적 유전자", "리처드 도킨즈", twoLibrary);
        librarian.addBookToLibrary("자전거 도둑", "박완서", twoLibrary);
        librarian.addBookToLibrary("토지", "박경리", twoLibrary);
        librarian.addBookToLibrary("대변동", "제레드 다이아몬드", twoLibrary);

        librarian.printBookTitls(oneLibrary);
        librarian.printBookTitls(oneLibraryCopy);
        librarian.printBookTitls(twoLibrary);

        librarian.updateBookIndex(3, "그 많던 싱아는 누가 다 먹었을까", "박완서", oneLibrary);
        librarian.addBookToLibrary("사피엔스", "유발 하라리", twoLibrary);

        System.out.println("========================================================================");

        librarian.printBookTitls(oneLibrary);
        librarian.printBookTitls(oneLibraryCopy);
        librarian.printBookTitls(twoLibrary);







    }
}
