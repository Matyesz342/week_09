public class TestVerem {
    public static void main(String[] args) {
        test_peldanyositas();
        test_size();
        test_append();
        test_toString();
        test_pop();
    }
    
    private static void test_peldanyositas() {
        Verem v = new Verem();
        System.out.println("ok");
    }

    private static void test_size() {
        Verem v = new Verem();
        assert v.size() == 0;
        v.append(3);
        assert v.size() == 1;
        v.append(2);
        assert v.size() == 2;
        v.append(1);
        assert v.size() == 3;
        System.out.println("ok");
    }

    private static void test_append() {
        Verem v = new Verem();
        assert v.size() == 0;
        v.append(3);
        assert v.size() == 1;
        v.append(2);
        assert v.size() == 2;
        v.append(1);
        assert v.size() == 3;
        System.out.println("ok");
 
    }

    private static void test_toString() {
        Verem v = new Verem();
        assert v.toString().equals("[");
        v.append(3);
        assert v.toString().equals("[3");
        System.out.println("ok");
    }

    private static void test_pop()
    {
        Verem v = new Verem();
        v.append(0);
        v.append(2);
        v.append(1);
        assert v.size() == 3;
        int top;
        top = v.pop();
        assert top == 2;
        assert v.toString().equals("[1");
        System.out.println("ok");
    }
}
