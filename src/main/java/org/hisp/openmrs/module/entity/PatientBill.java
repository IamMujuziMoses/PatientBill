package org.hisp.openmrs.module.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "patient_bill")
public class PatientBill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bill_no;
    private String patient_name;
    private String patient_uuid;
    @CreationTimestamp
    private LocalDateTime start_date;
    @UpdateTimestamp
    private LocalDateTime end_date;
    private String tests_given;
    private String diagnosis;
    private String services_given;
    private String services_rejected;
    private String rejected_reasons;
    private String total_amount;
    private String payment_type;
    private String payment_status;
    @CreationTimestamp
    private LocalDateTime date_created;
    private String created_by;
    @UpdateTimestamp
    private LocalDateTime date_changed;
    private String changed_by;

}
