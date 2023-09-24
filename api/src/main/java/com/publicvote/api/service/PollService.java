package com.publicvote.api.service;

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
		return null;
	}
}
