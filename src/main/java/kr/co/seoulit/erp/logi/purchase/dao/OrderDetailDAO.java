package kr.co.seoulit.erp.logi.purchase.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import kr.co.seoulit.erp.logi.purchase.to.OrderDetailTO;
import kr.co.seoulit.erp.logi.purchase.to.OrderGatheringTO;

public interface OrderDetailDAO {

	//발주취합
	public List<OrderGatheringTO> selectOrderGatheringList(Map<String, String> param);

	//발주상세목록 조회
	public List<OrderDetailTO> selectOrderDetailList();
	public List<OrderDetailTO> selectOrderDetailList2(HashMap<String, Object> logiSlipReq);

	//발주상세등록
	public void insertOrderDetail(OrderDetailTO orderDetailTO);

	//발주상세수정
	public void updateOrderDetail(OrderDetailTO orderDetailTO);

}
