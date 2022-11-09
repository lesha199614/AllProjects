package StringHW;

public class MyExceptions extends Exception{
    public MyExceptions() {
    }

    public void nullString(){
        System.out.println("Строка пустая");
        System.exit(123);
    }
}
