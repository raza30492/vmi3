package com.example.vmi.repository;

import com.example.vmi.entity.Buyer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource(path = "buyers")
public interface BuyerRepository extends JpaRepository<Buyer, Integer>{
    
}
