package kr.co.seoulit.erp.logi.purchase.applicationService;

import java.util.HashMap;
import java.util.List;

import kr.co.seoulit.erp.logi.production.to.MrpGatheringTO;
import kr.co.seoulit.erp.logi.purchase.to.OrderDetailTO;
import kr.co.seoulit.erp.logi.purchase.to.OrderGatheringTO;
import kr.co.seoulit.erp.logi.purchase.to.OrderInfoTO;

public interface OrderApplicationService {

	List<OrderGatheringTO> findOrderGatheringList(String page);

	List<OrderInfoTO> findOrderInfoList();

	List<OrderDetailTO> findOrderDetailList();

	void registOrder(List<OrderInfoTO> orderInfoList, List<OrderDetailTO> orderDetailList,
			List<OrderGatheringTO> orderGatheringList);

	List<OrderDetailTO> findOrderDetailList(HashMap<String, Object> logiSlipReq);

}
