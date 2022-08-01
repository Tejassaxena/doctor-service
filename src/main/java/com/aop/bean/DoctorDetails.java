package com.aop.bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

@Table
@Entity
public class DoctorDetails {
	@Id
	@Column
	public Integer doctorID;
	@Column
	public String doctorName;
	@Column
	public Long doctorContact;
	@Column
	private String role;

	@OneToMany(targetEntity = AppointmentDetails.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true)
	@JoinColumn(name = "app_doc_col", referencedColumnName = "doctorID")
	@OrderColumn(name = "app_lst_index")
	private List<AppointmentDetails> appointmentsList;

	@OneToMany(targetEntity = PatientDetails.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true)
	@JoinColumn(name = "app_doc_col", referencedColumnName = "doctorID")
	@OrderColumn(name = "doc_lst_index")
	private List<PatientDetails> patientList;

	public DoctorDetails() {
	}

	public DoctorDetails(Integer doctorID, String doctorName, Long doctorContact, 
			List<AppointmentDetails> appointmentsList, List<PatientDetails> patientList,String role) {
		super();
		this.doctorID = doctorID;
		this.doctorName = doctorName;
		this.doctorContact = doctorContact;
		this.role = role;
		this.appointmentsList = appointmentsList;
		this.patientList = patientList;
	}






	public String getRole() {
		return role;
	}



	public void setRole(String role) {
		this.role = role;
	}



	public Integer getDoctorID() {
		return doctorID;
	}

	public void setDoctorID(Integer doctorID) {
		this.doctorID = doctorID;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public Long getDoctorContact() {
		return doctorContact;
	}

	public void setDoctorContact(Long doctorContact) {
		this.doctorContact = doctorContact;
	}



	public List<AppointmentDetails> getAppointmentsList() {
		return appointmentsList;
	}



	public void setAppointmentsList(List<AppointmentDetails> appointmentsList) {
		this.appointmentsList = appointmentsList;
	}



	public List<PatientDetails> getPatientList() {
		return patientList;
	}



	public void setPatientList(List<PatientDetails> patientList) {
		this.patientList = patientList;
	}



	@Override
	public String toString() {
		return "DoctorDetails [doctorID=" + doctorID + ", doctorName=" + doctorName + ", doctorContact=" + doctorContact
				+ ", appointmentsList=" + appointmentsList + ", patientList=" + patientList + "]";
	}
	

}