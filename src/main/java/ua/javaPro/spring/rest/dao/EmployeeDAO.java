package ua.javaPro.spring.rest.dao;

import ua.javaPro.spring.rest.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    public List<Employee> getAll();

  public void saveEmp(Employee employee);

  public Employee getEmp(int id);
  public void deleteEmp(int id);

}
