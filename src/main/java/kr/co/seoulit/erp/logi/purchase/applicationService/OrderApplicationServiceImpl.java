package kr.co.seoulit.erp.logi.purchase.applicationService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import kr.co.seoulit.erp.logi.production.applicationService.MrpApplicationService;
import kr.co.seoulit.erp.logi.production.to.MrpGatheringTO;
import kr.co.seoulit.erp.logi.purchase.dao.OrderDetailDAO;
import kr.co.seoulit.erp.logi.purchase.dao.OrderInfoDAO;
import kr.co.seoulit.erp.logi.purchase.to.OrderDetailTO;
import kr.co.seoulit.erp.logi.purchase.to.OrderGatheringTO;
import kr.co.seoulit.erp.logi.purchase.to.OrderInfoTO;

@Component
public class OrderApplicationServiceImpl implements OrderApplicationService {
	@Autowired
	private OrderDetailDAO orderDetailDAO;
	@Autowired
	private OrderInfoDAO orderInfoDAO;
	@Autowired
	private MrpApplicationService mrpApplicationService;

	// 발주취합
	@Override
	public List<OrderGatheringTO> findOrderGatheringList(String page) {
		// TODO Auto-generated method stub
		Map<String, String> param = new HashMap<>();
		param.put("page", page);
		return orderDetailDAO.selectOrderGatheringList(param);
	}

	// 발주목록 조회
	@Override
	public List<OrderInfoTO> findOrderInfoList() {
		// TODO Auto-generated method stub
		return orderInfoDAO.selectOrderInfoList();
	}

	// 발주상세목록 조회
	@Override
	public List<OrderDetailTO> findOrderDetailList() {
		// TODO Auto-generated method stub
		return orderDetailDAO.selectOrderDetailList();
	}

	// 발주등록
	@Override
	public void registOrder(List<OrderInfoTO> orderInfoList, List<OrderDetailTO> orderDetailList,
			List<OrderGatheringTO> orderGatheringList) {
		// TODO Auto-generated method stub

		for (OrderInfoTO orderInfoTO : orderInfoList) {
			switch (orderInfoTO.getStatus()) {
			case "inserted":
				orderInfoDAO.insertOrderInfo(orderInfoTO);
				break;
			case "updated":
				orderInfoDAO.updateOrderInfo(orderInfoTO);
				break;
			}
		}

		for (OrderDetailTO orderDetailTO : orderDetailList) {
			System.out.println(orderDetailTO.getOrderAmount() + orderDetailTO.getItemName());
			switch (orderDetailTO.getStatus()) {
			case "inserted":
				orderDetailDAO.insertOrderDetail(orderDetailTO);
				break;
			case "updated":
				orderDetailDAO.updateOrderDetail(orderDetailTO);
				break;
			}
		}

		// 조건에 맞게 취합한!! 정보이므로 itemcode만 꺼내고 보내서 ON_GOING_PROCESS_STATUS를 y로만 바꿔줍니다.
		// 취합이므로 itemcode가 사실상 유일키 기능을 가지게 되므로 이렇게 수정
		MrpGatheringTO mrpGatheringTO = null;
		List<MrpGatheringTO> mrpGatheringList = null;
		if (orderGatheringList != null) {
			mrpGatheringList = new ArrayList<MrpGatheringTO>();
			for (OrderGatheringTO orderGatheringTO : orderGatheringList) {
				mrpGatheringTO = new MrpGatheringTO();
				String itemCode = orderGatheringTO.getItemCode();
				mrpGatheringTO.setItemCode(itemCode);
				mrpGatheringTO.setStatus("updated");
				mrpGatheringList.add(mrpGatheringTO);
			}
			
			mrpApplicationService.batchMrpGathering(mrpGatheringList);
		}

		
	}

	@Override
	public List<OrderDetailTO> findOrderDetailList(HashMap<String, Object> logiSlipReq) {
		// TODO Auto-generated method stub
		return orderDetailDAO.selectOrderDetailList2(logiSlipReq);
	}
}
