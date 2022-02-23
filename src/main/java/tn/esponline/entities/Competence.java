package tn.esponline.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Competence implements Serializable{
	@Id
	private int id;
	private String nom;
	public Competence() {
		super();
		// TODO Auto-generated constructor stub
	}

}
