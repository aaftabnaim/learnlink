package com.example.LearnLink.controller;

import com.example.LearnLink.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("admin")
public class AdminController {

    private final AdminService adminService;

    @Autowired
    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    @GetMapping
    public String getInfo() {
        return null;
    }

    @PostMapping
    public void addResevation() {

    }

    @PutMapping()
    public void updateResevation() {

    }

    @DeleteMapping()
    public void deleteResevation() {

    }
}
