package kr.co.seoulit.erp.sys.dao;

import java.util.List;

import kr.co.seoulit.erp.sys.to.MenuTO;

public interface MenuDAO {

	public List<MenuTO> selectMenuList();
}
