package com.csb.samplefullstack.repository;

import com.repository.employeeRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@repository
public interface employeeReposity extends JpaRepository <Employee, Long> {

}