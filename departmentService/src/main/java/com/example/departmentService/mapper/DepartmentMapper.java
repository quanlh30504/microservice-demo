package com.example.departmentService.mapper;

import com.example.departmentService.dtos.DepartmentDto;
import com.example.departmentService.entity.Department;
import org.springframework.stereotype.Component;


public class DepartmentMapper {
    public static Department toDepartment(DepartmentDto departmentDto){
        return Department.builder()
                .id(departmentDto.getId())
                .departmentName(departmentDto.getDepartmentName())
                .departmentDescription(departmentDto.getDepartmentDescription())
                .departmentCode(departmentDto.getDepartmentCode())
                .build();
    }
    public static DepartmentDto toDepartmentDto(Department department){
        return DepartmentDto.builder()
                .id(department.getId())
                .departmentName(department.getDepartmentName())
                .departmentDescription(department.getDepartmentDescription())
                .departmentCode(department.getDepartmentCode())
                .build();
    }



}
