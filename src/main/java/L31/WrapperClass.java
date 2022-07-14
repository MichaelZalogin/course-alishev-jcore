package L31;

public class WrapperClass {
    public static void main(String[] args) {
        int x = 3;
        Integer x1 = 232;//Автоупаковка
        String s = "2322324";
        x1.parseInt(s);
        String s1 = x1.toString();
        System.out.println(s1);
        int x3 = x1; //Автораспаковка
    }
}