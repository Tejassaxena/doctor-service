package com.aop.bean;

public class AppDetailsResponse {
	private int reqID;
	private int docID;
	private PatientDetails patient;
	private String message;

	public AppDetailsResponse() {
		// TODO Auto-generated constructor stub
	}

	

	public AppDetailsResponse(int reqID, int docID, PatientDetails patient, String message) {
		super();
		this.reqID = reqID;
		this.docID = docID;
		this.patient = patient;
		this.message = message;
	}



	public String getMessage() {
		return message;
	}



	public void setMessage(String message) {
		this.message = message;
	}



	public int getReqID() {
		return reqID;
	}

	public void setReqID(int reqID) {
		this.reqID = reqID;
	}

	public int getDocID() {
		return docID;
	}

	public void setDocID(int docID) {
		this.docID = docID;
	}

	public PatientDetails getPatient() {
		return patient;
	}

	public void setPatient(PatientDetails patient) {
		this.patient = patient;
	}

	@Override
	public String toString() {
		return "AppDetailsResponse [reqID=" + reqID + ", docID=" + docID + ", patient=" + patient + ", message="
				+ message + "]";
	}

}
