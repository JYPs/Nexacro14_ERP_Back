package kr.co.seoulit.erp.logi.production.applicationService;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import kr.co.seoulit.erp.logi.business.applicationService.ContractApplicationService;
import kr.co.seoulit.erp.logi.business.to.ContractDetailTO;
import kr.co.seoulit.erp.logi.production.dao.MpsDAO;
import kr.co.seoulit.erp.logi.production.to.MpsTO;

/************************************************************************
@Package		kr.co.seoulit.erp.logi.production.applicationService
@Class			ProductionApplicationServiceImpl.java
@Author			wonminlee, kong
@Description	상품 AS
@Create			2019.02.11
@Last Update    2019.03.06 : AS분리
************************************************************************/

@Component
public class MpsApplicationServiceImpl implements MpsApplicationService {

	@Autowired
	private MpsDAO mpsDAO;
	@Autowired
	private ContractApplicationService contractApplicationService;
	
	
	//@@@@@@@@@@@@@@@@@@@@@  mps  @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
	@Override
	public List<MpsTO> findMpsList(HashMap<String, Object> searchDate) {
		// TODO Auto-generated method stub
		return mpsDAO.selectMpsList(searchDate);
	}
	
	@Override
	public void registMps(List<MpsTO> mpsList, List<ContractDetailTO> contractDetailList) {
		// TODO Auto-generated method stub

		if(mpsList!=null) {
			for(MpsTO mpsTO : mpsList) {
				switch(mpsTO.getStatus()) {
				case "inserted" : mpsDAO.insertMps(mpsTO);	break;
				//case "updated" : contractDAO.updateContract(contractTO); break;
				//case "deleted" : contractDAO.deleteContract(contractTO); break;
				}
			}

		}

		if(contractDetailList!=null) {
			contractApplicationService.batchContract(null, contractDetailList);
		}
	}
}
