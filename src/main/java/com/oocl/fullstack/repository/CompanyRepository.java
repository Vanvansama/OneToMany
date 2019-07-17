package com.oocl.fullstack.repository;

import com.oocl.fullstack.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company,Integer> {
}
