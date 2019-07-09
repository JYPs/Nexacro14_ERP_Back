package kr.co.seoulit.erp.logi.logiBase.applicationService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import kr.co.seoulit.erp.logi.logiBase.dao.FactoryDAO;
import kr.co.seoulit.erp.logi.logiBase.to.FactoryTO;

@Component
public class FactoryApplicationServiceImpl implements FactoryApplicationService {

	@Autowired
	FactoryDAO factoryDAO;

	@Override
	public List<FactoryTO> findFactoryList(String itemCode) {
		// TODO Auto-generated method stub
		Map<String, String> param = new HashMap<>();
		param.put("itemCode",itemCode);
		
		return factoryDAO.selectFactoryList(param);
	}

	@Override
	public void registerFactory(List<FactoryTO> factoryList) {
		// TODO Auto-generated method stub
		for (FactoryTO fto : factoryList) {
			switch (fto.getStatus()) {
			case "inserted":
				factoryDAO.insertFactory(fto);
				break;
			case "updated":
				factoryDAO.updateFactory(fto);
				break;
			case "deleted":
				factoryDAO.deleteFactory(fto);
				break;
			}
		}
	}

}
