package kr.co.seoulit.erp.logi.logiBase.applicationService;

import java.util.List;
import java.util.Map;

import kr.co.seoulit.erp.logi.logiBase.to.FactoryPLTO;


public interface FactoryPLApplicationService {


	List<FactoryPLTO> findFactoryProductionLines(Map<String, String> params);

	void registerFactoryPL(List<FactoryPLTO> factoryPLList);
	
}
