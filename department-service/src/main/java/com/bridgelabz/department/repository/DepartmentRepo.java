package com.bridgelabz.department.repository;

import com.bridgelabz.department.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepo extends JpaRepository<Department, Long> {

    Department findByDepartmentId(Long departmentId);
}
