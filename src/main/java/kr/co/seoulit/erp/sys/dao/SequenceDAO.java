package kr.co.seoulit.erp.sys.dao;

import java.util.HashMap;
import java.util.List;

import kr.co.seoulit.erp.sys.to.CodeTO;

public interface SequenceDAO{

//	public List<CodeTO> selectCodeList();
	// 코드 리스트 조회

	public String selectSequenceNo(HashMap<String, Object> takeSeq);

}
