package com.hakanozdabak.KayitSistemi.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "candidates",schema = "kayit")
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","candidates"})

public class Candidate {
    @Id
    @Column(name ="idcandidates")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int candidateId;
    
    @Column(name ="candidate_name")
	private String candidateName;
	
    @Column(name ="candidate_surname")
	private String candidateSurname;
	
    @Column(name ="candidate_city")
	private String candidateCity;
	
    @Column(name ="candidate_sector")
	private String candidateSector;
	
	
}
