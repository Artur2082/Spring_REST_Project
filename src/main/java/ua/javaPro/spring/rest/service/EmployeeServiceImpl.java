package ua.javaPro.spring.rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.javaPro.spring.rest.dao.EmployeeDAO;
import ua.javaPro.spring.rest.entity.Employee;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeDAO employeeDAO;
    @Override
    @Transactional
    public List<Employee> getAll() {
        return employeeDAO.getAll();
    }
    @Override
    @Transactional
    public void saveEmp(Employee employee) {
         employeeDAO.saveEmp(employee);
    }
    @Override
    @Transactional
    public Employee getEmp(int id) {
        return employeeDAO.getEmp(id);
    }
    @Override
    @Transactional
    public void deleteEmp(int id) {
        employeeDAO.deleteEmp(id);
    }
}
