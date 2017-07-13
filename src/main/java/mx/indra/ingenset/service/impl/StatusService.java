package mx.indra.ingenset.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import mx.indra.ingenset.beans.ShadowInvStateBean;
import mx.indra.ingenset.beans.StatusRequestBean;
import mx.indra.ingenset.mappers.StatusMapper;
import mx.indra.ingenset.service.IStatusService;

@Service("statusService")
public class StatusService implements IStatusService {
	
	static final Logger logger = Logger.getLogger(StatusService.class);
	
	@Resource
	private StatusMapper statusMapper;

	@Override
	public void changeStatusSettlement(StatusRequestBean statusBean) {

		String method = "changeStatusSettlement";
		logger.info("Service :: StatusService :: " + method);
		
		for (String fecha : statusBean.getFechaChange()) {
			statusBean.setFechaParam(fecha);
			this.statusMapper.insertChangeStatus(statusBean);
			
		}
		
	}
	
	@Override
	public List<ShadowInvStateBean> getDataShadowInvoice(StatusRequestBean statusBean) {

		String method = "getDataShadowInvoice";
		logger.info("Service :: StatusService :: " + method);
		
		List<ShadowInvStateBean> listBean = new ArrayList<ShadowInvStateBean>();
		
		for (String fecha : statusBean.getFechaChange()) {
			statusBean.setFechaParam(fecha);
			listBean.add(this.statusMapper.getDataShadowInvoice(statusBean));
			
		}
		
		return listBean;
	}

}
