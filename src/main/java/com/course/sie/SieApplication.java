package com.course.sie;

import com.course.sie.data.entity.*;
import com.course.sie.data.service.FinancialAnalysisService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.UUID;

@SpringBootApplication
public class SieApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SieApplication.class, args);

        FinancialAnalysisService financialAnalysisService = context.getBean(FinancialAnalysisService.class);

        Company company = new Company();
        company.setCod(UUID.randomUUID());
        company.setName("DROOLS S.A");
        company.setDescription("Description for Drools company");
        company.setSize(100);
        company.setYear(2023);
        company.setNumberOfEmployees(1000);
        company.setIndustry(Industry.TECHNOLOGY);
        company.setEmail("test@drools.com");
        company.setPhone("0752020587");

        FinancialStatement financialStatement = new FinancialStatement();
        financialStatement.setCod(UUID.randomUUID());
        financialStatement.setCompany(company);
        financialStatement.setNetIncome(-50000);
        financialStatement.setExpenses(30000);
        financialStatement.setRevenue(80000);
        financialStatement.setTotalIncome(20000);

        BalanceSheet balanceSheet = new BalanceSheet();
        balanceSheet.setCod(UUID.randomUUID());
        balanceSheet.setFinancialStatement(financialStatement);
        balanceSheet.setCurrentAssets(20000);
        balanceSheet.setNonCurrentAssets(30000);
        balanceSheet.setCurrentLiabilities(10000);
        balanceSheet.setNonCurrentLiabilities(5000);

        CashFlowStatement cashFlowStatement = new CashFlowStatement();
        cashFlowStatement.setCod(UUID.randomUUID());
        cashFlowStatement.setFinancialStatement(financialStatement);
        cashFlowStatement.setOperatingCash(-1000);
        cashFlowStatement.setInvestingCash(2000);
        cashFlowStatement.setFinancingCash(3000);

        // Perform financial analysis
        financialAnalysisService.performFinancialAnalysis(company, financialStatement, balanceSheet, cashFlowStatement);
    }
}
