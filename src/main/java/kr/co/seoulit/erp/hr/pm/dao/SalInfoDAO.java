package kr.co.seoulit.erp.hr.pm.dao;

import java.util.List;

import kr.co.seoulit.erp.hr.pm.to.SalInfoTO;

public interface SalInfoDAO {
    public List<SalInfoTO> selectSalInfoAll();
    
    public void updateSalInfo(SalInfoTO salInfoTO);
}
