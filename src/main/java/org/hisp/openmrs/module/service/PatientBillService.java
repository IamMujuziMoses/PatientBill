package org.hisp.openmrs.module.service;

import org.hisp.openmrs.module.entity.PatientBill;

import java.util.List;

public interface PatientBillService {

    List<PatientBill> searchPatientBills(String query);

    PatientBill createPatientBill(PatientBill patientBill);
}
