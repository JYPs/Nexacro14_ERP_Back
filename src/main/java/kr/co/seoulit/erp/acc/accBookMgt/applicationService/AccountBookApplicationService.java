package kr.co.seoulit.erp.acc.accBookMgt.applicationService;

import java.util.List;
import java.util.Map;

import kr.co.seoulit.erp.acc.accBookMgt.to.AccountantTO;

public interface AccountBookApplicationService {
	public List<AccountantTO> findAccountantList(Map<String, Object> map);
}
//주석 테스트 (병훈) 테스트111222