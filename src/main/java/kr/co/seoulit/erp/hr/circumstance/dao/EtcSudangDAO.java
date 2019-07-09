package kr.co.seoulit.erp.hr.circumstance.dao;

import java.util.List;

import kr.co.seoulit.erp.hr.circumstance.to.EtcSudangTO;

public interface EtcSudangDAO {

	public List<EtcSudangTO> selectEtcSudangList();

	public void insertEtcSudang(EtcSudangTO etcSudangTO);

	public void updateEtcSudang(EtcSudangTO etcSudangTO);

	public void deleteEtcSudang(EtcSudangTO etcSudangTO);

}
