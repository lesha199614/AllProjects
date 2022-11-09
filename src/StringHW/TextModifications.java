package StringHW;

public class TextModifications {
    String text;

    public TextModifications() {
    }

    //Напишите метод, который принимает в качестве параметра любую строку,
    public void setText(String text) {
        this.text = text;
    }

    //        Распечатать последний символ строки. Используем метод String.charAt()
    public void lastSymbol() {
        System.out.println(text.charAt(text.length() - 1));
    }

    //        Проверить, заканчивается ли ваша строка подстрокой “!!!”. Используем метод String.endsWith()
    public void checkIfEnds() {
        System.out.println(text.endsWith("!!!"));
    }


//        System.out.println("Проверить, начинается ли ваша строка подстрокой “I like”. Используем метод String.startsWith()");
//        System.out.println(text.startsWith("I like"));
//        System.out.println("Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains(). ");
//        System.out.println(text.contains("Java"));
//        System.out.println("Найти позицию подстроки “Java” в строке “I like Java!!!”");
//        System.out.println(text.indexOf("Java"));
//        System.out.println("Заменить все символы “а” на “о”.");
//        System.out.println(text.replace("a", "o"));
//        System.out.println("Преобразуйте строку к верхнему регистру. ");
//        System.out.println(text.toUpperCase());
//        System.out.println("Преобразуйте строку к нижнему регистру. ");
//        System.out.println(text.toLowerCase());
//        System.out.println("Вырезать строку Java c помощью метода String.substring()");
//        System.out.println(text.substring(7, 11));
//        System.out.println("Написать метод, который находит и выводит все слова палиндромы в тексте " + text);


    protected void PolindromeCheck() {
        // получился слишком замудренный, но работает с любым текстом
        //отсекаю все ! знаки (в идеале нужно было бы все знаки препинания), но для тестового задания не услажнял
        String textWithoutMarks = text.replace("!", "");
        //считаю количество слов
        int counter = 0;
        for (int i = 0; i < textWithoutMarks.length() - 1; i++) {
            if (textWithoutMarks.substring(i, i + 1).equals(" ")) {
                counter++;
            }
        }
        //проверяю каждое отдельное слово на то, является ли оно полиндромом
        for (int i = 0; i <= counter; i++) {
            System.out.print(textWithoutMarks.split(" ")[i] + " ");
            int notPolindrome = 0;
            for (int j = 0, n = textWithoutMarks.split(" ")[i].length(); j < n; j++, n--) {
                if (!textWithoutMarks.split(" ")[i].substring(j, j + 1).equals(textWithoutMarks.split(" ")[i].substring(n - 1, n))) {
                    notPolindrome++;
                }
            }
            if (notPolindrome < 1) {
                System.out.print(" Полиндром");
            } else {
                System.out.print(" Не полидром");
            }
            System.out.println();
        }
    }

    //метод, который находит и выводит все слова, длина которых от 3 до 5 включительно
    protected void WordsWithExactLettersAmount() {
        String textWithoutMarks = text.replace("!", "");
        int counter = 0;
        for (int i = 0; i < textWithoutMarks.length() - 1; i++) {
            if (textWithoutMarks.substring(i, i + 1).equals(" ")) {
                counter++;
            }
        }
        System.out.println("Написать метод, который находит и выводит все слова, длина которых от 3 до 5 включительно.");
        for (int i = 0; i <= counter; i++) {
            if (textWithoutMarks.split(" ")[i].length() >= 3 && textWithoutMarks.split(" ")[i].length() <= 5)
                System.out.println(textWithoutMarks.split(" ")[i]);
        }
    }
}
