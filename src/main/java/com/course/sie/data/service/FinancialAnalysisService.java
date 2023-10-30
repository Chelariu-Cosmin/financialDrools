package com.course.sie.data.service;

import com.course.sie.data.entity.BalanceSheet;
import com.course.sie.data.entity.CashFlowStatement;
import com.course.sie.data.entity.Company;
import com.course.sie.data.entity.FinancialStatement;
import lombok.RequiredArgsConstructor;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FinancialAnalysisService {

    private final KieContainer kieContainer;

    public void performFinancialAnalysis(Company company, FinancialStatement financialStatement, BalanceSheet balanceSheet, CashFlowStatement cashFlowStatement) {
        KieSession kieSession = kieContainer.newKieSession();

        kieSession.insert(company);
        kieSession.insert(financialStatement);
        kieSession.insert(balanceSheet);
        kieSession.insert(cashFlowStatement);

        kieSession.fireAllRules();
        kieSession.dispose();
    }
}
