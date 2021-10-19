package com.kamil.springbootopa.service;

import com.kamil.springbootopa.entity.Salary;
import com.kamil.springbootopa.repository.SalaryRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class SalaryService {
    private final SalaryRepository repository;

    public SalaryService(SalaryRepository repository) {
        this.repository = repository;
    }

    public Salary getSalaryByUsername(String username) {
        return repository.findByUsername(username)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }
}
