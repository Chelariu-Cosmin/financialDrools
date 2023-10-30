package com.course.sie.data.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Industry {
    TECHNOLOGY("Technology"),
    FINANCE("Finance"),
    HEALTHCARE("Healthcare"),
    MANUFACTURING("Manufacturing"),
    RETAIL("Retail"),
    ENERGY("Energy"),
    TELECOMMUNICATIONS("Telecommunications"),
    TRANSPORTATION("Transportation"),
    ENTERTAINMENT("Entertainment");

    private final String name;
}


