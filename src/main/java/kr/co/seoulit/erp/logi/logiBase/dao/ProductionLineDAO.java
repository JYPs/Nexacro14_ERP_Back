package kr.co.seoulit.erp.logi.logiBase.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.co.seoulit.erp.logi.logiBase.to.ProductionLineTO;

@Repository
public interface ProductionLineDAO {

	public List<ProductionLineTO> selectProductionLineList();
	
	//-------------------------
	//생산라인수정
	public void updateProductionLine(ProductionLineTO productionLineTO);

	//생산라인등록
	public void insertProductionLine(ProductionLineTO productionLineTO);

	//생산라인삭제
	public void deleteProductionLine(ProductionLineTO productionLineTO);
}
