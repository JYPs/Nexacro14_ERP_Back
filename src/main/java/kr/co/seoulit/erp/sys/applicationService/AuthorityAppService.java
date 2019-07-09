package kr.co.seoulit.erp.sys.applicationService;

import java.util.List;

import kr.co.seoulit.erp.sys.to.AuthorityTO;
import kr.co.seoulit.erp.sys.to.MenuAuthorityTO;

public interface AuthorityAppService {
    public List<MenuAuthorityTO> findMenuAuthorityList(String authorityCode);
    public List<AuthorityTO> findAuthorityList();

}