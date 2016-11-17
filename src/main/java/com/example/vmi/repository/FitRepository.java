package com.example.vmi.repository;

import com.example.vmi.entity.Fit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource(path = "fits")
public interface FitRepository extends JpaRepository<Fit, Integer>{
    
}
