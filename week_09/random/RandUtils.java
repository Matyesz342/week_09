import java.util.List;
import java.util.Random;

public class RandUtils
{
    private RandUtils()
    {

    }

    public final static Random r = new Random();
    
    public static int randint(int also, int felso)
    {
        int intervallum = felso - also + 1;
        int result = r.nextInt(intervallum); // 0, 1, 2
        return also + result;
    }

    public static int randrange(int also, int felso)
    {
        int result = randint(also, felso-1);
        return result;
    }

    public static int choice(List<Integer> szamok)
    {
        int index = r.nextInt(szamok.size());
        return szamok.get(index);
    }
}
