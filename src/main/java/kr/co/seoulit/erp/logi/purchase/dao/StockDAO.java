package kr.co.seoulit.erp.logi.purchase.dao;

import java.util.List;

import kr.co.seoulit.erp.logi.purchase.to.StockTO;

public interface StockDAO {

	public List<StockTO> selectStockList();
	
	public void updateStock(StockTO stockTO);
	
}
