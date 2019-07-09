package kr.co.seoulit.erp.hr.attendance.applicationService;

import java.util.HashMap;
import java.util.List;

import kr.co.seoulit.erp.hr.attendance.to.DailyAttdRestTO;

public interface DailyAttdRestApplicationService {

	public List<DailyAttdRestTO> findAttdRestList(HashMap<String,Object> map);
	
	public void batchDailyAttdRest(List<DailyAttdRestTO> dailyAttdRestList);
	
	public List<DailyAttdRestTO> findAttdRestListByCondition(HashMap<String, Object> map);
	
}
