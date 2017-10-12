package com.chooseforme.choosify.beans;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
@Entity
public class Vote {

	@OneToOne
	User contributor;
	@ManyToOne
	ChoiceSession choiceSession;
	@ManyToOne
	Choice choice;
	String comment;
	Date creationDate;
}
