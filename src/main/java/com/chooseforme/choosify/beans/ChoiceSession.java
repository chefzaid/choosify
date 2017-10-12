package com.chooseforme.choosify.beans;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.chooseforme.choosify.beans.enums.DeadlineType;

import lombok.Data;

@Data
@Entity
public class ChoiceSession {

	@OneToMany
	List<Choice> choices;
	Date creationDate;
	Date lastUpdated;
	DeadlineType deadlineType;
	Integer deadlineInterval;
	@ManyToOne
	User publisher;
	@OneToMany
	List<User> contributors;
	@OneToMany
	List<Vote> votes;
}
