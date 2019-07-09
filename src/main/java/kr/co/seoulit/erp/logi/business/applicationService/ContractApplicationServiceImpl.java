package kr.co.seoulit.erp.logi.business.applicationService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import kr.co.seoulit.erp.logi.business.dao.ContractDAO;
import kr.co.seoulit.erp.logi.business.dao.ContractDetailDAO;
import kr.co.seoulit.erp.logi.business.dao.EstimateDAO;
import kr.co.seoulit.erp.logi.business.to.ContractDetailTO;
import kr.co.seoulit.erp.logi.business.to.ContractTO;
import kr.co.seoulit.erp.logi.business.to.EstimateTO;

@Component
public class ContractApplicationServiceImpl implements ContractApplicationService {
	@Autowired
	private ContractDAO contractDAO;
	@Autowired
	private ContractDetailDAO contractDetailDAO;
	@Autowired
	private EstimateDAO estimateDAO;

	@Override
	public List<ContractTO> findContractList(HashMap<String, Object> searchDate) {
		// TODO Auto-generated method stub
		return contractDAO.selectContractList(searchDate);
	}

	@Override
	public List<ContractDetailTO> findContractDetailList(String contractNo) {
		// TODO Auto-generated method stub
		return contractDetailDAO.selectContractDetailList(contractNo);
	}

	@Override
	public List<ContractDetailTO> findAllContractDetailList() {
		// TODO Auto-generated method stub
		return contractDetailDAO.selectAllContractDetailList();
	}

	@Override
	public void batchContract(List<ContractTO> contractList, List<ContractDetailTO> contractDetailList) {
		// TODO Auto-generated method stub
		List<EstimateTO> estimateList = null;
		EstimateTO estimateTO = null;
		if (contractList != null) {
			estimateList = new ArrayList<>();

			for (ContractTO contractTO : contractList) {
				switch (contractTO.getStatus()) {
				case "inserted":
					contractDAO.insertContract(contractTO);
					//견적정보 없이 수주를 등록하는 경우는 estimate에 관여할 필요가 없으므로 여기서 필터링해줌
					if (contractTO.getEstimateNo() != "견적정보없음") {
						estimateTO = new EstimateTO();
						estimateTO.setEstimateNo(contractTO.getEstimateNo());
						estimateTO.setContractStatus("Y");
						estimateList.add(estimateTO);
					}
					break;
				case "updated":
					contractDAO.updateContract(contractTO);
					break;
				case "deleted":
					contractDAO.deleteContract(contractTO);
					estimateList = new ArrayList<>();
					
					if (contractTO.getEstimateNo() != "견적정보없음") {
						estimateTO = new EstimateTO();
						estimateTO.setEstimateNo(contractTO.getEstimateNo());
						estimateTO.setContractStatus("N");
						estimateList.add(estimateTO);
					}
					break;
				}
			}
		}

		for (ContractDetailTO contractDetailTO : contractDetailList) {
			System.out.println("++++++++++" + contractDetailTO.getStatus());
			System.out.println("++++++++++" + contractDetailTO.getSlipRegistStatus());
			switch (contractDetailTO.getStatus()) {
			case "inserted":
				contractDetailDAO.insertContractDetail(contractDetailTO);
			case "updated":
				contractDetailDAO.updateContractDetail(contractDetailTO);
				break;
			case "deleted":
				contractDetailDAO.deleteContractDetail(contractDetailTO);
				break;
			}
		}

		// contract가 들어갈때 estimate의 contractStatus 정보 수정
		if (estimateList != null) {
			for (EstimateTO eto : estimateList) {
				estimateDAO.updateEstimate(eto);
			}
		}
	}

	@Override
	public List<ContractDetailTO> findRangedContractDetailList(HashMap<String, Object> searchDate) {
		// TODO Auto-generated method stub
		return contractDetailDAO.selectRangedContractDetailList(searchDate);
	}

	@Override
	public List<ContractTO> findContractTo(String contractNo) {
		// TODO Auto-generated method stub
		return contractDAO.selectContractTo(contractNo);
	}
}
