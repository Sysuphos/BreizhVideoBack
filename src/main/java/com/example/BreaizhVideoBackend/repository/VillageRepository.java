package com.example.BreaizhVideoBackend.repository;


import com.example.BreaizhVideoBackend.model.Village;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VillageRepository extends JpaRepository<Village, Long> {

}
