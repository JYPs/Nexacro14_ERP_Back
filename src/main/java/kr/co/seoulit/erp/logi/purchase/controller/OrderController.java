package kr.co.seoulit.erp.logi.purchase.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nexacro.xapi.data.PlatformData;

import kr.co.seoulit.common.mapper.DatasetBeanMapper;
import kr.co.seoulit.erp.logi.purchase.serviceFacade.PurchaseServiceFacade;
import kr.co.seoulit.erp.logi.purchase.to.OrderDetailTO;
import kr.co.seoulit.erp.logi.purchase.to.OrderGatheringTO;
import kr.co.seoulit.erp.logi.purchase.to.OrderInfoTO;

/************************************************************************
@Package		kr.co.seoulit.erp.logi.purchase.controller
@Class			OrderController.java
@Author			kanghokyeong
@Description	주문 관련 컨트롤러
@Create			2019.02.22
@Last Update   	
************************************************************************/

@Controller
public class OrderController {

	@Autowired
	private PurchaseServiceFacade purchaseServiceFacade;

	@Autowired
	private DatasetBeanMapper datasetBeanMapper;
	
	
	//발주취합
	@RequestMapping("logi/purchase/findOrderGatheringList.do")
	public void findOrderGatheringList(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PlatformData inData = (PlatformData) request.getAttribute("inData");
		PlatformData outData = (PlatformData) request.getAttribute("outData");
		//어느 페이지에서 왔는 가에 따라 다른 상태의 값을 가지고 감
		String page = inData.getVariable("page").getString();

		List<OrderGatheringTO> orderGatheringList = purchaseServiceFacade.findOrderGatheringList(page);

		datasetBeanMapper.beansToDataset(outData, orderGatheringList, OrderGatheringTO.class);

	}
	
	//발주목록 조회
	@RequestMapping("logi/purchase/findOrderInfoList.do")
	public void findOrderInfoList(HttpServletRequest request, HttpServletResponse response) throws Exception {

		PlatformData outData = (PlatformData) request.getAttribute("outData");

		List<OrderInfoTO> orderInfoList = purchaseServiceFacade.findOrderInfoList();

		datasetBeanMapper.beansToDataset(outData, orderInfoList, OrderInfoTO.class);

	}

	//발주상세목록 조회
	@RequestMapping("logi/purchase/findOrderDetailList.do")
	public void findOrderDetailList(HttpServletRequest request, HttpServletResponse response) throws Exception {

		PlatformData outData = (PlatformData) request.getAttribute("outData");

		List<OrderDetailTO> orderDetailList = purchaseServiceFacade.findOrderDetailList();

		datasetBeanMapper.beansToDataset(outData, orderDetailList, OrderDetailTO.class);

	}
	
	//발주등록
	@RequestMapping("logi/purchase/registerOrder.do")
	public void registerOrder(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PlatformData inData = (PlatformData) request.getAttribute("inData");
		request.getAttribute("outData");

		List<OrderInfoTO> orderInfoList = datasetBeanMapper.datasetToBeans(inData, OrderInfoTO.class);
		System.out.println("orderInfoList 주소 : "+orderInfoList.get(0));
		System.out.println("getOrderNo : "+orderInfoList.get(0).getOrderNo());
		List<OrderDetailTO> orderDetailList = datasetBeanMapper.datasetToBeans(inData, OrderDetailTO.class);
		System.out.println("orderDetailList 주소 : "+orderDetailList.get(0));
		System.out.println("getOrderDetailNo : "+orderDetailList.get(0).getOrderDetailNo());
		List<OrderGatheringTO> orderGatheringList = datasetBeanMapper.datasetToBeans(inData, OrderGatheringTO.class);
		
		
	
		purchaseServiceFacade.registOrder(orderInfoList, orderDetailList, orderGatheringList);

		findOrderInfoList(request, response);
		findOrderDetailList(request, response);

	}
	
}
