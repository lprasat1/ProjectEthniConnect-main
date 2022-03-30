package com.ethniconnect.foodorderingsystem.repository;

import com.ethniconnect.foodorderingsystem.entity.Cuisines;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface CuisineRepository extends JpaRepository<Cuisines,Long> {

public Set<Cuisines> getCuisinesByZipMaster_ZipCode(String zipCode);

}
