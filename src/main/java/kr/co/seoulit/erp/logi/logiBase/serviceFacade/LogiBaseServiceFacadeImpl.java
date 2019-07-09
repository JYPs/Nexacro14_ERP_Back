package kr.co.seoulit.erp.logi.logiBase.serviceFacade;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.seoulit.erp.logi.logiBase.applicationService.DispositionWorkmanApplicationService;
import kr.co.seoulit.erp.logi.logiBase.applicationService.FactoryApplicationService;
import kr.co.seoulit.erp.logi.logiBase.applicationService.ProductionLineApplicationService;
import kr.co.seoulit.erp.logi.logiBase.applicationService.FactoryPLApplicationService;
import kr.co.seoulit.erp.logi.logiBase.to.DispositionWorkTO;
import kr.co.seoulit.erp.logi.logiBase.to.FactoryPLTO;
import kr.co.seoulit.erp.logi.logiBase.to.FactoryTO;
import kr.co.seoulit.erp.logi.logiBase.to.ProductionLineTO;
@Service
public class LogiBaseServiceFacadeImpl implements LogiBaseServiceFacade {

	@Autowired
	FactoryApplicationService factoryApplicationService;
	
	@Autowired
	ProductionLineApplicationService productionAppService;
	
	@Autowired
	FactoryPLApplicationService factoryPLApplicationService;
	
	@Autowired
	DispositionWorkmanApplicationService DispositionApplicationService;
	
	
	//*****************  Factory *************************
	@Override
	public List<FactoryTO> findFactoryList(String itemCode) {
		// TODO Auto-generated method stub
		return factoryApplicationService.findFactoryList(itemCode);
	}
	
	public void registerFactory(List<FactoryTO> factoryList) {
		factoryApplicationService.registerFactory(factoryList);
	}
	
	
	
	//***************** ProductionLine *******************
	public List<ProductionLineTO> findProductionLineList(){
		return productionAppService.findProductionLineList();
	}

	@Override
	public void batchProductionLine(List<ProductionLineTO> productionLineList) {
		productionAppService.batchProductionLine(productionLineList);
	}
	
	
	//***************** FactoryProductionLine **************
	@Override
	public List<FactoryPLTO> findFactoryProductionLines(Map<String, String> params) {
		// TODO Auto-generated method stub
		return factoryPLApplicationService.findFactoryProductionLines(params);
	}
	
	@Override
	public void registerFactoryPL(List<FactoryPLTO> factoryPLList) {
		// TODO Auto-generated method stub
		factoryPLApplicationService.registerFactoryPL(factoryPLList);
	}
	//**************** DispositionWorkman *****************
	@Override
	public List<DispositionWorkTO> findDispositionWorkman(Map<String, String> params) {
		return DispositionApplicationService.findDispositionWorkman(params);
	}
}






