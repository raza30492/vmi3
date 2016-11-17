package com.example.vmi.repository;

import com.example.vmi.entity.StockDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource(path = "stocks")
public interface StockDetailsRepository extends JpaRepository<StockDetails, Long>{
    
}
