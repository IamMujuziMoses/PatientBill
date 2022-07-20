package org.hisp.openmrs.module.repository;

import org.hisp.openmrs.module.entity.PatientBill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PatientBillRepository extends JpaRepository<PatientBill, Long> {

    @Query("SELECT p FROM PatientBill p WHERE " +
            "p.bill_no LIKE CONCAT('%',:query, '%')")
    List<PatientBill> searchPatientBills(String query);

//    @Query(value = "SELECT * FROM patient_bill p WHERE " +
//            "p.bill_no LIKE CONCAT('%',:query, '%')", nativeQuery = true)
//    List<PatientBill> searchPatientBills(String query);


}
