package com.nkisi.project.nkisi_project.nkisi;

import java.time.LocalDate;

import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotBlank;

public record NkisiDTO(
		
		@NotBlank
		String name,
		@Enumerated
		Via via,
		@NotBlank
		String lote,
		int quantity,
		@Future
		LocalDate dateValidation,
		@Enumerated
		Laboratory laboratory) {
	
}
