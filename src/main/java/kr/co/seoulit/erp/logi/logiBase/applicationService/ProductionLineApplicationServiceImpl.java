package kr.co.seoulit.erp.logi.logiBase.applicationService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.seoulit.erp.logi.logiBase.dao.ProductionLineDAO;
import kr.co.seoulit.erp.logi.logiBase.to.ProductionLineTO;
import kr.co.seoulit.erp.logi.purchase.to.ItemTO;
import kr.co.seoulit.erp.sys.dao.SequenceDAO;

@Service
public class ProductionLineApplicationServiceImpl implements ProductionLineApplicationService {

	@Autowired
	ProductionLineDAO productionDAO;
	
	@Override
	public List<ProductionLineTO> findProductionLineList() {
		return productionDAO.selectProductionLineList();
	}

	@Override
	public void batchProductionLine(List<ProductionLineTO> productionLineList) {	
			for(ProductionLineTO productionLineTO : productionLineList) {
				if(productionLineTO.getStatus().equals("updated")) {
					productionDAO.updateProductionLine(productionLineTO);
				}else if(productionLineTO.getStatus().equals("inserted")) {
					productionDAO.insertProductionLine(productionLineTO);
				}else {
					productionDAO.deleteProductionLine(productionLineTO);
				}
			}
		}
}
	

