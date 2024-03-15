package com.findmyfolk.service;

import com.findmyfolk.model.Folk;

import java.util.List;

public interface FolksService {
    List<Folk> getMyFolks(String project, String component, String role);
}
