package kr.co.seoulit.erp.acc.accBookMgt.serviceFacade;

import java.util.List;
import java.util.Map;

import kr.co.seoulit.erp.acc.accBookMgt.applicationService.AccountBookApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.seoulit.erp.acc.accBookMgt.to.AccountantTO;

@Service
public class AccountBookServiceFacadeImpl implements AccountBookServiceFacade {

	@Autowired
	private AccountBookApplicationService accountBookApplicationService;

	@Override
	public List<AccountantTO> findAccountantList(Map<String, Object> map) {
		return accountBookApplicationService.findAccountantList(map);
	}

}
