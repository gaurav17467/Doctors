package com.example.demo.controller;

import com.example.demo.entity.Doctor;
import com.example.demo.services.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyController {

    @Autowired
    private DoctorService doctorService;

    @GetMapping("/doctors")
    public List<Doctor> getDoctors()
    {
        return this.doctorService.getDoctors();
    }

    @GetMapping("/doctorsBySearch")
    public List<Doctor> getDoctorsBySearch(@RequestParam("query") String query)
    {
        return this.doctorService.getDoctorsBySearch(query);
    }

}
