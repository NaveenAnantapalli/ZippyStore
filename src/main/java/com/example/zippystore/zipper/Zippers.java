package com.example.zippystore.zipper;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import java.time.LocalDate;
import java.time.Period;

@Entity
@Table(name = "tblZipper")
public class Zippers {

    @Id
    @SequenceGenerator(
            name = "zipper_sequence",
            sequenceName = "zipper_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "zipper_sequence"
    )
    @Column(name = "zipper_id")
    private Long zipperId;

    @Column(name = "zipper_name")
    private String zipperName;

    @Column(name = "zipper_phone_number")
    private Long zipperPhoneNumber;

    @Column(name = "zipper_vehicle_number")
    private String zipperVehicleNumber;

    @Column(name = "zipper_email")
    private String zipperEmail;

    //[Todo-- change the type to multimedia for zipperIdProof]
    @Column(name = "zipper_id_proof")
    private String zipperIdProof;

    @Column(name = "zipper_id_proof_number")
    private String zipperIdProofNumber;

    // The overall average should be calculated and updated here
    @Column(name = "zipper_rating")
    private Float zipperRating;

    @Column(name = "zipper_dob")
    private LocalDate zipperDOB;

    @Transient
    private Integer zipperAge;

    public Zippers() {
    }

    public Zippers(Long zipperId, String zipperName, Long zipperPhoneNumber, String zipperVehicleNumber, String zipperEmail, String zipperIdProof, String zipperIdProofNumber, Float zipperRating, LocalDate zipperDOB) {
        this.zipperId = zipperId;
        this.zipperName = zipperName;
        this.zipperPhoneNumber = zipperPhoneNumber;
        this.zipperVehicleNumber = zipperVehicleNumber;
        this.zipperEmail = zipperEmail;
        this.zipperIdProof = zipperIdProof;
        this.zipperIdProofNumber = zipperIdProofNumber;
        this.zipperRating = zipperRating;
        this.zipperDOB = zipperDOB;
    }

    public Long getZipperId() {
        return zipperId;
    }

    public void setZipperId(Long zipperId) {
        this.zipperId = zipperId;
    }

    public String getZipperName() {
        return zipperName;
    }

    public void setZipperName(String zipperName) {
        this.zipperName = zipperName;
    }

    public Long getZipperPhoneNumber() {
        return zipperPhoneNumber;
    }

    public void setZipperPhoneNumber(Long zipperPhoneNumber) {
        this.zipperPhoneNumber = zipperPhoneNumber;
    }

    public String getZipperVehicleNumber() {
        return zipperVehicleNumber;
    }

    public void setZipperVehicleNumber(String zipperVehicleNumber) {
        this.zipperVehicleNumber = zipperVehicleNumber;
    }

    public String getZipperEmail() {
        return zipperEmail;
    }

    public void setZipperEmail(String zipperEmail) {
        this.zipperEmail = zipperEmail;
    }

    // [todo -- update return type for zipperIdProof]
    public String getZipperIdProof() {
        return zipperIdProof;
    }

    public void setZipperIdProof(String zipperIdProof) {
        this.zipperIdProof = zipperIdProof;
    }

    public String getZipperIdProofNumber() {
        return zipperIdProofNumber;
    }

    public void setZipperIdProofNumber(String zipperIdProofNumber) {
        this.zipperIdProofNumber = zipperIdProofNumber;
    }

    public Float getZipperRating() {
        return zipperRating;
    }

    public void setZipperRating(Float zipperRating) {
        this.zipperRating = zipperRating;
    }

    public LocalDate getZipperDOB() {
        return zipperDOB;
    }

    public void setZipperDOB(LocalDate zipperDOB) {
        this.zipperDOB = zipperDOB;
    }

    public Integer getZipperAge() {
        return Period.between(this.zipperDOB, LocalDate.now()).getYears();
    }

    public void setZipperAge(Integer zipperAge) {
        this.zipperAge = zipperAge;
    }
}
