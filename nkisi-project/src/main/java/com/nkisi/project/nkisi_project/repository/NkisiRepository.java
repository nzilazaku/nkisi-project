package com.nkisi.project.nkisi_project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nkisi.project.nkisi_project.nkisi.Nkisi;

@Repository
public interface NkisiRepository extends JpaRepository<Nkisi, Long>{

}
