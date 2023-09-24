package com.publicvote.api.dto;

import java.time.LocalDate;
import java.util.List;

public record PollDTO(String question, LocalDate closeDate, List<String> options) {

}
