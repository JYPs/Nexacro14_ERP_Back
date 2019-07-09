package kr.co.seoulit.erp.acc.slip.serviceFacade;

import java.util.HashMap;
import java.util.List;

import kr.co.seoulit.erp.acc.slip.to.AccountControlDetailTO;
import kr.co.seoulit.erp.acc.slip.to.JournalDetailTO;
import kr.co.seoulit.erp.acc.slip.to.JournalTO;
import kr.co.seoulit.erp.acc.slip.to.SlipTO;
import kr.co.seoulit.erp.hr.circumstance.exception.CircumstanceException;
import kr.co.seoulit.erp.logi.business.to.ContractDetailTO;
import kr.co.seoulit.erp.logi.purchase.to.OrderDetailTO;


public interface SlipServiceFacade {

	//Slip
	public List<SlipTO> findSlipListByCondition(HashMap<String, Object> slipMap);
         //public List<SlipTO> findSlipByReportingDate( String reportingDate);
	public void batchSlipAndJournalAndJournalDetailInfo(List<SlipTO> slipInfo,List<JournalTO> journalInfo, List<JournalDetailTO> journalDetailInfo);
	public void modifyApprovalSlipList(List<SlipTO> slipInfo);

//Journal
	//public List<JournalTO> getJournalListForSlip(String slipNo);
	public List<JournalTO> findJournalList(HashMap<String, Object> journalDate);

	//JournalDetail
	    //public List<JournalDetailTO> getJournalDetailList();
	public List<JournalDetailTO> findJournalDetailByJournalNo(String journalNo) ;
	public List<AccountControlDetailTO> findAccountControlDetailList(String accountCode);
	     //public void batchJournalDetailInfo(List<JournalDetailTO> journalDetailList);
	//물류전표획득
	public List<ContractDetailTO> findContractSlipDetailList(HashMap<String, Object> logiSlipReq);

	public void registLogiSlipList(HashMap<String,Object> logiSlipMap);
	public List<OrderDetailTO> findOrderSlipDetailList(HashMap<String, Object> logiSlipReq);
	//인사전표획득
	public HashMap<String, Object> registHrSlipList(HashMap<String,Object> hrSlipMap) throws CircumstanceException;

}
