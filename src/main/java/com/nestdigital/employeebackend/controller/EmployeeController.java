package com.nestdigital.employeebackend.controller;

import com.nestdigital.employeebackend.dao.EmployeeDao;
import com.nestdigital.employeebackend.model.EmployeeModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeDao dao;

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/addEmployee",consumes = "application/json",produces = "application/json")
    public String addEmployee(@RequestBody EmployeeModel employee){
        dao.save(employee);
        return "{'status':'success'}";
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/viewEmployee")
    public List<EmployeeModel> viewEmployee(){
        return (List<EmployeeModel>) dao.findAll();
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/deleteEmployee",consumes = "application/json",produces = "application/json")
    public String deleteEmployee(@RequestBody EmployeeModel employee){
        dao.deleteById(employee.getId());
        return "{'status':'success'}";
    }

    @CrossOrigin(origins = "*")
    @PostMapping("/searchEmployee")
    public List<EmployeeModel> searchEmployee(@RequestBody EmployeeModel employee){
        return (List<EmployeeModel>) dao.searchEmployee(employee.getName());
    }


}
