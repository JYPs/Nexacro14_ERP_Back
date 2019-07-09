package kr.co.seoulit.erp.sys.dao;

import java.util.List;

import kr.co.seoulit.erp.sys.to.AuthorityTO;
import kr.co.seoulit.erp.sys.to.MenuAuthorityTO;

public interface AuthorityDAO{

	public List<MenuAuthorityTO> selectMenuAuthorityList(String authorityCode);

	public List<AuthorityTO> selectAuthorityList();

}
