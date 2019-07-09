package kr.co.seoulit.erp.hr.attendance.applicationService;

import java.util.HashMap;
import java.util.List;

import kr.co.seoulit.erp.hr.attendance.to.DailyAttdTO;

public interface DailyAttdAppService {

	public List<DailyAttdTO> findDailyAttdList(HashMap<String, String> map);
	
	public List<DailyAttdTO> findDailyAttdListByCondition(HashMap<String,Object> map);
	
	public List<DailyAttdTO> registerDailyAttd(DailyAttdTO dailyAttdTO);
	
	public void batchDailyAttd(List<DailyAttdTO> dailyAttdList);
}
