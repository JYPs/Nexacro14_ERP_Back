package kr.co.seoulit.erp.acc.statement.totalTrialBalance.serviceFacade;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.seoulit.erp.acc.statement.totalTrialBalance.applicationService.TotalTrialBalanceApplicationService;
import kr.co.seoulit.erp.acc.statement.totalTrialBalance.to.TotalTrialBalanceTO;



@Service
public class TotalTrialBalanceServiceFacadeImpl implements TotalTrialBalanceServiceFacade {

	@Autowired
	private TotalTrialBalanceApplicationService totalTrialBalanceApplicationService;
	
	
	@Override
	public List<TotalTrialBalanceTO> findTotalTrialBalanceList(HashMap<String,String> approvalDateMap){
		// TODO Auto-generated method stub
		List<TotalTrialBalanceTO> TotalTrialBalanceList = null;

		TotalTrialBalanceList = totalTrialBalanceApplicationService.findTotalTrialBalanceList(approvalDateMap);

		return TotalTrialBalanceList;
	}

	
}
