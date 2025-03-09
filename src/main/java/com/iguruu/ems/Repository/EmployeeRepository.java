package com.iguruu.ems.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iguruu.ems.Entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
