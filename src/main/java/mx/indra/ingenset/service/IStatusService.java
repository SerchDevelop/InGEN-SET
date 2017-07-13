package mx.indra.ingenset.service;

import java.util.List;

import mx.indra.ingenset.beans.ShadowInvStateBean;
import mx.indra.ingenset.beans.StatusRequestBean;

public interface IStatusService {
	
	public void changeStatusSettlement(StatusRequestBean statusBean);
	
	public List<ShadowInvStateBean> getDataShadowInvoice(StatusRequestBean statusBean);

}
