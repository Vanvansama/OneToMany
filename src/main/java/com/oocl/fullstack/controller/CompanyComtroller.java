package com.oocl.fullstack.controller;

import com.oocl.fullstack.model.Company;
import com.oocl.fullstack.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CompanyComtroller {

    @Autowired
    private CompanyRepository companyRepository;
    @PostMapping("/companies")
    public Company addCompany(@RequestBody Company company){
        return companyRepository.save(company);
    }

    @GetMapping("/companies")
    public List<Company> getAllCompanies(){
        return companyRepository.findAll();
    }

    @DeleteMapping("/companies/{companyId}")
    public void deleteCompany(@PathVariable int companyId){ companyRepository.deleteById(companyId); }

    @PutMapping("/companies")
    public void updateCompany(@RequestBody Company company){ companyRepository.save(company); }
}
