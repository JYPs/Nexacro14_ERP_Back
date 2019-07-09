package kr.co.seoulit.erp.logi.logiBase.serviceFacade;

import java.util.List;
import java.util.Map;

import kr.co.seoulit.erp.logi.logiBase.to.DispositionWorkTO;
import kr.co.seoulit.erp.logi.logiBase.to.FactoryPLTO;
import kr.co.seoulit.erp.logi.logiBase.to.FactoryTO;
import kr.co.seoulit.erp.logi.logiBase.to.ProductionLineTO;

public interface LogiBaseServiceFacade {
	
	//**************** Factory *****************
	List<FactoryTO> findFactoryList(String itemCode);
	
	void registerFactory(List<FactoryTO> factoryList);
	
	//**************** ProductionLine **********
	//생산라인 조회
	public List<ProductionLineTO> findProductionLineList();
	
	//생산라인 관리 저장 버튼
	public void batchProductionLine(List<ProductionLineTO> productionLineList);
	
	//**************** FactoryPL ***************
	List<FactoryPLTO> findFactoryProductionLines(Map<String, String> params);

	void registerFactoryPL(List<FactoryPLTO> factoryPLList);
	
	//**************** DispositionofWorkman ***************
	
	public List<DispositionWorkTO> findDispositionWorkman(Map<String, String> params);
}
