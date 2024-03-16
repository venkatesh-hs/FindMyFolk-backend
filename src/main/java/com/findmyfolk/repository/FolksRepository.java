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
}
