package com.nkisi.project.nkisi_project.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nkisi.project.nkisi_project.nkisi.Nkisi;
import com.nkisi.project.nkisi_project.nkisi.NkisiDTO;
import com.nkisi.project.nkisi_project.nkisi.ShowNkisiData;
import com.nkisi.project.nkisi_project.service.NkisiServiceImpl;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;

@RestController
@RequestMapping("api/v1/zinkisi")
public class NkisiController {
	
	private NkisiServiceImpl nkisiServiceImpl;
	
	public NkisiController(NkisiServiceImpl nkisiServiceImpl) {
		this.nkisiServiceImpl = nkisiServiceImpl;
	}
	
	@PostMapping
	@Transactional
	public void createNkisi(@RequestBody @Valid NkisiDTO nkisi) {

			nkisiServiceImpl.createNkisi(nkisi);
			
		}
	
	@GetMapping
	@Transactional
	public List<ShowNkisiData> showNkisi(){
		
		return nkisiServiceImpl.showNkisi();
	}
	
	@GetMapping("/{id}")
	@Transactional
	public ResponseEntity<Nkisi> getNkisiById(@PathVariable Long id){
		
		Optional<Nkisi> nkisiResult = nkisiServiceImpl.getNkisiById(id);
		
		if(nkisiResult.isPresent()) {
			return new ResponseEntity<Nkisi>(nkisiResult.get(), HttpStatus.OK);
		}else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
	}
		
	}

	