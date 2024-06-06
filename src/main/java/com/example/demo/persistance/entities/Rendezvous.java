package com.example.demo.persistance.entities;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Rendezvous implements Serializable { 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idrdv;

    private LocalDateTime dateRDV;
    private LocalDateTime heureRDV;

    @ManyToOne
    private Patient patient;

    @ManyToOne
    private Medecin medecin;

    @OneToOne(mappedBy = "rendezvous", cascade = CascadeType.ALL)
    private Consultation consultation;
    
	public Long getIdrdv() {
		return idrdv;
	}
	public void setIdrdv(Long idrdv) {
		this.idrdv = idrdv;
	}
	public LocalDateTime getDateRDV() {
		return dateRDV;
	}
	public void setDateRDV(LocalDateTime dateRDV) {
		this.dateRDV = dateRDV;
	}
	public LocalDateTime getHeureRDV() {
		return heureRDV;
	}
	public void setHeureRDV(LocalDateTime heureRDV) {
		this.heureRDV = heureRDV;
	}
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	public Medecin getMedecin() {
		return medecin;
	}
	public void setMedecin(Medecin medecin) {
		this.medecin = medecin;
	}
	public Consultation getConsultation() {
		return consultation;
	}
	public void setConsultation(Consultation consultation) {
		this.consultation = consultation;
	}
    
	
    
    
}