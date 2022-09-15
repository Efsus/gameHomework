package gameHomework.Entities;

import java.time.LocalDate;

import gameHomework.Abstract.*;

public class Gamer implements IEntity{
	
	public int id;
	public String firstName;
	public String lastName;
	public LocalDate dateOfBirth;
	public String nationalityId;
	
	public Gamer(int id, String firstName, String lastName, LocalDate dateOfBirth, String nationalityId) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.nationalityId = nationalityId;
	}

	public Gamer(Gamer gamer) {
		
	}

}
