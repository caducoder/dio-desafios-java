package com.publicvote.api.model;

import java.time.LocalDate;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "polls")
@Getter @Setter @NoArgsConstructor
public class Poll {
	
	@Id @GeneratedValue(strategy = GenerationType.UUID)
	private UUID id;
	private String question;
	private LocalDate createdAt;
	private LocalDate closeDate;
	private String status;
	private Long totalVotes;
	
}
