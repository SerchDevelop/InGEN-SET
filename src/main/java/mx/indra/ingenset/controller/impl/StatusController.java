package mx.indra.ingenset.controller.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import mx.indra.ingenset.beans.ShadowInvStateBean;
import mx.indra.ingenset.beans.StatusRequestBean;
import mx.indra.ingenset.controller.IStatusController;
import mx.indra.ingenset.service.IStatusService;

@Controller
@RequestMapping("/api/status")
public class StatusController implements IStatusController {
	
	static final Logger logger = Logger.getLogger(StatusController.class);
	
	@Autowired
	IStatusService statusService;
	
	@RequestMapping(value = "/change", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody void changeStatusSettlement(
			@RequestBody StatusRequestBean statusBean){
		
		String method = "changeStatusSettlement";
		logger.info("Controller :: StatusController :: " + method);
		
		statusService.changeStatusSettlement(statusBean);

	}

	@RequestMapping(value = "/getData", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<ShadowInvStateBean> getDataShadowInvoice(
			@RequestBody StatusRequestBean statusBean){
		
		String method = "getDataShadowInvoice";
		logger.info("Controller :: StatusController :: " + method);
		System.out.println("contractID :: " + statusBean.getContractID());
		System.out.println("statusChange :: " + statusBean.getStatusToChange());
		for (String fecha : statusBean.getFechaChange()) {
			System.out.println("fecha :: " + fecha);
		}
		
		return statusService.getDataShadowInvoice(statusBean);

	}

}
