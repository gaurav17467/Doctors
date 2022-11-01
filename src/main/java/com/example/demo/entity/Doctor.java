package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Doctor {
    @Id
    private Long id;
    private String name;
    private String doctorType;
    private String address;
    private String contactNo;

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDoctorType() {
        return doctorType;
    }

    public String getAddress() {
        return address;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDoctorType(String doctorType) {
        this.doctorType = doctorType;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

}
