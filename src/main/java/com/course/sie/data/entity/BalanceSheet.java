package com.course.sie.data.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
public class BalanceSheet {

    private UUID cod;

    private FinancialStatement financialStatement;

    private double currentAssets;

    private double nonCurrentAssets;

    private double currentLiabilities;

    private double nonCurrentLiabilities;

}
