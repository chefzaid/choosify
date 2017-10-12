package com.chooseforme.choosify.beans;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import com.chooseforme.choosify.beans.enums.Gender;

import lombok.Data;

@Data
@Entity
public class User {

	String firstName;
	String lastName;
	Date birthdate;
	Gender gender;
	String country;
	Date creationDate;
	@OneToMany
	List<ChoiceSession> choiceSessions;
	@OneToMany
	List<Vote> votes;
}
