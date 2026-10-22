package com.nkisi.project.nkisi_project.nkisi;

import java.time.LocalDate;

public record ShowNkisiData(Long id, String name, Via via, String lote, int quantity, LocalDate dateValidation) {
	
	public ShowNkisiData(Nkisi nkisi) {
		this(nkisi.getId(), nkisi.getName(), nkisi.getVia(), nkisi.getLote(), nkisi.getQuantity(), nkisi.getDateValidation());
	
	}

}
