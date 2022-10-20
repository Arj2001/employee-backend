package com.nestdigital.employeebackend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employees")
public class EmployeeModel {

    @Id
    @GeneratedValue
    private int id;

    private String name;
    private String empCode;
    private String desgin;
    private String company;
    private String email;
    private String address;
    private String dob;
    private String phone;
    private int salary;
    private String doj;

    public EmployeeModel(int id, String name, String empCode, String desgin, String company, String email, String address, String dob, String phone, int salary, String doj) {
        this.id = id;
        this.name = name;
        this.empCode = empCode;
        this.desgin = desgin;
        this.company = company;
        this.email = email;
        this.address = address;
        this.dob = dob;
        this.phone = phone;
        this.salary = salary;
        this.doj = doj;
    }

    public EmployeeModel() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmpCode() {
        return empCode;
    }

    public void setEmpCode(String empCode) {
        this.empCode = empCode;
    }

    public String getDesgin() {
        return desgin;
    }

    public void setDesgin(String desgin) {
        this.desgin = desgin;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDoj() {
        return doj;
    }

    public void setDoj(String doj) {
        this.doj = doj;
    }
}

