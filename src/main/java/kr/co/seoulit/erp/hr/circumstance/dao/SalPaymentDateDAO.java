package kr.co.seoulit.erp.hr.circumstance.dao;

import java.util.List;

import kr.co.seoulit.erp.hr.circumstance.to.SalPaymentDateTO;



public interface SalPaymentDateDAO {
	public List<SalPaymentDateTO> selectSalPaymentDateList(String inputedYearMonth);
		
	public void insertSalPaymentDate(SalPaymentDateTO salPaymentDateTO);
	public void updateSalPaymentDate(SalPaymentDateTO salPaymentDateTO);
	public void deleteSalPaymentDate(SalPaymentDateTO salPaymentDateTO);
}
