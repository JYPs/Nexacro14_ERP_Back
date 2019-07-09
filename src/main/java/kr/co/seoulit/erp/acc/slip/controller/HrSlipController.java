package kr.co.seoulit.erp.acc.slip.controller;
/**
 * @Package  com.seoul.erp.common.acc
 * @Class    HrSlipController.java
 * @Create   2019. 03. 2.
 * @Author   허용석
 * @Description 인사전표관련 컨트롤러 클래스
 *
 */
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.seoulit.erp.acc.slip.serviceFacade.SlipServiceFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nexacro.xapi.data.PlatformData;

import kr.co.seoulit.common.mapper.DatasetBeanMapper;

@Controller
public class HrSlipController{

	@Autowired
	private SlipServiceFacade slipServiceFacade;

	@Autowired
	private DatasetBeanMapper datasetBeanMapper;


	@RequestMapping("acc/slip/registHrSlipList.do")
	public void registLogiSlipList(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PlatformData inData = (PlatformData) request.getAttribute("inData");
		PlatformData outData = (PlatformData) request.getAttribute("outData");
		HashMap<String,Object> hrSlipMap=new HashMap<>();
		String deptCode = inData.getVariable("deptCode").getString();
		String empCode = inData.getVariable("empCode").getString();
		String paymentDate = inData.getVariable("paymentDate").getString();

		hrSlipMap.put("deptCode", deptCode);
		hrSlipMap.put("empCode", empCode);
		hrSlipMap.put("paymentDate", paymentDate);

		slipServiceFacade.registHrSlipList(hrSlipMap);
		//String errorMsg=(String)hrSlipMap.get("errorMsg");
		//outData.getVariableList().add("errorMsg", errorMsg);
	}

}
