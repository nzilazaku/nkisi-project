package com.nkisi.project.nkisi_project.service;

import java.util.List;
import java.util.Optional;

import com.nkisi.project.nkisi_project.nkisi.Nkisi;
import com.nkisi.project.nkisi_project.nkisi.NkisiDTO;
import com.nkisi.project.nkisi_project.nkisi.NkisiFieldToChange;
import com.nkisi.project.nkisi_project.nkisi.ShowNkisiData;

public interface NkisiService {
	
	public void createNkisi(NkisiDTO nkisiDTO);
	
	public List<ShowNkisiData> showNkisi();
	
	public Optional<Nkisi> getNkisiById(Long id);	

}
