package kr.co.seoulit.erp.acc.statement.financialStatement.dao;

import java.util.List;

import kr.co.seoulit.erp.acc.statement.financialStatement.to.EarlyAssetsCountTO;
import kr.co.seoulit.erp.acc.statement.financialStatement.to.EarlyFinancialStatementsTO;
import kr.co.seoulit.erp.acc.statement.financialStatement.to.EarlyLiabilitiesAndCapitalCountTO;


public interface EarlyFinancialStatementsDAO {
	
	public List<EarlyAssetsCountTO> selectAssetsOnLastYear();
	public List<EarlyLiabilitiesAndCapitalCountTO> selectLiabilitiesAndCapitalOnLastYear();
	public List<EarlyFinancialStatementsTO> selectFinancialStatementsOnLastYear();

	
}
