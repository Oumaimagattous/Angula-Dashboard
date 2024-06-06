package com.example.demo.persistance.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Consultation implements Serializable {

	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long idcons;

	    private LocalDateTime datecons;
	    private String recapcons;
	    @OneToOne
	    @JoinColumn(name = "rendezvous_id")
	    private Rendezvous rendezvous;

	public Long getIdcons() {
		return idcons;
	}

	public void setIdcons(Long idcons) {
		this.idcons = idcons;
	}

	public LocalDateTime getDatecons() {
		return datecons;
	}

	public void setDatecons(LocalDateTime datecons) {
		this.datecons = datecons;
	}

	public String getRecapcons() {
		return recapcons;
	}

	public void setRecapcons(String recapcons) {
		this.recapcons = recapcons;
	}

	public Rendezvous getRendezvous() {
		return rendezvous;
	}

	public void setRendezvous(Rendezvous rendezvous) {
		this.rendezvous = rendezvous;
	}

    
}
