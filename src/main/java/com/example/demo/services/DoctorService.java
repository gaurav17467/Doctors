package com.example.demo.services;

import com.example.demo.entity.Doctor;

import java.util.List;

public interface DoctorService {

    public List<Doctor> getDoctors();
    public List<Doctor> getDoctorsBySearch(String query);
}
