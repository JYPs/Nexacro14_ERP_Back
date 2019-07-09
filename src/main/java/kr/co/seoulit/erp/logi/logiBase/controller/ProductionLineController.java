package kr.co.seoulit.erp.logi.logiBase.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nexacro.xapi.data.PlatformData;

import kr.co.seoulit.common.mapper.DatasetBeanMapper;
import kr.co.seoulit.erp.logi.logiBase.serviceFacade.LogiBaseServiceFacade;
import kr.co.seoulit.erp.logi.logiBase.to.ProductionLineTO;
import kr.co.seoulit.erp.logi.purchase.to.ItemTO;

/************************************************************************
@Package		kr.co.seoulit.erp.logi.logiBase.controller
@Class			ProductionLineController.java
@Author			JYP
@Description	생산관리
@Create			2019.05.20
@Last Update    
************************************************************************/

@Controller
public class ProductionLineController {
	@Autowired
	private LogiBaseServiceFacade logiBaseServiceFacade;
	@Autowired
	private DatasetBeanMapper datasetBeanMapper;

	
	//생산라인 조회
	@RequestMapping("logi/logiBase/findProductionLineList.do")
	public void findProductionLineList(HttpServletRequest request, HttpServletResponse response) throws Exception{
		
		PlatformData outData = (PlatformData) request.getAttribute("outData");
		
		List<ProductionLineTO> productionLineList = logiBaseServiceFacade.findProductionLineList();
		//System.out.println(productionLineList.get(0).getDailyAvrgPrdct());
		datasetBeanMapper.beansToDataset(outData, productionLineList, ProductionLineTO.class);
	}
	
	
	//저장
	@RequestMapping("logi/logiBase/batchProductionLine.do")
	public void batchProductionLine(HttpServletRequest request, HttpServletResponse response) throws Exception{
		PlatformData inData = (PlatformData) request.getAttribute("inData");
		//시퀀스 부르는 변수 inData로 받아야함
		

		List<ProductionLineTO> productionLineList = datasetBeanMapper.datasetToBeans(inData, ProductionLineTO.class);
		
		logiBaseServiceFacade.batchProductionLine(productionLineList);
	}

}
