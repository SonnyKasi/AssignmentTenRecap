package ac.za.cput.factory;
import ac.za.cput.domain.Gender;
public class GenderFactory
{
    public static Gender getGender(String gender)
    {
        return new Gender.Builder().gender(gender)
                .build();
    }
}
