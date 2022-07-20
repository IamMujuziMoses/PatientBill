package org.hisp.openmrs.module.service.impl;

import org.hisp.openmrs.module.entity.PatientBill;
import org.hisp.openmrs.module.repository.PatientBillRepository;
import org.hisp.openmrs.module.service.PatientBillService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientBillServiceImpl implements PatientBillService{

    private PatientBillRepository patientBillRepository;

    public PatientBillServiceImpl(PatientBillRepository patientBillRepository) {
        this.patientBillRepository = patientBillRepository;
    }

    @Override
    public List<PatientBill> searchPatientBills(String query) {
        List<PatientBill> patientBills = patientBillRepository.searchPatientBills(query);
        return patientBills;
    }

    @Override
    public PatientBill createPatientBill(PatientBill patientBill) {
        return patientBillRepository.save(patientBill);
    }
}
