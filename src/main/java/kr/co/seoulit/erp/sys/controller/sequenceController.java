package kr.co.seoulit.erp.sys.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.seoulit.erp.sys.serviceFacade.BaseServiceFacade;
import kr.co.seoulit.erp.sys.to.SequenceTo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nexacro.xapi.data.PlatformData;

import kr.co.seoulit.common.mapper.DatasetBeanMapper;

@Controller
public class sequenceController {

	@Autowired
	private BaseServiceFacade baseServiceFacade;

	@Autowired
	private DatasetBeanMapper datasetBeanMapper;


	
	@RequestMapping("sys/findSequenceNo.do")
	public String findSequenceNo(HttpServletRequest request, HttpServletResponse response) throws Exception {
		SequenceTo seqTo=new SequenceTo();
		PlatformData inData = (PlatformData) request.getAttribute("inData");
		PlatformData outData = (PlatformData) request.getAttribute("outData");
		String findSeq = inData.getVariable("findSeq").getString();
		System.out.println("@@@"+findSeq);
		String squenceNo = baseServiceFacade.findSequenceNo(findSeq);
		
		/********************************************************************************                                                                            
		@Path			물류              				   				
		@Description	필요없는 코드 주석
		@Author	  		박주영		                        								                                            
		@Create         2019. 05. 17.                             		                    				                                            
		********************************************************************************/
		// 현재 필요없는 코드(2019. 05. 17)
		/*seqTo.setSeqNo(squenceNo);
		datasetBeanMapper.beanToDataset(outData, seqTo, SequenceTo.class);*/
		outData.getVariableList().add("squenceNo", squenceNo);
		return "dataSetView";

	}

}