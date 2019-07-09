package kr.co.seoulit.erp.acc.statement.incomeStatement.dao;

import java.util.HashMap;
import java.util.List;

import kr.co.seoulit.erp.acc.statement.incomeStatement.to.IncomeStatementTO;


public interface IncomeStatementDAO {

	public List<IncomeStatementTO> selectIncomeStatement(HashMap<String,String> approvalDateMap);
}
