package com.example.Vehicle.Repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Vehicle.Entity.BikeEneity;

public interface BikeRepository extends JpaRepository<BikeEneity, Integer> {

}


