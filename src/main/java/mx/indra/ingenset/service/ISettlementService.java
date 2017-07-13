package mx.indra.ingenset.service;

import mx.indra.ingenset.beans.SettlementRequestBean;

public interface ISettlementService {
	
	public void deleteSettlementForContractID(SettlementRequestBean settlementBean);
	
	public void deleteDealForContractID(Integer contractID);

}
