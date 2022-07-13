package L28;

public class AccessModifiers {

    public AccessModifiers() {
    }

    public int id;
    protected int s3;
    int s2;
    private int s1;

    private void technicalMethod() {
    }

    public static void main(String[] args) {
        //public (доступно в пределах проекта),
        //private (доступно только в теле класса),
        //default (доступно в пределах пакета),
        //protected (доступно в пределах пакета и у сабклассов)
    }
}