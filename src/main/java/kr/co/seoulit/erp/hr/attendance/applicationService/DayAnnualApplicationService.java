package kr.co.seoulit.erp.hr.attendance.applicationService;

import java.util.HashMap;
import java.util.List;

import kr.co.seoulit.erp.hr.attendance.to.DayAnnualTO;

public interface DayAnnualApplicationService {
	public List<DayAnnualTO> findAnnualMgt(HashMap<String,String> map);
	
	public List<DayAnnualTO> addDayAnnual(DayAnnualTO dayAnnulTO);
	
	public List<DayAnnualTO> findDayAnnualListByCondition(HashMap<String, Object> map);
	
	public void batchDayAnnual(List<DayAnnualTO> dayAnnualList);
}