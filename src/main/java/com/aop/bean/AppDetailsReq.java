package com.aop.bean;

public class AppDetailsReq {
	private int reqID;
	private int docID;
	private PatientDetails patient;

	public AppDetailsReq() {
		// TODO Auto-generated constructor stub
	}

	public AppDetailsReq(int reqID, int docID, PatientDetails patient) {
		super();
		this.reqID = reqID;
		this.docID = docID;
		this.patient = patient;
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
		return "AppDetailsReq [reqID=" + reqID + ", docID=" + docID + ", patient=" + patient + "]";
	}

}
