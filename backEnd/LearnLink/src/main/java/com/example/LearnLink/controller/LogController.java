package com.example.LearnLink.controller;

import com.example.LearnLink.controller.RequestResponse.LogRequest;
import com.example.LearnLink.controller.RequestResponse.LogResponse;
import com.example.LearnLink.models.User;
import com.example.LearnLink.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("log")
public class LogController {

    private final LogService log;

    @Autowired
    public LogController(LogService log) {
        this.log = log;
    }

    @GetMapping
    public String getLogging() {
        return "log";
    }

    @PostMapping
    public LogResponse getLog(@RequestBody LogRequest logRequest) {

        return log.log(logRequest.getCredential());
    }

    @PutMapping()
    public void updateLogging() {

    }

    @DeleteMapping()
    public void deleteLogging() {

    }

}
