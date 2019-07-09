package kr.co.seoulit.erp.hr.circumstance.applicationService;

import java.util.List;

import kr.co.seoulit.erp.hr.circumstance.to.PayDeductionItemTO;

public interface PayDeductionApplicationService {

	public List<PayDeductionItemTO> findPayDeductionList();

	public void batchPayDeduction(List<PayDeductionItemTO> payDeductionList);

}
