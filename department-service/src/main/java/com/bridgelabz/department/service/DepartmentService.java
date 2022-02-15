package com.bridgelabz.department.service;

import com.bridgelabz.department.entity.Department;
import com.bridgelabz.department.repository.DepartmentRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {

    @Autowired
    private DepartmentRepo departmentRepo;

    public Department saveDepartment(Department department) {
        log.info("Inside saveDepartment of departmentService");
        return departmentRepo.save(department);
    }

    public Department findDepartmentById(Long departmentId) {
        log.info("Inside saveDepartment of departmentService");

        return departmentRepo.findByDepartmentId(departmentId);
    }
}
