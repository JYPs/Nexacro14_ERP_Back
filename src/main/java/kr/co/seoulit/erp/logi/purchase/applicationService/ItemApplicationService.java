package kr.co.seoulit.erp.logi.purchase.applicationService;

import java.util.List;

import kr.co.seoulit.erp.logi.purchase.to.ItemTO;

public interface ItemApplicationService {

	//품목조회
	List<ItemTO> findItemList();
	String findItemCost(String itemCode);
	//품목저장
	void batchItem(List<ItemTO> itemList);

}
