package kr.co.seoulit.erp.logi.logiBase.dao;

import java.util.List;
import java.util.Map;

import kr.co.seoulit.erp.logi.logiBase.to.FactoryPLTO;

public interface FactoryProductionLineDAO {


	public List<FactoryPLTO> selectFactoryProductionLines(Map<String, String> param);

	public void insertFactoryPL(FactoryPLTO fplTO);

	public void updateFactoryPL(FactoryPLTO fplTO);

	public void deleteFactoryPL(FactoryPLTO fplTO);
	
}
