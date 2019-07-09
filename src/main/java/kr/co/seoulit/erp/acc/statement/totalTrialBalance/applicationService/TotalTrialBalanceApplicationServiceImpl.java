package kr.co.seoulit.erp.acc.statement.totalTrialBalance.applicationService;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import kr.co.seoulit.erp.acc.statement.totalTrialBalance.dao.TotalTrialBalanceDAO;
import kr.co.seoulit.erp.acc.statement.totalTrialBalance.to.TotalTrialBalanceTO;

@Component
public class TotalTrialBalanceApplicationServiceImpl implements TotalTrialBalanceApplicationService {

	@Autowired
	private TotalTrialBalanceDAO totalTrialBalanceDAO;
	

	@Override
	public List<TotalTrialBalanceTO> findTotalTrialBalanceList(HashMap<String,String> approvalDateMap){
		// TODO Auto-generated method stub	
		List<TotalTrialBalanceTO> TotalTrialBalanceList = null;

		TotalTrialBalanceList = totalTrialBalanceDAO.selectTotalTrialBalanceList(approvalDateMap);

		return TotalTrialBalanceList;
	}

	
}
