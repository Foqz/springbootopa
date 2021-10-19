package com.kamil.springbootopa.controller;

import com.kamil.springbootopa.entity.Salary;
import com.kamil.springbootopa.service.SalaryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/salary")
public class SalaryController {

    private final SalaryService service;

    public SalaryController(SalaryService service) {
        this.service = service;
    }

    @GetMapping("/{username}")
    public Salary getSalary(@PathVariable String username) {
        return service.getSalaryByUsername(username);
    }
}
