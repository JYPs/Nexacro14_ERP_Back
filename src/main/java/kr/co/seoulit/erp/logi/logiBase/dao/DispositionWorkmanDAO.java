package kr.co.seoulit.erp.logi.logiBase.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import kr.co.seoulit.erp.logi.logiBase.to.DispositionWorkTO;


@Repository
public interface DispositionWorkmanDAO {
	public List<DispositionWorkTO> selectDispositionWorkmans(Map<String, String> param);
}
