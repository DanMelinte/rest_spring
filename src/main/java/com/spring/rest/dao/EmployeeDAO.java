package com.spring.rest.dao;

import com.spring.rest.entity.Employee;
import java.util.List;
public interface EmployeeDAO {

    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    public Employee getEmployeeById(int id);

    public void deleteEmployee(int id);
}
