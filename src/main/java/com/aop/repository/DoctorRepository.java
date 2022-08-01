package com.aop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.aop.bean.DoctorDetails;

@Repository
public interface DoctorRepository extends JpaRepository<DoctorDetails, Integer> {
//	@Modifying
//	@Query("update User u set u.firstname = ?1, u.lastname = ?2 where u.id = ?3")
//	void bookAnAppointment(String firstname, String lastname, Integer userId);
}
