package StringHW;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String text = "I like Java!!!";
        TextModifications textModifications = new TextModifications();
        textModifications.setText(text);
        textModifications.lastSymbol();
        textModifications.checkIfEnds();
        //textModifications.PolindromeCheck();
        //textModifications.WordsWithExactLettersAmount();
    }


}
