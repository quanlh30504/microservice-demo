package com.example.departmentService.service;

import com.example.departmentService.dtos.DepartmentDto;


public interface DepartmentService {
    DepartmentDto saveDepartment(DepartmentDto departmentDto);

    DepartmentDto getDepartmentByCode(String code) throws Exception;
}
