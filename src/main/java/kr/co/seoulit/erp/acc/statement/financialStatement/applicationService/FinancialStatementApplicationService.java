package kr.co.seoulit.erp.acc.statement.financialStatement.applicationService;

import java.util.HashMap;
import java.util.List;

import kr.co.seoulit.erp.acc.statement.financialStatement.to.EarlyAssetsCountTO;
import kr.co.seoulit.erp.acc.statement.financialStatement.to.EarlyFinancialStatementsTO;
import kr.co.seoulit.erp.acc.statement.financialStatement.to.EarlyLiabilitiesAndCapitalCountTO;
import kr.co.seoulit.erp.acc.statement.financialStatement.to.FinancialStatementsTO;
import kr.co.seoulit.erp.acc.statement.financialStatement.to.eFinancialStatementsTO;

public interface FinancialStatementApplicationService {

	public List<FinancialStatementsTO> findFinancialStatements(HashMap<String, Object> approvalDate);
	public List<eFinancialStatementsTO> getEFinancialStatements();

	public List<EarlyAssetsCountTO> findAssetsOnLastYear();
	public List<EarlyLiabilitiesAndCapitalCountTO> findLiabilitiesAndCapitalOnLastYear();
	public List<EarlyFinancialStatementsTO> findFinancialStatementsOnLastYear();

	
}
