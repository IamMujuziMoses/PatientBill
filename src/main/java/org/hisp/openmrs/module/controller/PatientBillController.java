package org.hisp.openmrs.module.controller;

import org.hisp.openmrs.module.entity.PatientBill;
import org.hisp.openmrs.module.service.PatientBillService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hisp/openmrs/patient_bill")
public class PatientBillController {

    private PatientBillService patientBillService;

    public PatientBillController(PatientBillService patientBillService) {
        this.patientBillService = patientBillService;
    }

    @GetMapping("/search")
    public ResponseEntity<List<PatientBill>> searchPatientBills(@RequestParam("query") String query) {
        return ResponseEntity.ok(patientBillService.searchPatientBills(query));
    }

    @PostMapping
    public PatientBill createPatientBill(@RequestBody PatientBill patientBill) {
        return patientBillService.createPatientBill(patientBill);
    }
}
