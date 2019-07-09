package kr.co.seoulit.erp.logi.production.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import kr.co.seoulit.erp.logi.production.to.MrpOpenTempTO;
import kr.co.seoulit.erp.logi.production.to.MrpTO;

public interface MrpDAO {
	//insertMrp, updateMrp 미구현
	public List<MrpTO> selectMrpList(HashMap<String, Object> paramMap);
	
	public List<MrpOpenTempTO> MrpOpenTempProcessList(Map<String,Object> parameters);
}
