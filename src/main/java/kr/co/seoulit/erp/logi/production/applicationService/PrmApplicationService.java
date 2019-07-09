package kr.co.seoulit.erp.logi.production.applicationService;

import java.util.List;

import kr.co.seoulit.erp.logi.production.to.PrmTO;

public interface PrmApplicationService {

	List<PrmTO> findPrmList();

	void registPrm(String empCode, List<PrmTO> prmList);

}
