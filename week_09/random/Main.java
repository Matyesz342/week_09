import java.util.List;

public class Main
{
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.println(RandUtils.randint(70,72));
            System.out.println(RandUtils.randrange(70, 72));
        }
        System.out.println("--------------------------------");

        List<Integer> szamok = List.of(8, 3, 9 , 4, 2);
        System.out.println(RandUtils.choice(szamok));
    }
}