package com.snapident.sid.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "person")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    // @NotBlank(message = "Full name is required")
    private String fullName;
    @Column(nullable = false)
    private String gender;
    @Column(nullable = false)
    private Integer age;
    @Column(nullable = false)
    private String bloodGroup;
    @Column(nullable = false)
    private String nationality;

    @Column(nullable = false)
    private String phoneNumber;
    @Column(nullable = false)
    private String alternatePhoneNumber;
    @Column(nullable = true)
    private String email;

    @Column(nullable = false)
    private String permanentAddress;
    @Column(nullable = false)
    private String currentAddress;

    @Column(nullable = false)
    private String idProofType;
    @Column(nullable = false)
    private String idProofNumber;

    @Column(nullable = false)
    private String emergencyContactName;
    @Column(nullable = false)
    private String emergencyContactRelation;
    @Column(nullable = false)
    private String emergencyContactNumber;

    @Column(nullable = true)
    private String medicalConditions;
    @Column(nullable = true)
    private String allergies;
    @Column(nullable = true)
    private String currentMedications;

    @Column(nullable = true)
    private String healthInsuranceProvider;
    @Column(nullable = true)
    private String healthInsurancePolicyNumber;

    public Person() {
        // Default constructor is needed for Spring, Thymeleaf, and JPA
    }

    public Person(Long id, String fullName, String gender, Integer age, String bloodGroup, String nationality,
            String phoneNumber, String alternatePhoneNumber, String email, String permanentAddress,
            String currentAddress, String idProofType, String idProofNumber, String emergencyContactName,
            String emergencyContactRelation, String emergencyContactNumber, String medicalConditions, String allergies,
            String currentMedications, String healthInsuranceProvider, String healthInsurancePolicyNumber) {
        this.id = id;
        this.fullName = fullName;
        this.gender = gender;
        this.age = age;
        this.bloodGroup = bloodGroup;
        this.nationality = nationality;
        this.phoneNumber = phoneNumber;
        this.alternatePhoneNumber = alternatePhoneNumber;
        this.email = email;
        this.permanentAddress = permanentAddress;
        this.currentAddress = currentAddress;
        this.idProofType = idProofType;
        this.idProofNumber = idProofNumber;
        this.emergencyContactName = emergencyContactName;
        this.emergencyContactRelation = emergencyContactRelation;
        this.emergencyContactNumber = emergencyContactNumber;
        this.medicalConditions = medicalConditions;
        this.allergies = allergies;
        this.currentMedications = currentMedications;
        this.healthInsuranceProvider = healthInsuranceProvider;
        this.healthInsurancePolicyNumber = healthInsurancePolicyNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAlternatePhoneNumber() {
        return alternatePhoneNumber;
    }

    public void setAlternatePhoneNumber(String alternatePhoneNumber) {
        this.alternatePhoneNumber = alternatePhoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPermanentAddress() {
        return permanentAddress;
    }

    public void setPermanentAddress(String permanentAddress) {
        this.permanentAddress = permanentAddress;
    }

    public String getCurrentAddress() {
        return currentAddress;
    }

    public void setCurrentAddress(String currentAddress) {
        this.currentAddress = currentAddress;
    }

    public String getIdProofType() {
        return idProofType;
    }

    public void setIdProofType(String idProofType) {
        this.idProofType = idProofType;
    }

    public String getIdProofNumber() {
        return idProofNumber;
    }

    public void setIdProofNumber(String idProofNumber) {
        this.idProofNumber = idProofNumber;
    }

    public String getEmergencyContactName() {
        return emergencyContactName;
    }

    public void setEmergencyContactName(String emergencyContactName) {
        this.emergencyContactName = emergencyContactName;
    }

    public String getEmergencyContactRelation() {
        return emergencyContactRelation;
    }

    public void setEmergencyContactRelation(String emergencyContactRelation) {
        this.emergencyContactRelation = emergencyContactRelation;
    }

    public String getEmergencyContactNumber() {
        return emergencyContactNumber;
    }

    public void setEmergencyContactNumber(String emergencyContactNumber) {
        this.emergencyContactNumber = emergencyContactNumber;
    }

    public String getMedicalConditions() {
        return medicalConditions;
    }

    public void setMedicalConditions(String medicalConditions) {
        this.medicalConditions = medicalConditions;
    }

    public String getAllergies() {
        return allergies;
    }

    public void setAllergies(String allergies) {
        this.allergies = allergies;
    }

    public String getCurrentMedications() {
        return currentMedications;
    }

    public void setCurrentMedications(String currentMedications) {
        this.currentMedications = currentMedications;
    }

    public String getHealthInsuranceProvider() {
        return healthInsuranceProvider;
    }

    public void setHealthInsuranceProvider(String healthInsuranceProvider) {
        this.healthInsuranceProvider = healthInsuranceProvider;
    }

    public String getHealthInsurancePolicyNumber() {
        return healthInsurancePolicyNumber;
    }

    public void setHealthInsurancePolicyNumber(String healthInsurancePolicyNumber) {
        this.healthInsurancePolicyNumber = healthInsurancePolicyNumber;
    }

}
