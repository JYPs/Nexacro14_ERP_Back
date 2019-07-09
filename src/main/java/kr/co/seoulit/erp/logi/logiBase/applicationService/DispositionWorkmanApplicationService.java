package kr.co.seoulit.erp.logi.logiBase.applicationService;

import java.util.List;
import java.util.Map;

import kr.co.seoulit.erp.logi.logiBase.to.DispositionWorkTO;

public interface DispositionWorkmanApplicationService {
	public List<DispositionWorkTO> findDispositionWorkman(Map<String, String> params);
}
