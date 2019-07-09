package kr.co.seoulit.erp.sys.dao;

import java.util.List;

import kr.co.seoulit.erp.sys.to.CompanyTO;


public interface CompanyDAO {
	public List<CompanyTO> selectCompanyList();
	// 회사정보 조회
	public void updateCompanyInfo(CompanyTO companyTO);
	
}
