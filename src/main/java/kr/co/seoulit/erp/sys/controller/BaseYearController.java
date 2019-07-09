package kr.co.seoulit.erp.sys.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.seoulit.erp.sys.to.BaseYearTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nexacro.xapi.data.PlatformData;

import kr.co.seoulit.common.mapper.DatasetBeanMapper;
import kr.co.seoulit.erp.sys.serviceFacade.BaseServiceFacade;

@Controller
public class BaseYearController {

	@Autowired
	private BaseServiceFacade baseServiceFacade;

	@Autowired
	private DatasetBeanMapper datasetBeanMapper;
	@RequestMapping("sys/findBaseYearList.do")
	public String findBaseYearList(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PlatformData inData = (PlatformData) request.getAttribute("inData");
		PlatformData outData = (PlatformData) request.getAttribute("outData");

		Map<String,Object> vList=new HashMap<>();

		String businessPlaceCode=inData.getVariable("businessPlaceCode").getString().toUpperCase();;

		vList.put("businessPlaceCode", businessPlaceCode);

		List<BaseYearTO> baseYearList = baseServiceFacade.findBaseYearList(vList);

		datasetBeanMapper.beansToDataset(outData, baseYearList, BaseYearTO.class);

		return "dataSetView";
	}

}