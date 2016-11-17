package com.example.vmi.repository;

import com.example.vmi.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource(path = "employees")
public interface EmployeeRepository extends JpaRepository<Employee, Long>, QueryDslPredicateExecutor<Employee>{

}
