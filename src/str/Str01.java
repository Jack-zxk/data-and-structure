package str;

public class Str01 {
    public static void main(String[] args) {
        String s = "aaa";
        String s1 = new String("aaa");


        Runnable runnable = () -> {
            System.out.println("aaa");
        };

        new Thread(runnable).start();


    }

}
