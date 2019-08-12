package ac.za.cput.factory;

import ac.za.cput.domain.Employee;
import ac.za.cput.domain.Gender;
import ac.za.cput.domain.Race;
import ac.za.cput.util.RandomM;

public class EmployeeFactory
{
    public static Employee
    getEmployee(String first_name, String last_name,String race, String gender)
    {
        Race r = RaceFactory.getRace(race);
        Gender sex = GenderFactory.getGender(gender);
        return new Employee.Builder()
                .emp_id(RandomM.generateId())
                .first_name(first_name)
                .last_name(last_name)
                .race(r)
                .gender(sex)
                .build();
    }
}
