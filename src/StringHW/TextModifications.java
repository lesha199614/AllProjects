package StringHW;

import ProjectCalculator.MyExceptions;

class TextModifications {
    private String text;

    public TextModifications() {
    }

    //  Напишите метод, который принимает в качестве параметра любую строку,
    protected void setText(String text) {
        this.text = text;
        checkIfNull();
    }

    protected String getText() {
        checkIfNull();
        return text;
    }

    //  Распечатать последний символ строки. Используем метод String.charAt()
    protected void lastSymbol() {
        checkIfNull();
        System.out.println(text.charAt(text.length() - 1));
    }

    //  Проверить, заканчивается ли ваша строка подстрокой “!!!”. Используем метод String.endsWith()
    protected void checkIfEnds() {
        checkIfNull();
        System.out.println(text.endsWith("!!!"));
    }

    //  Проверить, начинается ли ваша строка подстрокой “I like”. Используем метод String.startsWith()");
    protected void startsWith() {
        checkIfNull();
        System.out.println(text.startsWith("I like"));
    }

    //  Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().
    protected void containsJava() {
        checkIfNull();
        System.out.println(text.contains("Java"));
    }

    //   Найти позицию подстроки “Java” в строке “I like Java!!!”
    protected void indexOfJava() {
        checkIfNull();
        System.out.println(text.indexOf("Java"));
    }

    //   Заменить все символы “а” на “о”
    protected void replaceAtoO() {
        checkIfNull();
        System.out.println(text.replace("a", "o"));
    }

    //   Преобразуйте строку к верхнему регистру
    protected void upperCase() {
        checkIfNull();
        System.out.println(text.toUpperCase());
    }

    //   Преобразуйте строку к нижнему регистру
    protected void lowerCase() {
        checkIfNull();
        System.out.println(text.toLowerCase());
    }

    //     Вырезать строку Java c помощью метода String.substring()
    protected void subString(int firstIndex, int secondIndex) {
        checkIfNull();
        System.out.println(text.substring(firstIndex, secondIndex));
    }

    //  Написать метод, который находит и выводит все слова палиндромы в тексте
    protected void polindromeCheck() {
        checkIfNull();
        String textWithoutMarks = removeMarks(text);
        int counter = countWords(textWithoutMarks);
        for (int i = 0; i <= counter; i++) {
            System.out.print(textWithoutMarks.split(" ")[i] + " ");
            boolean Polindrome = true;
            for (int j = 0, n = textWithoutMarks.split(" ")[i].length(); j < n; j++, n--) {
                if (!textWithoutMarks.split(" ")[i].substring(j, j + 1).equals(textWithoutMarks.split(" ")[i].substring(n - 1, n))) {
                    Polindrome = false;
                    break;
                }
            }
            if (Polindrome) {
                System.out.print(" - Полиндром");
            } else {
                System.out.print(" - Не полидром");
            }
            System.out.println();
        }
    }

    //    метод, который находит и выводит все слова, длина которых от 3 до 5 включительно
    protected void wordsWithExactLettersAmount() {
        checkIfNull();
        String textWithoutMarks = removeMarks(text);
        int counter = countWords(textWithoutMarks);
        for (int i = 0; i <= counter; i++) {
            if (textWithoutMarks.split(" ")[i].length() >= 3 && textWithoutMarks.split(" ")[i].length() <= 5)
                System.out.println(textWithoutMarks.split(" ")[i]);
        }
    }

    //   Написать метод, который возвращает самое маленькое слово в тексте.
    protected void wordWithSmallestLettersAmount() {
        checkIfNull();
        String textWithoutMarks = removeMarks(text);
        int counter = countWords(textWithoutMarks);
        int index = 0;
        for (int i = 1; i <= counter; i++) {
            if (textWithoutMarks.split(" ")[i].length() < textWithoutMarks.split(" ")[i - 1].length()) {
                index = i;
            }
        }
        System.out.println(textWithoutMarks.split(" ")[index]);
    }

    //   Написать метод, который возвращает самое большое слово в тексте.
    protected void wordWithBiggestLettersAmount() {
        checkIfNull();
        String textWithoutMarks = removeMarks(text);
        int counter = countWords(textWithoutMarks);
        int index = 0;
        for (int i = 1; i <= counter; i++) {
            if (textWithoutMarks.split(" ")[i].length() > textWithoutMarks.split(" ")[i - 1].length()) {
                index = i;
            }
        }
        System.out.println(textWithoutMarks.split(" ")[index]);
    }

    //    Ввести 2 слова, состоящие из четного числа букв.
    protected void twoWordsWithEvenLetters() {
        checkIfNull();
        String textWithoutMarks = removeMarks(text);
        int counter = countWords(textWithoutMarks);
        int amount = 0;
        for (int i = 0; i <= counter && amount < 2; i++) {
            if (textWithoutMarks.split(" ")[i].length() % 2 == 0) {
                System.out.println(textWithoutMarks.split(" ")[i]);
                amount++;
            }
        }
    }

    //    Получить слово состоящее из первой половины первого слова и второй половины второго слова.
    protected void halfFirstWordAndHalfSecondWord() {
        checkIfNull();
        String textWithoutMarks = removeMarks(text);
        int counter = countWords(textWithoutMarks);
        for (int i = 0; i <= counter && i < 2; i++) {
            int length = textWithoutMarks.split(" ")[i].length() / 2;
            System.out.print(textWithoutMarks.split(" ")[i].substring(0, textWithoutMarks.split(" ")[i].length() / 2));
        }
        System.out.println();
    }

    private int countWords(String textForCountWords) {
        int counter = 0;
        for (int i = 0; i < textForCountWords.length() - 1; i++) {
            if (textForCountWords.charAt(i) == ' ') {
                counter++;
            }
        }
        return counter;
    }

    private String removeMarks(String initialText) {
        return initialText.replace("!", "").
                replace(".", "").replace(",", "").
                replace(":", "").replace("(", "").
                replace(")", "").trim();
    }


    private void checkIfNull() {
        if (text == null || text.equals("")) {
            try {
                throw new MyExceptions();
            } catch (MyExceptions e){
                e.nullString();
            }
        }
    }
}
