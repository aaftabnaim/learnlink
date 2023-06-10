package com.example.LearnLink.controller;

import com.example.LearnLink.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("Seller")
public class SellerController {

    private final SellerService SellerService;

    @Autowired
    public SellerController(SellerService SellerService) {
        this.SellerService = SellerService;
    }

    @GetMapping
    public String getAllBuys() {
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
