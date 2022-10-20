package com.nestdigital.employeebackend.dao;

import com.nestdigital.employeebackend.model.EmployeeModel;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import javax.swing.*;
import java.util.List;

public interface EmployeeDao extends CrudRepository<EmployeeModel,Integer> {

    @Modifying
    @Query(value = "DELETE FROM `employees` WHERE `id` = :id",nativeQuery = true)
    void deleteById(Integer id);

    @Query(value = "SELECT * FROM `employees` WHERE `name` LIKE concat('%',:name,'%')",nativeQuery = true)
    List<EmployeeModel> searchEmployee(String name);
}
