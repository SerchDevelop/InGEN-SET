package mx.indra.ingenset.controller.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import mx.indra.ingenset.beans.SettlementRequestBean;
import mx.indra.ingenset.controller.ISettlementController;
import mx.indra.ingenset.service.ISettlementService;

@Controller
@RequestMapping("/api/settlement")
public class SettlementController implements ISettlementController {
	
	static final Logger logger = Logger.getLogger(SettlementController.class);
	
	@Autowired
	ISettlementService settlementService;
	
	@RequestMapping(value = "/delete/settlementForContractID", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody void deleteSettlementForContractID(
			@RequestBody SettlementRequestBean settlementBean){
		
		String method = "deleteSettlementForContractID";
		logger.info("Controller :: SettlementController :: " + method);
		
		settlementService.deleteSettlementForContractID(settlementBean);

	}
	
	@RequestMapping(value = "/delete/deal/{contractID}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody void deleteDealForContractID(
			@PathVariable("contractID") Integer contractID){
		
		String method = "deleteDealForContractID";
		logger.info("Controller :: SettlementController :: " + method);
		
		settlementService.deleteDealForContractID(contractID);

	}
	
}
