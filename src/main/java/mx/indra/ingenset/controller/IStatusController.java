package mx.indra.ingenset.controller;

import java.util.List;

import mx.indra.ingenset.beans.ShadowInvStateBean;
import mx.indra.ingenset.beans.StatusRequestBean;

public interface IStatusController {
	
	public void changeStatusSettlement(StatusRequestBean statusBean);
	
	public List<ShadowInvStateBean> getDataShadowInvoice(StatusRequestBean statusBean);

}
