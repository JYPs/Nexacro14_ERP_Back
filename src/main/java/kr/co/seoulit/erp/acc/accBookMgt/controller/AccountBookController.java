package kr.co.seoulit.erp.acc.accBookMgt.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.seoulit.erp.acc.accBookMgt.serviceFacade.AccountBookServiceFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nexacro.xapi.data.PlatformData;

import kr.co.seoulit.erp.acc.accBookMgt.to.AccountantTO;
import kr.co.seoulit.common.mapper.DatasetBeanMapper;
@Controller
public class AccountBookController {
	@Autowired
	private AccountBookServiceFacade accountServiceFacade;

//	@SuppressWarnings("rawtypes")
	@Autowired
	private DatasetBeanMapper datasetBeanMapper;

//@SuppressWarnings("unchecked")
	@RequestMapping("acc/accBookMgt/AccountantList.do")
	public void findAccountantList(HttpServletRequest request, HttpServletResponse response) throws Exception {
//주석테스트 (병훈)
		PlatformData outData = (PlatformData) request.getAttribute("outData");

		PlatformData inData = (PlatformData) request.getAttribute("inData");

		String customerName = inData.getVariable("customerName").getString();

		String startDate = inData.getVariable("startDate").getString();

		String endDate = inData.getVariable("endDate").getString();

		Map<String, Object> map = new HashMap<>();

		map.put("customerName", customerName);

		map.put("startDate", startDate);

		map.put("endDate", endDate);

		List<AccountantTO> accountantList = accountServiceFacade.findAccountantList(map);

		datasetBeanMapper.beansToDataset(outData, accountantList, AccountantTO.class);

	}

}
