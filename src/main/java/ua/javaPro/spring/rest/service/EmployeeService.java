package ua.javaPro.spring.rest.service;



import ua.javaPro.spring.rest.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAll();
    public void saveEmp(Employee employee);
    public Employee getEmp(int id);
    public void deleteEmp(int id);
}
