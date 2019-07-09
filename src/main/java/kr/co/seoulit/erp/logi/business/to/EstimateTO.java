package kr.co.seoulit.erp.logi.business.to;

import java.util.List;

import kr.co.seoulit.common.annotation.Dataset;
import kr.co.seoulit.common.to.BaseTO;

@Dataset(name = "ds_estimate")
public class EstimateTO extends BaseTO {

	private String estimateNo, customerCode, estimateDate, contractStatus, estimateRequester,
		   effectiveDate, personCodeInCharge, description;
	private List<EstimateDetailTO> estimateDetailTOList;

	public String getEstimateNo() {
		return estimateNo;
	}

	public List<EstimateDetailTO> getEstimateDetailTOList() {
		return estimateDetailTOList;
	}

	public void setEstimateDetailTOList(List<EstimateDetailTO> estimateDetailTOList) {
		this.estimateDetailTOList = estimateDetailTOList;
	}

	public void setEstimateNo(String estimateNo) {
		this.estimateNo = estimateNo;
	}

	public String getCustomerCode() {
		return customerCode;
	}

	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}

	public String getEstimateDate() {
		return estimateDate;
	}

	public void setEstimateDate(String estimateDate) {
		this.estimateDate = estimateDate;
	}

	public String getContractStatus() {
		return contractStatus;
	}

	public void setContractStatus(String contractStatus) {
		this.contractStatus = contractStatus;
	}

	public String getEstimateRequester() {
		return estimateRequester;
	}

	public void setEstimateRequester(String estimateRequester) {
		this.estimateRequester = estimateRequester;
	}

	public String getEffectiveDate() {
		return effectiveDate;
	}

	public void setEffectiveDate(String effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public String getPersonCodeInCharge() {
		return personCodeInCharge;
	}

	public void setPersonCodeInCharge(String personCodeInCharge) {
		this.personCodeInCharge = personCodeInCharge;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}