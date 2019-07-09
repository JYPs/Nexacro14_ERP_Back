package kr.co.seoulit.erp.hr.circumstance.dao;

import java.util.List;

import kr.co.seoulit.erp.hr.circumstance.to.BaseWorkTimeTO;

public interface BaseWorkTimeDAO {
	public List<BaseWorkTimeTO> selectBaseWorkTimeList();
	public void insertBaseWorkTime(BaseWorkTimeTO baseWorkTimeTO);
	public void updateBaseWorkTime(BaseWorkTimeTO baseWorkTimeTO);
	public void deleteBaseWorkTime(BaseWorkTimeTO baseWorkTimeTO);

	
}
