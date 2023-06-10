package com.example.LearnLink.controller;

import com.example.LearnLink.service.BuyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("Buy")
public class BuyController {

    private final BuyService BuyService;

    @Autowired
    public BuyController(BuyService BuyService) {
        this.BuyService = BuyService;
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
