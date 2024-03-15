package com.findmyfolk.controller;

import com.findmyfolk.model.Folk;
import com.findmyfolk.service.FolksService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/folks")
@RequiredArgsConstructor
public class FolksController {

    private final FolksService folksService;

    @GetMapping
    public ResponseEntity<List<Folk>> getMyFolks(@RequestParam(value = "project") String project,
                                                @RequestParam(value = "component") String component,
                                                @RequestParam(value = "role") String role) {
        return ResponseEntity
                .ok()
                .body(folksService.getMyFolks(project, component, role));
    }
}
