package mx.indra.ingenset.controller;

import mx.indra.ingenset.beans.SettlementRequestBean;

public interface ISettlementController {
	
	public void deleteSettlementForContractID(SettlementRequestBean settlementBean);
	
	public void deleteDealForContractID(Integer contractID);

}
