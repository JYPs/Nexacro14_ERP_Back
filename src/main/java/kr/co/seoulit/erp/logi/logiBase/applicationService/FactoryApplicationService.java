package kr.co.seoulit.erp.logi.logiBase.applicationService;

import java.util.List;

import kr.co.seoulit.erp.logi.logiBase.to.FactoryTO;

public interface FactoryApplicationService {

	List<FactoryTO> findFactoryList(String itemCode);

	void registerFactory(List<FactoryTO> factoryList);

	
}
