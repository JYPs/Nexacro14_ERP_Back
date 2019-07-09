package kr.co.seoulit.erp.hr.circumstance.dao;

import java.util.List;

import kr.co.seoulit.erp.hr.circumstance.to.OvertimeSudangTO;

public interface OvertimeSudangDAO {

	public List<OvertimeSudangTO> selectOvertimeSudangList();

	public void insertOvertimeSudang(OvertimeSudangTO salPaymentDateTO);

	public void updateOvertimeSudang(OvertimeSudangTO salPaymentDateTO);

	public void deleteOvertimeSudang(OvertimeSudangTO salPaymentDateTO);
}
