package com.example.demo.service.controller;

import java.util.List;

import org.apache.el.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.persistance.entities.Medecin;
import com.example.demo.service.interfaces.IMedecin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
//@Controller
@RequestMapping("/api/medecin")
public class MedecinController {

@Autowired
IMedecin medecinservice;

@RequestMapping(method = RequestMethod.POST, consumes="application/json", produces = "application/json")
Medecin save(@RequestBody Medecin medecin) {
 System.out.println("*******save ***********");
 Medecin m=medecinservice.saveMedecin(medecin);
 System.out.println("*******"+m.getEmail());
        return m ;
    }

//////////
/*@PostMapping("/save")
public String savePatient(@ModelAttribute Patient patient) {
   patientservice.savePatient(patient);
   return "redirect:/api/patient/all";
}*/


@GetMapping("/{id}")
Medecin getMedecintById(@PathVariable Long id) {
        return medecinservice.getMedecin(id);
    }

@GetMapping("/quantity")
    int getQuantityMedecin() {
        return medecinservice.getQuantityOfMedecin();
    }

@GetMapping("/medecinByName/{name}")
Medecin getMedecinByName(@PathVariable String name) {
        return medecinservice.findMedecinByName(name);
    }

@DeleteMapping("/delete/{id}")
    boolean delete(@PathVariable Long id) {
medecinservice.deleteMedecin(id);
        return true;
    }

////////
@GetMapping("/all")
    List<Medecin> getAllPatients() {
        return medecinservice.getListMedecin();
    }
   
/*
@GetMapping("/all")
   public String getAllPatients(Model model) {
       List<Patient> patients = patientservice.getListPatient();
       model.addAttribute("patients", patients);
       return "patient";
   }
   */



}
	