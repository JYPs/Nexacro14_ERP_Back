package kr.co.seoulit.erp.acc.accSubMgt.applicationService;

import java.util.List;

import kr.co.seoulit.erp.acc.accSubMgt.to.ParentAccountSummaryTO;
import kr.co.seoulit.erp.acc.accSubMgt.to.AccountSummaryTO;
import kr.co.seoulit.erp.acc.accSubMgt.to.AccountTO;


public interface AcBaseApplicationService {
	
	public List<ParentAccountSummaryTO> findParentAccountList();
	
	public List<AccountTO> findAccountList();
	
	public List<AccountSummaryTO> findAccountSummaryList();
	public void modifyAccountSummaryList(List<AccountSummaryTO> accountSummaryList);
	

}
