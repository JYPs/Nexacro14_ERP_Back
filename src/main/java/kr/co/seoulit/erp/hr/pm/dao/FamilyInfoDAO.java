package kr.co.seoulit.erp.hr.pm.dao;

import java.util.List;

import kr.co.seoulit.erp.hr.pm.to.FamilyInfoTO;

public interface FamilyInfoDAO {
	public List<FamilyInfoTO> selectFamilyInfoAll();
	
	public void insertFamilyInfo(FamilyInfoTO familyInfoTO);
	public void updateFamilyInfo(FamilyInfoTO familyInfoTO);
	public void deleteFamilyInfo(FamilyInfoTO familyInfoTO);
	
}
