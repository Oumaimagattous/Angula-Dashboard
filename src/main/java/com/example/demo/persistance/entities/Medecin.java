package com.example.demo.persistance.entities;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Medecin implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private String prenom;
    private String adr;
    private String email;

    @OneToMany(mappedBy = "medecin", cascade = CascadeType.ALL)
    private List<Rendezvous> rendezvousList;

    @OneToOne
    @JoinColumn(name = "specialite_id")
    private Speciality specialities;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getAdr() {
		return adr;
	}

	public void setAdr(String adr) {
		this.adr = adr;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Rendezvous> getRendezvousList() {
		return rendezvousList;
	}

	public void setRendezvousList(List<Rendezvous> rendezvousList) {
		this.rendezvousList = rendezvousList;
	}

	public Speciality getSpecialities() {
		return specialities;
	}

	public void setSpecialities(Speciality specialities) {
		this.specialities = specialities;
	}
    
    


	
    

	
    
}