package com.crminfo.crminfo.dao;

import com.crminfo.crminfo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    // that's it ... no need to write any code LOL!

    // add a methode to sort by last name

    public List<Employee> findAllByOrderByLastNameAsc();







}
