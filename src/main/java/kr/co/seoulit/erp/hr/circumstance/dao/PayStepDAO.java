package kr.co.seoulit.erp.hr.circumstance.dao;

import java.util.List;

import kr.co.seoulit.erp.hr.circumstance.to.PayStepTO;

public interface PayStepDAO {

	public List<PayStepTO> selectPayStepList();
	
	public List<PayStepTO> selectDirectPayStepList();

	public void insertPayStep(PayStepTO payStepTO);

	public void updatePayStep(PayStepTO payStepTO);

	public void deletePayStep(PayStepTO payStepTO);
}
