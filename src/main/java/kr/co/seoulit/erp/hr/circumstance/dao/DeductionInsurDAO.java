package kr.co.seoulit.erp.hr.circumstance.dao;

import java.util.List;

import kr.co.seoulit.erp.hr.circumstance.to.DeductionTaxTO;
import kr.co.seoulit.erp.hr.circumstance.to.IncomeTaxTO;

public interface DeductionInsurDAO {
	public List<DeductionTaxTO> selectDeductionTaxList();
	public List<IncomeTaxTO> selectIncomeTaxList();
	
	public void deleteDeductionTax(DeductionTaxTO deductionTaxTO);
	public void deleteIncomeTax(IncomeTaxTO incomeTaxTO);
	
	public void insertDeductionTax(DeductionTaxTO deductionTaxTO);
	public void insertIncomeTax(IncomeTaxTO incomeTaxTO);
}
