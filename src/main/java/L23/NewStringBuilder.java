package L23;

public class NewStringBuilder {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = " my";
        String s3 = " friend";
        String stringAll = s1 + s2 + s3;
        System.out.println(stringAll);
        StringBuilder sb1 = new StringBuilder("");
        StringBuilder sb2 = new StringBuilder("");
        StringBuilder sb3 = new StringBuilder("");
        StringBuilder sb4 = new StringBuilder(s1 + s2 + s3);
        System.out.println(sb4);
        System.out.printf("%5d This is %2f a %3s string %5d", 10, 54.4, "HI", 15);
    }
}