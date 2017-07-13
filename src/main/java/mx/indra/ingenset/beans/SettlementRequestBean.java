package mx.indra.ingenset.beans;

import java.io.Serializable;

public class SettlementRequestBean implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer contractID;
	private String date;

	public SettlementRequestBean(){
		
	}

	public Integer getContractID() {
		return contractID;
	}

	public void setContractID(Integer contractID) {
		this.contractID = contractID;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
}
