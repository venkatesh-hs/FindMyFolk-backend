package com.findmyfolk.service.impl;

import com.findmyfolk.model.Folk;
import com.findmyfolk.service.FolksService;
import com.findmyfolk.repository.FolksRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FolksServiceImpl implements FolksService {

    private final FolksRepository folksRepository;

    @Override
    public List<Folk> getMyFolks(String project, String component, String role) {
        return folksRepository.getFolks(project, component, role);
    }

    @Override
    public List<String> getAllProjects() {
        return folksRepository.getProjects();
    }

    @Override
    public List<String> getAllComponents() {
        return folksRepository.getComponents();
    }

    @Override
    public List<String> getAllRoles() {
        return folksRepository.getRoles();
    }
}
