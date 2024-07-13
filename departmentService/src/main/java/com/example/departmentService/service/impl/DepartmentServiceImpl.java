package com.example.departmentService.service.impl;

import com.example.departmentService.dtos.DepartmentDto;
import com.example.departmentService.entity.Department;
import com.example.departmentService.mapper.DepartmentMapper;
import com.example.departmentService.repository.DepartmentRepository;
import com.example.departmentService.service.DepartmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DepartmentServiceImpl implements DepartmentService {
    public final DepartmentRepository departmentRepository;

    @Override
    public DepartmentDto saveDepartment(DepartmentDto departmentDto) {
        Department department = DepartmentMapper.toDepartment(departmentDto);
        return DepartmentMapper.toDepartmentDto(departmentRepository.save(department));
    }

    @Override
    public DepartmentDto getDepartmentByCode(String code) throws Exception {
        Department department = departmentRepository.findByDepartmentCode(code)
                .orElseThrow(() -> new RuntimeException("Not found department code"));

        return DepartmentMapper.toDepartmentDto(department);
    }
}
