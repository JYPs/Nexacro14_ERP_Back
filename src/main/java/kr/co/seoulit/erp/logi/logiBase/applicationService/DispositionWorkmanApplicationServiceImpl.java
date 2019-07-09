package kr.co.seoulit.erp.logi.logiBase.applicationService;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import kr.co.seoulit.erp.logi.logiBase.dao.DispositionWorkmanDAO;
import kr.co.seoulit.erp.logi.logiBase.to.DispositionWorkTO;

@Component
public class DispositionWorkmanApplicationServiceImpl implements DispositionWorkmanApplicationService {

	@Autowired
	DispositionWorkmanDAO dispositionWorkmanDAO;
	
	@Override
	public List<DispositionWorkTO> findDispositionWorkman(Map<String, String> params) {
		return dispositionWorkmanDAO.selectDispositionWorkmans(params);
	}
}
