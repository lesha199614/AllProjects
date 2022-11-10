package StringHW;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String text = "I like Java!!!";
        TextModifications textModifications = new TextModifications();
        textModifications.setText(text);
        System.out.println(textModifications.getText());
        textModifications.lastSymbol();
        textModifications.checkIfEnds();
        textModifications.startsWith();
        textModifications.containsJava();
        textModifications.indexOfJava();
        textModifications.replaceAtoO();
        textModifications.upperCase();
        textModifications.lowerCase();
        textModifications.subString(7,11);
        textModifications.polindromeCheck();
        textModifications.wordsWithExactLettersAmount();
        textModifications.wordWithSmallestLettersAmount();
        textModifications.wordWithBiggestLettersAmount();
        textModifications.twoWordsWithEvenLetters();
        textModifications.setText("Aliaksei likes Java!!!");
        textModifications.halfFirstWordAndHalfSecondWord();

//        Используя StringBuilder сделайте выражения
//        3 + 56 = 59
//        3 – 56 = -53
//        3 * 56 = 168.
        StringBuilder expression= new StringBuilder();
        expression.append(3).append("+").append(56).append("=").append(59);
        System.out.println(expression);
        expression.replace(1,2,"-").replace(5,7,"-53");
        System.out.println(expression);
        expression.replace(1,2,"*").replace(5,8,"168");
        System.out.println(expression);



    }


}
