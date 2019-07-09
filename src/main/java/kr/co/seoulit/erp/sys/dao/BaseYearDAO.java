package kr.co.seoulit.erp.sys.dao;

import java.util.List;
import java.util.Map;

import kr.co.seoulit.erp.sys.to.BaseYearTO;

public interface BaseYearDAO{

	public List<BaseYearTO> selectBaseYearList(Map<String,Object> vList);

}
