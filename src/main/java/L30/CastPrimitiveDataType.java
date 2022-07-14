package L30;

public class CastPrimitiveDataType {
    static byte a = 5;
    static short c = 5;
    static int b = 5;
    static long d = 5L;
    static float f = 4.5f;
    static double e = 32.3;

    static char g = 'e';
    static boolean o = true;

    public static void main(String[] args) {
        b = a; // Инту присваиваем байт. Выполнено неявное приведение.
        c = (short) d; // Лонг переложили в байт. Явное приведение.
    }
}