package com.example.demo.persistance.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Speciality implements Serializable {

	  @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long specialite_id;

	    private String specialityName;

	    @OneToMany(fetch=FetchType.EAGER)
	    private List<Medecin> medecins;

		public Long getSpecialite_id() {
			return specialite_id;
		}

		public void setSpecialite_id(Long specialite_id) {
			this.specialite_id = specialite_id;
		}

		public String getSpecialityName() {
			return specialityName;
		}

		public void setSpecialityName(String specialityName) {
			this.specialityName = specialityName;
		}

		public List<Medecin> getMedecins() {
			return medecins;
		}

		public void setMedecins(List<Medecin> medecins) {
			this.medecins = medecins;
		}

		



    
}
