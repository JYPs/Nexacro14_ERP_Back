package kr.co.seoulit.erp.logi.logiBase.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nexacro.xapi.data.PlatformData;

import kr.co.seoulit.common.mapper.DatasetBeanMapper;
import kr.co.seoulit.erp.logi.logiBase.serviceFacade.LogiBaseServiceFacade;
import kr.co.seoulit.erp.logi.logiBase.to.DispositionWorkTO;
import kr.co.seoulit.erp.logi.logiBase.to.FactoryPLTO;
import kr.co.seoulit.erp.logi.logiBase.to.FactoryTO;

/************************************************************************
 * @Package kr.co.seoulit.erp.logi.production.controller
 * @Class Factory.java
 * @Author 홍재
 * @Description 공장관리
 * @Create 2019.05.20
 * @Last Update 2019.05.22 findFactoryProductionLines 메서드 추가
 ************************************************************************/

@Controller
public class FactoryController {

	@Autowired
	private LogiBaseServiceFacade logiBaseServiceFacade;
	@Autowired
	private DatasetBeanMapper datasetBeanMapper;

	// Factory
	// ************************************************************************

	@RequestMapping("logi/logiBase/findFactoryList.do")
	public void findFactoryList(HttpServletRequest request, HttpServletResponse response) throws Exception {

		PlatformData inData = (PlatformData) request.getAttribute("inData");
		PlatformData outData = (PlatformData) request.getAttribute("outData");

		// all로 받아오면 그냥 상관없이 가지고오는 것입니다.
		String itemCode = inData.getVariable("itemCode").getString();

		System.out.println("1111111111111");
		List<FactoryTO> factoryList = logiBaseServiceFacade.findFactoryList(itemCode);

		datasetBeanMapper.beansToDataset(outData, factoryList, FactoryTO.class);

	}

	@RequestMapping("logi/logiBase/registerFactory.do")
	public void registerFactory(HttpServletRequest request, HttpServletResponse response) throws Exception {

		PlatformData inData = (PlatformData) request.getAttribute("inData");
		List<FactoryTO> factoryList = datasetBeanMapper.datasetToBeans(inData, FactoryTO.class);
		logiBaseServiceFacade.registerFactory(factoryList);

	}
	// FactoryProductionLine
	// ************************************************************************

	@RequestMapping("logi/logiBase/findFactoryProductionLines.do")
	public void findFactoryProductionLines(HttpServletRequest request, HttpServletResponse response) throws Exception {

		PlatformData inData = (PlatformData) request.getAttribute("inData");
		PlatformData outData = (PlatformData) request.getAttribute("outData");

		Map<String, String> params = new HashMap<>();
		String code = inData.getVariable("code").getString();
		params.put("code", code);
		String factoryCode = null;
		String workInstructionNo = null;
		//System.out.println("fffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff : " + code);
		if (code.equals("factoryCode")) {
			factoryCode = inData.getVariable("factoryCode").getString();
			params.put("factoryCode", factoryCode);
		} else if (code == "workInstructionNo" || code.equals("workInstructionNo")) {
			workInstructionNo = inData.getVariable("workInstructionNo").getString();
			params.put("workInstructionNo", workInstructionNo);
		} 
		System.out.println("===========>" + factoryCode);
		// 너무 길어서 줄일께요...
		List<FactoryPLTO> fplList = logiBaseServiceFacade.findFactoryProductionLines(params);
		datasetBeanMapper.beansToDataset(outData, fplList, FactoryPLTO.class);

	}

	@RequestMapping("logi/logiBase/registerFactoryPLs.do")
	public void registerFactoryPLs(HttpServletRequest request, HttpServletResponse response) throws Exception {

		PlatformData inData = (PlatformData) request.getAttribute("inData");
		List<FactoryPLTO> factoryPLList = datasetBeanMapper.datasetToBeans(inData, FactoryPLTO.class);

		logiBaseServiceFacade.registerFactoryPL(factoryPLList);

	}

	// DispositionOfWorkman
	// ************************************************************************
	@RequestMapping("logi/logiBase/findDispositionOfWorkman.do")
	public void findDispositionOfWorkman(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PlatformData inData = (PlatformData) request.getAttribute("inData");
		PlatformData outData = (PlatformData) request.getAttribute("outData");
		
		String code = inData.getVariable("code").getString();
		String factoryCode = inData.getVariable("factoryCode").getString();

		String fPLNo = inData.getVariable("fPLNo").getString();
		Map<String, String> params = new HashMap<>();
		params.put("code", code);
		params.put("factoryCode", factoryCode);
		params.put("fPLNo", fPLNo);
		

		List<DispositionWorkTO> dispositionList = logiBaseServiceFacade.findDispositionWorkman(params);
		datasetBeanMapper.beansToDataset(outData, dispositionList, DispositionWorkTO.class);
	}
}
