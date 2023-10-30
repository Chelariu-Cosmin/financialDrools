package com.course.sie.data.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
public class CashFlowStatement {

    private UUID cod;

    private FinancialStatement financialStatement;

    /**
     * cash generated or consumed
     **/
    private double operatingCash;

    /**
     * buying or selling assets
     **/
    private double investingCash;

    /**
     * issuing stock, paying dividends
     **/
    private double financingCash;
}
