package com.findmyfolk.repository;

import com.findmyfolk.model.Folk;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface FolksRepository extends JpaRepository<String, Folk> {
    @Query(value = "select * from erp_assignment where project_name = ?1 and domain = ?2 and position = ?3 and status = 'active'",
            nativeQuery = true)
    List<Folk> getFolks(String project, String component, String role);
}
