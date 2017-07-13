package mx.indra.ingenset.mappers;

import org.apache.ibatis.annotations.Param;

import mx.indra.ingenset.beans.SettlementRequestBean;

public interface SettlementMapper {
	
	public void deleteSettlementForContractID(
			@Param(value="settlementBean") SettlementRequestBean settlementBean);

	public void deleteFromDealState(
			@Param(value="contractID") Integer contractID);
	
	public void deleteFromDealDecl(
			@Param(value="contractID") Integer contractID);
	
	public void deleteFromDealOtherInfo(
			@Param(value="contractID") Integer contractID);
	
	public void deleteFromDealMasterAgr(
			@Param(value="contractID") Integer contractID);
	
	public void deleteFromDealContract(
			@Param(value="contractID") Integer contractID);
	
	public void deleteFromDeal(
			@Param(value="contractID") Integer contractID);
	
	public void deleteFromTrdCenDealParam(
			@Param(value="contractID") Integer contractID);

}
