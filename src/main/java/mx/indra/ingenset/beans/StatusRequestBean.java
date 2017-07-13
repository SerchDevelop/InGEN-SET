package mx.indra.ingenset.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class StatusRequestBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer contractID;
	private List<String> fechaChange = new ArrayList<String>();
	private String statusToChange;
	private String fechaParam;

	public StatusRequestBean(){
		
	}

	public Integer getContractID() {
		return contractID;
	}

	public void setContractID(Integer contractID) {
		this.contractID = contractID;
	}

	public List<String> getFechaChange() {
		return fechaChange;
	}

	public void setFechaChange(List<String> fechaChange) {
		this.fechaChange = fechaChange;
	}

	public String getStatusToChange() {
		return statusToChange;
	}

	public void setStatusToChange(String statusToChange) {
		this.statusToChange = statusToChange;
	}

	public String getFechaParam() {
		return fechaParam;
	}

	public void setFechaParam(String fechaParam) {
		this.fechaParam = fechaParam;
	}

}
