package com.example.agricultureService.repository;

import com.example.agricultureService.model.CropData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CropDataRepository extends JpaRepository<CropData, Long> {

}
