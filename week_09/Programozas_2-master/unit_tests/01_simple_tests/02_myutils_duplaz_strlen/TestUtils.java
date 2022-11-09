public class TestUtils {
    public static void main(String[] args)
    {
        assert MyUtils.strlen("") == 0;
        assert MyUtils.strlen("hello") == 5;
        assert MyUtils.strlen("asd") == 3;

        System.out.println("ok");
    }
    
}
