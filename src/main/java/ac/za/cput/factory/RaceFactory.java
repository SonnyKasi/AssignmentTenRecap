package ac.za.cput.factory;
import ac.za.cput.domain.Race;
public class RaceFactory
{
    public static Race getRace(String race)
    {
        return new Race.Builder().race(race)
                .build();
    }
}
