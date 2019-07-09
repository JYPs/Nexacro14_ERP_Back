package kr.co.seoulit.erp.acc.accBookMgt.serviceFacade;

import java.util.List;
import java.util.Map;

import kr.co.seoulit.erp.acc.accBookMgt.to.AccountantTO;

public interface AccountBookServiceFacade {
	public List<AccountantTO> findAccountantList(Map<String,Object> map);
}
