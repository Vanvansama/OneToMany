package com.oocl.fullstack.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "company")
public class Company {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String address;

    @OneToMany
    private List<Company> employeeList;

    public Company() {
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public List<Company> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Company> employeeList) {
        this.employeeList = employeeList;
    }
}
