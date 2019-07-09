package kr.co.seoulit.erp.sys.dao;

import java.util.List;

import kr.co.seoulit.erp.sys.to.BusinessPlaceTO;

public interface BusinessPlaceDAO{

	public List<BusinessPlaceTO> selectBusinessPlaceList();
	
	public void insertBusinessPlace(BusinessPlaceTO businessPlaceTO);
	
	public void updateBusinessPlace(BusinessPlaceTO businessPlaceTO);
	
	public void deleteBusinessPlace(BusinessPlaceTO businessPlaceTO);

}
