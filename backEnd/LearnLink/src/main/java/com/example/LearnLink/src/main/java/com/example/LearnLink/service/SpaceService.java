package com.example.LearnLink.service;

import com.example.LearnLink.db.SpaceDB;
import com.example.LearnLink.models.Space;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpaceService {

    private final SpaceDB spacedata;

    @Autowired
    public SpaceService(SpaceDB spacedata) {
        this.spacedata = spacedata;
    }

    public List<Space> getAllSpaces() {
        return spacedata.getAllSpacess();
    }

}
