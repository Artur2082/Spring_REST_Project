package ua.javaPro.spring.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ua.javaPro.spring.rest.entity.Employee;
import ua.javaPro.spring.rest.exception_handling.NoSuchEmployeeException;
import ua.javaPro.spring.rest.service.EmployeeService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyRESTController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> showAllEmployees() {
        return employeeService.getAll();
    }

    @GetMapping("/employees/{id}")
    public Employee getEmp(@PathVariable int id) {
        Employee employee = employeeService.getEmp(id);
        if (employee == null) {
            throw new NoSuchEmployeeException("There is no such employee with id - " + id
                    + " in DataBase");
        }
        return employee;
    }

    @PostMapping("/employees")
    public Employee saveEmp(@RequestBody Employee employee) {
        employeeService.saveEmp(employee);
        return employee;
    }

    @PutMapping("/employees")
    public Employee updateEmp(@RequestBody Employee employee) {
        employeeService.saveEmp(employee);
        return employee;
    }

    @DeleteMapping("/employees/{id}")
    public String deleteEmp(@PathVariable int id) {
        Employee employee = employeeService.getEmp(id);
        if (employee == null) {
            throw new NoSuchEmployeeException("There is no such employee with id - " + id
                    + " in DataBase");
        }
        employeeService.deleteEmp(id);
        return "Employee with id = " + id + " was deleted";
    }
}
