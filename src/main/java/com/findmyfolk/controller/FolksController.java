package com.findmyfolk.controller;

import com.findmyfolk.model.Folk;
import com.findmyfolk.service.FolksService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
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
                                                 @RequestParam(value = "component", required = false) String component,
                                                 @RequestParam(value = "role", required = false) String role) {
        List<Folk> folks = folksService.getMyFolks(project, component, role);
        HttpStatus status = HttpStatus.OK;
        if (folks == null || folks.isEmpty()) {
            status = HttpStatus.NOT_FOUND;
        }
        return ResponseEntity
                .status(status)
                .body(folks);
    }

    @GetMapping("/project")
    public ResponseEntity<List<String>> getProjects() {
        List<String> projects = folksService.getAllProjects();
        HttpStatus status = HttpStatus.OK;
        if (projects == null || projects.isEmpty()) {
            status = HttpStatus.NOT_FOUND;
        }
        return ResponseEntity
                .status(status)
                .body(projects);
    }

    @GetMapping("/component")
    public ResponseEntity<List<String>> getComponents() {
        List<String> components = folksService.getAllComponents();
        HttpStatus status = HttpStatus.OK;
        if (components == null || components.isEmpty()) {
            status = HttpStatus.NOT_FOUND;
        }
        return ResponseEntity
                .status(status)
                .body(components);
    }

    @GetMapping("/role")
    public ResponseEntity<List<String>> getRoles() {
        List<String> roles = folksService.getAllRoles();
        HttpStatus status = HttpStatus.OK;
        if (roles == null || roles.isEmpty()) {
            status = HttpStatus.NOT_FOUND;
        }
        return ResponseEntity
                .status(status)
                .body(roles);
    }
}
