package com.publicvote.api.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "polls")
public class Poll {
	
	@Id @GeneratedValue(strategy = GenerationType.UUID)
	private UUID id;
	private String question;
	private LocalDate createdAt;
	private LocalDate closeDate;
	private String status = "OPEN";
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Option> options = new ArrayList<Option>();
	
	public Poll() {
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public LocalDate getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDate createdAt) {
		this.createdAt = createdAt;
	}

	public LocalDate getCloseDate() {
		return closeDate;
	}

	public void setCloseDate(LocalDate closeDate) {
		this.closeDate = closeDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<Option> getOptions() {
		return options;
	}

	public void addOption(String option) {
		Option op = new Option(option);
		this.options.add(op);
	}

	@Override
	public String toString() {
		return "Poll [id=" + id + ", question=" + question + ", createdAt=" + createdAt + ", closeDate=" + closeDate
				+ ", status=" + status + ", options=" + options + "]";
	}

	
}
