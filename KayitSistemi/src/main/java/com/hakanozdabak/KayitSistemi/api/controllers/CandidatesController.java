package com.hakanozdabak.KayitSistemi.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hakanozdabak.KayitSistemi.business.abstracts.CandidateService;
import com.hakanozdabak.KayitSistemi.core.utilities.DataResult;
import com.hakanozdabak.KayitSistemi.core.utilities.Result;
import com.hakanozdabak.KayitSistemi.entities.concretes.Candidate;

@RestController
@RequestMapping(value="/candidates")
@CrossOrigin
public class CandidatesController {

	private CandidateService candidatesService;
	
    @Autowired
	public CandidatesController(CandidateService candidatesService) {
		super();
		this.candidatesService = candidatesService;
	}
    
    
	@GetMapping(value="/getByCandidateName")
	public DataResult<Candidate> getByCandidateName(@RequestParam("candidateName") String candidateName){
		return this.candidatesService.getByCandidateName(candidateName);
		
	}
	
	@PostMapping(value="/add")
	public Result add(@RequestBody Candidate candidates) {
		return this.candidatesService.add(candidates);
		
	}
	
	
	@GetMapping(value="/getByCandidateNameAndCandidateId")
	public DataResult<List<Candidate>> getByCandidateNameAndCandidateId(@RequestParam("candidateName") String candidateName,@RequestParam("candidateId") int candidateId){
		return this.candidatesService.getByCandidateNameAndCandidateId(candidateName, candidateId);
		
	}
	
	
	@GetMapping( value="/getByCandidateNameOrCandidateId")
	public DataResult<List<Candidate>> getByCandidateNameOrCandidateId(@RequestParam String candidateName,@RequestParam int candidateId){
		return this.candidatesService.getByCandidateNameOrCandidateId(candidateName, candidateId);
		
	}
	
	@GetMapping(value="/getAll")
	public DataResult<List<Candidate>> getAll(){
		
		return this.candidatesService.getAll();
	}
	
	@GetMapping(value = "/getByCandidateId")
	public DataResult<Candidate> getByCandidateId(@RequestParam int candidateId){

	return this.candidatesService.getByCandidateId(candidateId);
	}
	
}
