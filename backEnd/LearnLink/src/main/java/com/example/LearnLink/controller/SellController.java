package com.example.LearnLink.controller;

import com.example.LearnLink.service.BuyService;
import com.example.LearnLink.service.SellService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("sell")
public class SellController {

    private final SellService sellService;

    @Autowired
    public SellController(SellService sellService) {
        this.sellService = sellService;
    }

    @GetMapping
    public String getAllBuys() {
        return null;
    }

    @PostMapping
    public void addsell() {

    }

    @PutMapping()
    public void updatesell() {

    }

    @DeleteMapping()
    public void deletesell() {

    }

}
