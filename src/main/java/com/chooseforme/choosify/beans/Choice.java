package com.chooseforme.choosify.beans;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.chooseforme.choosify.beans.enums.ChoiceType;

import lombok.Data;

@Data
@Entity
public class Choice {
	
	@ManyToOne
	ChoiceSession choiceSession;
	String contextDescription;
	ChoiceType type;
	String data;
	@OneToMany
	List<Vote> votes;
}
