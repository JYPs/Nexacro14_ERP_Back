package kr.co.seoulit.erp.hr.circumstance.applicationService;

import java.util.List;

import kr.co.seoulit.erp.hr.circumstance.to.SalPaymentDateTO;

public interface SalPaymentDateApplicationService {
	public List<SalPaymentDateTO> findSalPaymentDateList(String inputedYearMonth);
	public void batchSalPaymentDate(List<SalPaymentDateTO> salPaymentsDateList);
}
