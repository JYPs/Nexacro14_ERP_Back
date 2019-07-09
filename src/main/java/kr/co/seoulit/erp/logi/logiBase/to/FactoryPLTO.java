package kr.co.seoulit.erp.logi.logiBase.to;

import kr.co.seoulit.common.annotation.Dataset;
import kr.co.seoulit.common.to.BaseTO;

@Dataset(name = "ds_factoryPL")
public class FactoryPLTO extends BaseTO {

	private String factoryCode, factoryProductionLineNo, productionLineCode, availableStatus, productCode, jobGoalCount,
			productionCount, jobEndDate, workInstructionNo;

	public String getWorkInstructionNo() {
		return workInstructionNo;
	}

	public void setWorkInstructionNo(String workInstructionNo) {
		this.workInstructionNo = workInstructionNo;
	}

	public String getFactoryCode() {
		return factoryCode;
	}

	public void setFactoryCode(String factoryCode) {
		this.factoryCode = factoryCode;
	}

	public String getFactoryProductionLineNo() {
		return factoryProductionLineNo;
	}

	public void setFactoryProductionLineNo(String factoryProductionLineNo) {
		this.factoryProductionLineNo = factoryProductionLineNo;
	}

	public String getProductionLineCode() {
		return productionLineCode;
	}

	public void setProductionLineCode(String productionLineCode) {
		this.productionLineCode = productionLineCode;
	}

	public String getAvailableStatus() {
		return availableStatus;
	}

	public void setAvailableStatus(String availableStatus) {
		this.availableStatus = availableStatus;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getJobGoalCount() {
		return jobGoalCount;
	}

	public void setJobGoalCount(String jobGoalCount) {
		this.jobGoalCount = jobGoalCount;
	}

	public String getProductionCount() {
		return productionCount;
	}

	public void setProductionCount(String productionCount) {
		this.productionCount = productionCount;
	}

	public String getJobEndDate() {
		return jobEndDate;
	}

	public void setJobEndDate(String jobEndDate) {
		this.jobEndDate = jobEndDate;
	}

}