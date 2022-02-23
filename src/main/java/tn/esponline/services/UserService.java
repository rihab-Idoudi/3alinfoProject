package tn.esponline.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esponline.entities.Personne;
import tn.esponline.repository.PersonneRepository;

@Service

public class UserService implements IUserService {
	
	@Autowired
	PersonneRepository perrep;

	@Override
	public Personne addPersonne(Personne personne) {
		// TODO Auto-generated method stub
		
		return perrep.save(personne);
	}

}
