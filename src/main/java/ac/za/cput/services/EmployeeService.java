package ac.za.cput.services;

import ac.za.cput.domain.Employee;

import java.util.Set;

public interface EmployeeService extends InterfaceService<Employee, String> {

    Set<Employee> getAll();

}
