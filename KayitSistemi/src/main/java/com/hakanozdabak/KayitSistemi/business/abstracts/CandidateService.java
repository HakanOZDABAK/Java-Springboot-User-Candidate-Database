package com.hakanozdabak.KayitSistemi.business.abstracts;

import java.util.List;

import com.hakanozdabak.KayitSistemi.core.utilities.DataResult;
import com.hakanozdabak.KayitSistemi.core.utilities.Result;
import com.hakanozdabak.KayitSistemi.entities.concretes.Candidate;

public interface CandidateService {
  DataResult<Candidate> getByCandidateName(String candidateName);
  DataResult<List<Candidate>>getByCandidateNameOrCandidateId(String candidateName,int candidateId);
  DataResult<List<Candidate>> getByCandidateNameAndCandidateId(String candidateName,int candidateId);
  Result add(Candidate candidate);
  DataResult<List<Candidate>> getAll();

DataResult<Candidate> getByCandidateId(int candidateId);
  
}
