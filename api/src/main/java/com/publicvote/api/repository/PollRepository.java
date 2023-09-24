package com.publicvote.api.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.publicvote.api.model.Poll;

@Repository
public interface PollRepository extends JpaRepository<Poll, UUID>{

}
