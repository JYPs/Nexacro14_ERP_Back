package kr.co.seoulit.erp.hr.circumstance.applicationService;

import java.util.List;

import kr.co.seoulit.erp.hr.circumstance.to.PayStepTO;

public interface PayStepApplicationService {

	public List<PayStepTO> findPayStepList();	
	public void batchPayStepList(List<PayStepTO> payStepList);	
}
