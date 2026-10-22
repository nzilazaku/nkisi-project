package com.nkisi.project.nkisi_project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.nkisi.project.nkisi_project.nkisi.Nkisi;
import com.nkisi.project.nkisi_project.nkisi.NkisiDTO;
import com.nkisi.project.nkisi_project.nkisi.ShowNkisiData;
import com.nkisi.project.nkisi_project.repository.NkisiRepository;

@Service
public class NkisiServiceImpl implements NkisiService{
	
	private final NkisiRepository nkisiRepository;
	
	public NkisiServiceImpl(NkisiRepository nkisiRepository) {
		
		this.nkisiRepository = nkisiRepository;
	}

	@Override
	public void createNkisi(NkisiDTO nkisiDTO) {
		
		nkisiRepository.save(new Nkisi(nkisiDTO));
		
	}

	@Override
	public List<ShowNkisiData> showNkisi() {
				
		return nkisiRepository.findAll().stream().map(ShowNkisiData::new).toList();      
			
	}

	@Override
	public Optional<Nkisi> getNkisiById(Long id) {
		
		Optional<Nkisi> nkisiResult = nkisiRepository.findById(id);
		
		return nkisiResult;
		
	}
	
	
}
