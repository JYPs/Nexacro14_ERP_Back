package kr.co.seoulit.erp.sys.dao;

import java.util.List;
import java.util.Map;

import kr.co.seoulit.erp.sys.to.DepartmentTO;

public interface DepartmentDAO{

	public List<DepartmentTO> selectDepartmentList(Map<String,Object> vList);
	
	public List<DepartmentTO> selectAllDeptList();
	
	public void insertDept(DepartmentTO departmentTO);
	
	public void updateDept(DepartmentTO departmentTO);
	
	public void deleteDept(DepartmentTO departmentTO);
	

}
