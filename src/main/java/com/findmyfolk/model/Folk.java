package com.findmyfolk.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name = "erp_assignment")
public class Folk {
    @Id
    String name;
    String projectName;
    String projectCode;
    String domain;
    String position;
    String status;
}
