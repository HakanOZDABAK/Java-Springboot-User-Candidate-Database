package com.hakanozdabak.KayitSistemi.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.hakanozdabak.KayitSistemi.entities.concretes.Candidate;


public interface CandidateDao extends JpaRepository<Candidate,Integer> {

   Candidate getByCandidateName(String candidatetName);
	

   List <Candidate> getByCandidateNameOrCandidateId(String candidateName,int candidateId);
   
   @Query("From Candidate where candidateId =:candidateId")
   Candidate getByCandidateId(int candidateId);

   @Query("From Candidate where candidateName=:candidateName and candidateId =:candidateId ")
   List<Candidate> getByCandidateNameAndCandidateId(String candidateName,int candidateId);
	
}
