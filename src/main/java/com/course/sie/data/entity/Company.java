package com.course.sie.data.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
public class Company {

    private UUID cod;

    private String name;

    private String description;

    private Integer size;

    private Integer year;

    private Integer numberOfEmployees;

    private Industry industry;

    private String email;

    private String phone;
}
