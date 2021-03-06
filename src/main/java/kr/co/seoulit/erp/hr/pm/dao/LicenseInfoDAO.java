package kr.co.seoulit.erp.hr.pm.dao;

import java.util.List;

import kr.co.seoulit.erp.hr.pm.to.LicenseInfoTO;

public interface LicenseInfoDAO {
	public List<LicenseInfoTO> selectLicenseInfoAll();
	
	public void insertLicenseInfo(LicenseInfoTO licenseInfoTO);
	public void updateLicenseInfo(LicenseInfoTO licenseInfoTO);
	public void deleteLicenseInfo(LicenseInfoTO licenseInfoTO);
	
}
