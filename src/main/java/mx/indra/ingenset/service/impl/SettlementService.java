package mx.indra.ingenset.service.impl;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import mx.indra.ingenset.beans.SettlementRequestBean;
import mx.indra.ingenset.mappers.SettlementMapper;
import mx.indra.ingenset.service.ISettlementService;

@Service("settlementService")
public class SettlementService implements ISettlementService {
	
	static final Logger logger = Logger.getLogger(SettlementService.class);
	
	@Resource
	private SettlementMapper settlementMapper;

	@Override
	public void deleteSettlementForContractID(SettlementRequestBean settlementBean) {

		String method = "deleteSettlementForContractID";
		logger.info("Service :: SettlementService :: " + method);
		
		this.settlementMapper.deleteSettlementForContractID(settlementBean);
		
	}
	
	@Override
	public void deleteDealForContractID(Integer contractID) {

		String method = "deleteDealForContractID";
		logger.info("Service :: SettlementService :: " + method);
		
		// deleteFromDealState
		this.settlementMapper.deleteFromDealState(contractID);
		// deleteFromDealDecl
		this.settlementMapper.deleteFromDealDecl(contractID);
		// deleteFromDealOtherInfo
		this.settlementMapper.deleteFromDealOtherInfo(contractID);
		// deleteFromDealMasterAgr
		this.settlementMapper.deleteFromDealMasterAgr(contractID);
		// deleteFromDealContract
		this.settlementMapper.deleteFromDealContract(contractID);
		// deleteFromDeal
		this.settlementMapper.deleteFromDeal(contractID);
		// deleteFromTrdCenDealParam
		this.settlementMapper.deleteFromTrdCenDealParam(contractID);

	}

}
