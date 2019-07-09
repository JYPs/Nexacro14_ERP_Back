package kr.co.seoulit.erp.acc.statement.totalTrialBalance.dao;

import java.util.HashMap;
import java.util.List;

import kr.co.seoulit.erp.acc.statement.totalTrialBalance.to.TotalTrialBalanceTO;

public interface TotalTrialBalanceDAO {

	public List<TotalTrialBalanceTO> selectTotalTrialBalanceList(HashMap<String,String> approvalDateMap);
}
