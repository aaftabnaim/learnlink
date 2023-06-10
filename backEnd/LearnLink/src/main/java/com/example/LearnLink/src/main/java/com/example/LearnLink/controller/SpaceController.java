package com.example.LearnLink.controller;

import com.example.LearnLink.models.Space;
import com.example.LearnLink.service.SpaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("space")
public class SpaceController {

    private final SpaceService spaceservices;

    @Autowired
    public SpaceController(SpaceService spaceservices) {
        this.spaceservices = spaceservices;
    }

    @GetMapping
    public List<Space> getAllSpaces() {
        return spaceservices.getAllSpaces();
    }

    @PostMapping
    public void addSpace() {

    }

    @PutMapping(path = "{spaceId}")
    public void updateSopace() {

    }

    @DeleteMapping(path = "{spaceId}")
    public void deleteSpace() {

    }

}
