package com.findmyfolk.repository;

import com.findmyfolk.model.Folk;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FolksRepository extends JpaRepository<Folk, String> {
    @Query(value = "CALL GET_MY_FOLKS(:project, :component, :role);",
            nativeQuery = true)
    List<Folk> getFolks(@Param("project") String project, @Param("component") String component, @Param("role") String role);

    @Query(value = "select distinct project_name from erp_assignment",
            nativeQuery = true)
    List<String> getProjects();

    @Query(value = "select distinct domain from erp_assignment",
            nativeQuery = true)
    List<String> getComponents();

    @Query(value = "select distinct position from erp_assignment",
            nativeQuery = true)
    List<String> getRoles();
}
