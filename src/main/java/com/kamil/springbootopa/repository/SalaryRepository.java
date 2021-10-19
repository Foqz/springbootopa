package com.kamil.springbootopa.repository;

import com.kamil.springbootopa.entity.Salary;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SalaryRepository extends CrudRepository<Salary, Long> {
    Optional<Salary> findByUsername(String username);
}
