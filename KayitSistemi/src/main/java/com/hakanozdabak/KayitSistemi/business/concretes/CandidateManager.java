package com.hakanozdabak.KayitSistemi.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hakanozdabak.KayitSistemi.business.abstracts.CandidateService;
import com.hakanozdabak.KayitSistemi.core.utilities.DataResult;
import com.hakanozdabak.KayitSistemi.core.utilities.Result;
import com.hakanozdabak.KayitSistemi.core.utilities.SuccessDataResult;
import com.hakanozdabak.KayitSistemi.dataAccess.abstracts.CandidateDao;
import com.hakanozdabak.KayitSistemi.entities.concretes.Candidate;



@Service
public class CandidateManager implements CandidateService {

	private CandidateDao candidatesDao;
	
	@Autowired
	public CandidateManager(CandidateDao candidatesDao) {
		super();
		this.candidatesDao = candidatesDao;
	}

	@Override
	public DataResult<Candidate> getByCandidateName(String candidateName) {
		
		return new SuccessDataResult<Candidate>(this.candidatesDao.getByCandidateName(candidateName),"Kişi Listelendi");
	}

	@Override
	public DataResult<List<Candidate>> getByCandidateNameOrCandidateId(String candidateName, int candidateId) {
		return new SuccessDataResult<List<Candidate>>(this.candidatesDao.getByCandidateNameOrCandidateId(candidateName, candidateId),"Kişi Listelendi");
	}

	@Override
	public DataResult<List<Candidate>> getByCandidateNameAndCandidateId(String candidateName, int candidateId) {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<Candidate>>(this.candidatesDao.getByCandidateNameAndCandidateId(candidateName, candidateId),"Kişi Listelendi");
	}

	@Override
	public Result add(Candidate candidate) {
	      this.candidatesDao.save(candidate);		
		return new SuccessDataResult<Candidate>(candidate,"Ürün Eklendi");
	}

	@Override
	public DataResult<List<Candidate>> getAll() {
		
		return new SuccessDataResult<List<Candidate>>
		(this.candidatesDao.findAll(),"Data Listelendi");
				
				
	}

	@Override
	public DataResult<Candidate> getByCandidateId(int candidateId) {
		
		return new SuccessDataResult<Candidate>(this.candidatesDao.getByCandidateId(candidateId), "Data Listelendi");
	}



	
	
}
