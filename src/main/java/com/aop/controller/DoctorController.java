package com.aop.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.aop.bean.AppDetailsReq;
import com.aop.bean.AppDetailsResponse;
import com.aop.bean.AppointmentDetails;
import com.aop.bean.DoctorDetails;
import com.aop.bean.PatientDetails;
import com.aop.service.DoctorService;

@RestController
public class DoctorController {

	@Autowired
	private DoctorService service;

	@GetMapping("/getDoctorDetails")
	public DoctorDetails get() {
		DoctorDetails obj = new DoctorDetails();
		List<AppointmentDetails> apps = Arrays.asList(new AppointmentDetails(10, 20, 30),
				new AppointmentDetails(11, 21, 31), new AppointmentDetails(12, 22, 32));
		List<PatientDetails> pats = Arrays.asList(
				new PatientDetails(23, "patient 1", "address1", 1231231231L, 11, 22, "P"),
				new PatientDetails(24, "patient 2", "address2", 1231231231L, 11, 22, "P"),
				new PatientDetails(25, "patient 3", "address3", 1231231231L, 11, 22, "P"),
				new PatientDetails(26, "patient 4", "address4", 1231231231L, 11, 22, "P"));
		DoctorDetails doctor = new DoctorDetails(11, "Dr.Mohan", 1231231231L, apps, pats, "D");

		return doctor;
	}

	@GetMapping("/getDoctorByID/{doctorID}")
	public DoctorDetails getDoctorByID(@PathVariable Integer doctorID) {
		return service.getDoctorByID(doctorID);
	}

	@PostMapping("/bookAppointmentByDocID")
	public AppDetailsResponse bookAppointmentByDocID(@RequestBody AppDetailsReq appDetails) {
		return service.bookAppointmentByDocID(appDetails);

	}

	@PostMapping("/createDoctor")
	public DoctorDetails CreateDoctor(@RequestBody DoctorDetails doctorDetails) {
		return service.CreateDoctor(doctorDetails);
	}

	@GetMapping("/listOfAppointments/{doctorID}")
	public List<AppointmentDetails> listOfAppointments(@PathVariable("doctorID") Integer id) {
		return service.listOfAppointments(id);
	}

	@PutMapping("/updateDoctor")
	public DoctorDetails updateDoctor(@RequestBody DoctorDetails doctorDetails) {
		return service.updateDoctor(doctorDetails);
	}

	@DeleteMapping("/deleteDoctorByID/{doctorID}")
	public DoctorDetails deleteDoctorByID(Integer doctorID) {
		return service.deleteDoctorByID(doctorID);
	}

	@GetMapping("/getAllDoctor")
	public List<DoctorDetails> getAllDoctor() {
		return service.getAllDoctor();
	}

}
