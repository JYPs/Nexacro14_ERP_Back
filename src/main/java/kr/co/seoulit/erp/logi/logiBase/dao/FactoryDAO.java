package kr.co.seoulit.erp.logi.logiBase.dao;

import java.util.List;
import java.util.Map;

import kr.co.seoulit.erp.logi.logiBase.to.FactoryTO;

public interface FactoryDAO {

	public List<FactoryTO> selectFactoryList(Map<String, String> param);

	public void insertFactory(FactoryTO fto);

	public void updateFactory(FactoryTO fto);

	public void deleteFactory(FactoryTO fto);
 
}
