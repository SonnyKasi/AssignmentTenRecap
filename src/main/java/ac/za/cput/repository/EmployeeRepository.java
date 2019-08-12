package ac.za.cput.repository;

import ac.za.cput.domain.Employee;

import java.util.Set;

public interface EmployeeRepository extends InterfaceRepository<Employee, String> {

    Set<Employee> getAll();
}
