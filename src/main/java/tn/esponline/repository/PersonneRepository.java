package tn.esponline.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import tn.esponline.entities.Gender;
import tn.esponline.entities.Personne;

@Repository
public interface PersonneRepository extends CrudRepository<Personne, Integer>{

	@Query("select p from Personne p where p.nom =:x and p.gender =:y")
	public Personne getPersonneBynomAndGender(@Param("x")String nom,@Param("y") Gender gender);

	@Query("select p.nom from Personne p where p.gender= ?1")
	public List<String> getnomPersonne(Gender gender);

}
