
package com.foxlimited.employee.service;

import org.springframework.stereotype.Service;

import com.foxlimited.employee.entity.Employee;
import com.foxlimited.employee.repository.EmployeeRepository;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public Employee createEmployee(Employee employee) {

        return employeeRepository.save(employee);
    }
}
