package kr.co.seoulit.erp.sys.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.seoulit.erp.sys.to.BusinessPlaceTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nexacro.xapi.data.PlatformData;

import kr.co.seoulit.common.mapper.DatasetBeanMapper;
import kr.co.seoulit.erp.sys.serviceFacade.BaseServiceFacade;

@Controller
public class BusinessPlaceController {

	@Autowired
	private BaseServiceFacade baseServiceFacade;

	@Autowired
	private DatasetBeanMapper datasetBeanMapper;

	@RequestMapping("sys/findBusinessPlaceList.do")
	public String findBusinessPlaceList(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PlatformData outData = (PlatformData) request.getAttribute("outData");

		List<BusinessPlaceTO> businessPlaceList = baseServiceFacade.findBusinessPlaceList();
		datasetBeanMapper.beansToDataset(outData, businessPlaceList, BusinessPlaceTO.class);
		return "dataSetView";
	}
	
	@RequestMapping("sys/batchBusinessPlace.do")
	public void batchBusinessPlace(HttpServletRequest request, HttpServletResponse response)throws Exception {
		PlatformData inData = (PlatformData) request.getAttribute("inData");
		List<BusinessPlaceTO> batchBusinessPlaceList=datasetBeanMapper.datasetToBeans(inData, BusinessPlaceTO.class);
	    baseServiceFacade.batchBusinessPlace(batchBusinessPlaceList);
	    findBusinessPlaceList(request,response);
		
	}
}