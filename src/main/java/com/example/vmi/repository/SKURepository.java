package com.example.vmi.repository;

import com.example.vmi.entity.SKU;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource(path = "skus")
public interface SKURepository extends JpaRepository<SKU, Long>{
    
}
