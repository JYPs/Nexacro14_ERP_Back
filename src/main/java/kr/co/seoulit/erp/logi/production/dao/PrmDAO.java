package kr.co.seoulit.erp.logi.production.dao;

import java.util.List;
import java.util.Map;

import kr.co.seoulit.erp.logi.production.to.PrmTO;

public interface PrmDAO {

	public List<PrmTO> selectPrmList();

	public void insertPrm(PrmTO prmTO);

	public void callRegisterPrm(Map<String, String> params);

}
