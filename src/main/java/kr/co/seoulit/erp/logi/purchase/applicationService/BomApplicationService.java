package kr.co.seoulit.erp.logi.purchase.applicationService;

import java.util.List;

import kr.co.seoulit.erp.logi.purchase.to.BomDeployTO;
import kr.co.seoulit.erp.logi.purchase.to.BomTO;

public interface BomApplicationService {

	List<BomDeployTO> findBomDeployList(String itemCode, String condition);

	List<BomTO> findBomList();

}
