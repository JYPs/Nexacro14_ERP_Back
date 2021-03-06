package kr.co.seoulit.erp.acc.slip.dao;

import java.util.HashMap;
import java.util.List;

import kr.co.seoulit.erp.acc.slip.to.SlipTO;


public interface SlipDAO {

	public List<SlipTO> selectSlipListByCondition(HashMap<String, Object> slipMap);
	public List<SlipTO> selectSlipByReportingDate( String reportingDate);

	public void insertSlipInfo(SlipTO slipTo);
	public void deleteSlipInfo(SlipTO slipTo);
	public void updateSlipInfo(SlipTO slipTo);
	public HashMap<String, Object> registHrSlipProcess(HashMap<String, Object> hrSlipMap);

}
