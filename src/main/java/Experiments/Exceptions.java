package Experiments;

public class Exceptions {

    public static void main(String[] args) {
        String[] atrArray = {"str1", "str2", "str3"};
        uncheckedExceptionStr(atrArray);
        try {
            pause();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private static void uncheckedExceptionStr(String[] str) {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(str[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("Created exceptions!");
        }
        System.out.println("Programm is working");
    }

    private static void pause() throws InterruptedException {
        checkedException();
        System.out.println("pause 3 sec");
    }

    private static void checkedException() throws InterruptedException {
        Thread.sleep(3000);
    }

    private String first(String s) {
        return null;

    }
}
