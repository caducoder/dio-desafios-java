package com.publicvote.api.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.publicvote.api.dto.PollDTO;
import com.publicvote.api.model.Poll;
import com.publicvote.api.repository.PollRepository;

@Service
public class PollService {

	@Autowired
	private PollRepository pollRepository;
	
	public Poll savePoll(PollDTO pollDto) {
		Poll poll = new Poll();
		poll.setQuestion(pollDto.question());
		poll.setCreatedAt(LocalDate.now());
		poll.setCloseDate(pollDto.closeDate());
		pollDto.options().forEach(opLabel -> poll.addOption(opLabel));
		System.out.println("Poll service real class: "+ poll);
		return pollRepository.save(poll);
	}
	
	public List<Poll> listAll() {
		return pollRepository.findAll();
	}
}
