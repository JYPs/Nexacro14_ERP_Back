package kr.co.seoulit.erp.logi.logiBase.applicationService;

import java.util.List;

import org.springframework.stereotype.Service;

import kr.co.seoulit.erp.logi.logiBase.to.ProductionLineTO;


public interface ProductionLineApplicationService {

	public List<ProductionLineTO> findProductionLineList();
	
	public void batchProductionLine(List<ProductionLineTO> productionLineList);
}
