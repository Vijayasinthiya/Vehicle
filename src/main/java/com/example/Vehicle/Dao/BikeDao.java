package com.example.Vehicle.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.Vehicle.Entity.BikeEneity;
import com.example.Vehicle.Repository.BikeRepository;

@Repository
public class BikeDao {
	@Autowired
	BikeRepository bikeRep;

	public String addDetail(BikeEneity b) {
		bikeRep.save(b);
		return "Success";
	}

	public String addList(List<BikeEneity> b1) {
		bikeRep.saveAll(b1);
		return "Success All";
	}

	public BikeEneity getDetail(int n1) {
		return bikeRep.findById(n1).get();
	}
	public List<BikeEneity> addList() {
		return bikeRep.findAll();
	}

	public String detail(int n1) {
		bikeRep.deleteById(n1);
		return "Success";
	}
	public String updateBike(BikeEneity b) {
		bikeRep.save(b);
		return "Updated";
	}

}


