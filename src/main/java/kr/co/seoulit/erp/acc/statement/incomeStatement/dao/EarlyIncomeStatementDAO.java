package kr.co.seoulit.erp.acc.statement.incomeStatement.dao;

import java.util.List;

import kr.co.seoulit.erp.acc.statement.incomeStatement.to.EarlyIncomeStatementTO;
import kr.co.seoulit.erp.acc.statement.incomeStatement.to.EarlyrevenuesAndExpenseTO;


public interface EarlyIncomeStatementDAO {

	public List<EarlyrevenuesAndExpenseTO> selectRevenuesAndExpenseOnLastYear();
	public List<EarlyIncomeStatementTO> selectIncomeStatementOnLastYear();

}
