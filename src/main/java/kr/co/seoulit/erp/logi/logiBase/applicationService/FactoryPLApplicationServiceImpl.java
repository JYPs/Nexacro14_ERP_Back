package kr.co.seoulit.erp.logi.logiBase.applicationService;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import kr.co.seoulit.erp.logi.logiBase.dao.FactoryDAO;
import kr.co.seoulit.erp.logi.logiBase.dao.FactoryProductionLineDAO;
import kr.co.seoulit.erp.logi.logiBase.to.FactoryPLTO;

@Component
public class FactoryPLApplicationServiceImpl implements FactoryPLApplicationService {

	@Autowired
	FactoryDAO factoryDAO;
	@Autowired
	FactoryProductionLineDAO factoryProductionLineDAO;

	@Override
	public List<FactoryPLTO> findFactoryProductionLines(Map<String, String> params) {
		// TODO Auto-generated method stub
		return factoryProductionLineDAO.selectFactoryProductionLines(params);
	}

	@Override
	public void registerFactoryPL(List<FactoryPLTO> factoryPLList) {

		for (FactoryPLTO fplTO : factoryPLList) {
			switch (fplTO.getStatus()) {
			case "inserted":
				factoryProductionLineDAO.insertFactoryPL(fplTO);
				break;
			case "updated":
				factoryProductionLineDAO.updateFactoryPL(fplTO);
				break;
			case "deleted":
				factoryProductionLineDAO.deleteFactoryPL(fplTO);
				break;
			}
		}

	}

}
