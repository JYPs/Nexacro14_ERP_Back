package kr.co.seoulit.erp.logi.purchase.dao;

import java.util.List;

import kr.co.seoulit.erp.logi.purchase.to.WarehousingTO;

public interface WarehousingDAO {

	public List<WarehousingTO> selectWarehousingList();
	
	public void insertWarehousing(WarehousingTO warehousingTO);
	
	public void updateWarehousing(WarehousingTO warehousingTO);
}
