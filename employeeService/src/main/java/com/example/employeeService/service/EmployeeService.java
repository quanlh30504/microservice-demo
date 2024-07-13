package com.example.employeeService.service;


import com.example.employeeService.dtos.APIResponseDto;
import com.example.employeeService.dtos.EmployeeDto;

public interface EmployeeService {
    EmployeeDto saveEmployee(EmployeeDto employeeDto);

    APIResponseDto getEmployeeById(Long employeeId);
}