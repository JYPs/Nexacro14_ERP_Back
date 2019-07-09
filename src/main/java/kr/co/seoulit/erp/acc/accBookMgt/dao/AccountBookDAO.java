package kr.co.seoulit.erp.acc.accBookMgt.dao;

import java.util.List;
import java.util.Map;

import kr.co.seoulit.erp.acc.accBookMgt.to.AccountantTO;

public interface AccountBookDAO {
	public List<AccountantTO> selectAccountantList(Map<String,Object> map);
}
