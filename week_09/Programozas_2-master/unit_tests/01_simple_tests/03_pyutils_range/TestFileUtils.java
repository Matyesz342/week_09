import java.util.List;

public class TestFileUtils {
    public static void main(String[] args)
    {

        test_range3();
    }
    
    private static void test_range3()
    {
        List<Integer> got = PyUtils.range(4, 20, 2);
        List<Integer> expected = List.of(4, 6, 8, 10, 12, 14, 16, 18 );
        assert got.equals(expected) == true;
        //az osszes esetre testet írni HF
        System.out.println("ok");
    }
}
