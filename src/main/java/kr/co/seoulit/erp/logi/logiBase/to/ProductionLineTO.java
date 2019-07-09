package kr.co.seoulit.erp.logi.logiBase.to;

import kr.co.seoulit.common.annotation.Dataset;
import kr.co.seoulit.common.to.BaseTO;

@Dataset(name="ds_productionLine")
public class ProductionLineTO extends BaseTO{
	private String productionLineCode, productableItemCode, minAvlStaff, maxAvlStaff, dailyAvrgPrdct;

	public String getProductionLineCode() {
		return productionLineCode;
	}

	public void setProductionLineCode(String productionLineCode) {
		this.productionLineCode = productionLineCode;
	}

	public String getProductableItemCode() {
		return productableItemCode;
	}

	public void setProductableItemCode(String productableItemCode) {
		this.productableItemCode = productableItemCode;
	}

	public String getMinAvlStaff() {
		return minAvlStaff;
	}

	public void setMinAvlStaff(String minAvlStaff) {
		this.minAvlStaff = minAvlStaff;
	}

	public String getMaxAvlStaff() {
		return maxAvlStaff;
	}

	public void setMaxAvlStaff(String maxAvlStaff) {
		this.maxAvlStaff = maxAvlStaff;
	}

	public String getDailyAvrgPrdct() {
		return dailyAvrgPrdct;
	}

	public void setDailyAvrgPrdct(String dailyAvrgPrdct) {
		this.dailyAvrgPrdct = dailyAvrgPrdct;
	}

	@Override
	public String toString() {
		return "ProductionLineTO [productionLineCode=" + productionLineCode + ", productableItemCode="
				+ productableItemCode + ", minAvlStaff=" + minAvlStaff + ", maxAvlStaff=" + maxAvlStaff
				+ ", dailyAvrgPrdct=" + dailyAvrgPrdct + "]";
	}
	
	
}
