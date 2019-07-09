package kr.co.seoulit.erp.acc.slip.applicationService;

import java.util.HashMap;
import java.util.List;

import kr.co.seoulit.erp.hr.circumstance.exception.CircumstanceException;
import kr.co.seoulit.erp.logi.business.to.ContractDetailTO;
import kr.co.seoulit.erp.logi.purchase.to.OrderDetailTO;


public interface OtherDeptSlipApplicationService {
	//물류전표획득
	public List<ContractDetailTO> findContractSlipDetailList(HashMap<String, Object> logiSlipReq);
	public void registLogiSlipList(HashMap<String,Object> logiSlipMap);
	public List<OrderDetailTO> findOrderSlipDetailList(HashMap<String, Object> logiSlipReq);

	//인사전표획득
//	public List<TO> findContractSlipDetailList(HashMap<String, Object> logiSlipReq);
	public HashMap<String, Object> registHrSlipList(HashMap<String,Object> hrSlipMap) throws CircumstanceException;
	public void registProductionSlipList(HashMap<String, Object> hrSlipMap) ;
}
