package kr.co.seoulit.erp.logi.production.applicationService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import kr.co.seoulit.erp.acc.slip.applicationService.OtherDeptSlipApplicationService;
import kr.co.seoulit.erp.logi.production.dao.PrmDAO;
import kr.co.seoulit.erp.logi.production.to.PrmTO;
import kr.co.seoulit.erp.logi.production.to.WorkInstructionTO;
import kr.co.seoulit.erp.logi.purchase.applicationService.StockApplicationService;
import kr.co.seoulit.erp.logi.purchase.to.StockTO;
import kr.co.seoulit.erp.logi.purchase.to.WarehousingTO;

/************************************************************************
@Package		kr.co.seoulit.erp.logi.production.PrmApplicationServiceImpl
@Class			PrmApplicationServiceImpl.java
@Author			wonminlee, kong
@Description	상품 AS
@Create			2019.03.07
@Last Update    2019.03.07 새로만들고 이전
************************************************************************/

@Component
public class PrmApplicationServiceImpl implements PrmApplicationService{

	@Autowired
	private StockApplicationService purchaseApplicationService;
	@Autowired
	private WorkInstructionApplicationService workInstructionApplicationService;
	@Autowired
	private PrmDAO prmDAO;
	@Autowired
	private OtherDeptSlipApplicationService otherDeptslipApplicationService;

	@Override
	public List<PrmTO> findPrmList(){
		// TODO Auto-generated method stub
		return prmDAO.selectPrmList();
	}


	@Override
	public void registPrm(String empCode, List<PrmTO> prmList) {
		// TODO Auto-generated method stub
//		String req="생산실적";
//		logiSlipMap.put("req", req);
//		logiSlipMap.put("prmList", prmList);
		Map<String, String> params = new HashMap<>();
		params.put("empCode",empCode);
		for(PrmTO prmTO : prmList) {
			params.put("productionResultNo", prmTO.getProductionResultNo());
			params.put("workInstructionNo", prmTO.getWorkInstructionNo());
			
			prmDAO.callRegisterPrm(params); break;
			//case "update" : prmDAO.updatePrm(prmTO); break;
			//case "delete" : prmDAO.deletePrm(prmTO); break;
			
		}
		
//		workInstructionApplicationService.registWorkInstruction(workInstructionList,null,null,null);
//		purchaseApplicationService.batchStock(stockList);//스톡어플리케이션 서비스
//		purchaseApplicationService.registWarehousing(null,null,stockList,warehousingList);//웨얼하우징어플리케이션서비스로변경
//		otherDeptslipApplicationService.registLogiSlipList(logiSlipMap);
		
	}
}
