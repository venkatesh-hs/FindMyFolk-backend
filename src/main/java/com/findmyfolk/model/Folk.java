package com.findmyfolk.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Folk {
    String name;
    String projectName;
    String projectCode;
    String domain;
    String position;
    String status;
}
