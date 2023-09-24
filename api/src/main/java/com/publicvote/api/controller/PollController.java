package com.publicvote.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.publicvote.api.dto.PollDTO;
import com.publicvote.api.model.Poll;
import com.publicvote.api.service.PollService;

@RestController
@RequestMapping("/polls")
public class PollController {

	@Autowired
	private PollService pollService;
	
	@PostMapping
	public ResponseEntity<Poll> registerPoll(@RequestBody PollDTO pollDto) {
		System.out.println(pollDto);
		return ResponseEntity.ok(pollService.savePoll(pollDto));
	}
	
	@GetMapping
	public ResponseEntity<List<Poll>> listAll() {
		return ResponseEntity.ok(pollService.listAll());
	}
}
