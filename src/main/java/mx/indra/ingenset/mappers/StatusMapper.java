package mx.indra.ingenset.mappers;

import org.apache.ibatis.annotations.Param;

import mx.indra.ingenset.beans.ShadowInvStateBean;
import mx.indra.ingenset.beans.StatusRequestBean;

public interface StatusMapper {
	
	public ShadowInvStateBean getDataShadowInvoice(
			@Param(value="statusBean") StatusRequestBean statusBean);
	
	public void insertChangeStatus(
			@Param(value="statusBean") StatusRequestBean statusBean);

}
