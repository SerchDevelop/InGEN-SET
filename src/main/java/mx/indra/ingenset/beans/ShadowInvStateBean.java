package mx.indra.ingenset.beans;

import java.io.Serializable;

public class ShadowInvStateBean implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer shadowInvID;
	private Integer verShadowInv;
	private String codeTYpeState;
	private Integer numberSequential;
	private String codeInvoiceState;
	private String codeStatus;
	private String dateInsert;
	private String dateModif;
	private String codeUser;
	private String process;
	
	public ShadowInvStateBean(){
		
	}

	public Integer getShadowInvID() {
		return shadowInvID;
	}

	public void setShadowInvID(Integer shadowInvID) {
		this.shadowInvID = shadowInvID;
	}

	public Integer getVerShadowInv() {
		return verShadowInv;
	}

	public void setVerShadowInv(Integer verShadowInv) {
		this.verShadowInv = verShadowInv;
	}

	public String getCodeTYpeState() {
		return codeTYpeState;
	}

	public void setCodeTYpeState(String codeTYpeState) {
		this.codeTYpeState = codeTYpeState;
	}

	public Integer getNumberSequential() {
		return numberSequential;
	}

	public void setNumberSequential(Integer numberSequential) {
		this.numberSequential = numberSequential;
	}

	public String getCodeInvoiceState() {
		return codeInvoiceState;
	}

	public void setCodeInvoiceState(String codeInvoiceState) {
		this.codeInvoiceState = codeInvoiceState;
	}

	public String getCodeStatus() {
		return codeStatus;
	}

	public void setCodeStatus(String codeStatus) {
		this.codeStatus = codeStatus;
	}

	public String getDateInsert() {
		return dateInsert;
	}

	public void setDateInsert(String dateInsert) {
		this.dateInsert = dateInsert;
	}

	public String getDateModif() {
		return dateModif;
	}

	public void setDateModif(String dateModif) {
		this.dateModif = dateModif;
	}

	public String getCodeUser() {
		return codeUser;
	}

	public void setCodeUser(String codeUser) {
		this.codeUser = codeUser;
	}

	public String getProcess() {
		return process;
	}

	public void setProcess(String process) {
		this.process = process;
	}

}
