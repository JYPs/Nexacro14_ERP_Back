package kr.co.seoulit.erp.sys.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.seoulit.erp.sys.serviceFacade.BaseServiceFacade;
import kr.co.seoulit.erp.sys.to.CodeDetailTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nexacro.xapi.data.PlatformData;

import kr.co.seoulit.common.mapper.DatasetBeanMapper;


@Controller
public class CodeDetailController {

	@Autowired
	private BaseServiceFacade baseServiceFacade;

	@Autowired
	private DatasetBeanMapper datasetBeanMapper;

	@RequestMapping("sys/findCodeDetailList.do")
	public void findCodeDetailList(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PlatformData outData = (PlatformData) request.getAttribute("outData");

		List<CodeDetailTO> codeDetailList = baseServiceFacade.findCodeDetailList();

		datasetBeanMapper.beansToDataset(outData, codeDetailList, CodeDetailTO.class);

	}
	@RequestMapping("sys/batchDetailCode.do")
	public void batchDetailCode(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PlatformData inData = (PlatformData) request.getAttribute("inData");
		List<CodeDetailTO> codeDetailList=datasetBeanMapper.datasetToBeans(inData, CodeDetailTO.class);

		baseServiceFacade.batchDetailCodeProcess(codeDetailList);
	}
}
