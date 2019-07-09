package kr.co.seoulit.erp.hr.pm.dao;

import java.util.List;

import kr.co.seoulit.erp.hr.pm.to.EmployeeTO;

public interface EmployeeDAO {

	public List<EmployeeTO> selectEmployeeList();

	public EmployeeTO selectEmployee(String empCode);

	public void insertEmployee(EmployeeTO employee);

	public void updateEmployee(EmployeeTO employee);

	public void deleteEmployee(EmployeeTO employee);
}
