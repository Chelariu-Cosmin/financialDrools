package com.course.sie.data.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
public class FinancialStatement {

    private UUID cod;

    private Company company;

    private double netIncome;

    private double expenses;

    private double revenue;

    /**
     * income statement data, including revenue, expenses, and net income
     **/
    private double totalIncome;

    private double totalRevenue;
}
