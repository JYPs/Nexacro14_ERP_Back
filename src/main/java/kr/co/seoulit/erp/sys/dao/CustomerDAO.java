package kr.co.seoulit.erp.sys.dao;

import java.util.List;
import kr.co.seoulit.erp.sys.to.CustomerTO;

public interface CustomerDAO {
	public List<CustomerTO> selectCustomerList();
	// 코드 리스트 조회
	
	public void insertCustomer(CustomerTO customerTO);
	
	public void updateCustomer(CustomerTO customerTO);
	
	public void deleteCustomer(CustomerTO customerTO);
}
