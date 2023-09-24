package com.publicvote.api.dto;

import java.time.LocalDate;

public record PollDTO(String question, LocalDate closeDate) {

}
