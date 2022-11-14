package FistMission.mission_added_1;

import java.util.Scanner;

public class Admin {

    private WordBoard wordBoard;

    public Admin(){
        wordBoard = new WordBoard();
    }

    private String wordOfLastWord;
    private String answerOfLastWord;

    private Scanner scanner;

    public boolean checkAnswer(){
        wordOfLastWord = getLastCharactorOfWord(takePreWordFromBoard());
        answerOfLastWord = getFisetCharactorOfWord(takeCurrentWordFromBoard());
        if (wordOfLastWord.equals(answerOfLastWord)) return true;
        return false;
    }




    public void getAnswerFromPerson(Person person){
        System.out.print(person.name + " >> ");
        scanner = new Scanner(System.in);
        writeWordToBoard(scanner.next());
    }
    public void replacePreWordAsCurrent(){
        wordBoard.setPreWord(wordBoard.getCurrentWord());
    }
    private void writeWordToBoard(String word){
        wordBoard.setCurrentWord(word);
    }
    private String takePreWordFromBoard(){
        return wordBoard.getPreWord();
    }
    private String takeCurrentWordFromBoard(){
        return wordBoard.getCurrentWord();
    }

    private String getLastCharactorOfWord(String word){
        return word.split("")[word.length() - 1];
    }
    private String getFisetCharactorOfWord(String word){
        return word.split("")[0];
    }


}
