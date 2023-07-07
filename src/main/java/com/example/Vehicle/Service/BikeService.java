package com.example.Vehicle.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Vehicle.Dao.BikeDao;
import com.example.Vehicle.Entity.BikeEneity;

@Service
public class BikeService {
	@Autowired
	BikeDao bikeDao;

	public String addDetail(BikeEneity b) {
		return bikeDao.addDetail(b);

	}

	public String addList(List<BikeEneity> b1) {
		return bikeDao.addList(b1);
	}

	public BikeEneity getDetail(int n1) {
		return bikeDao.getDetail(n1);
	}
	public List<BikeEneity> getList() {
		return bikeDao.addList();
	}

	public String detail(int n1) {
		return bikeDao.detail(n1);
	}
	public String updateBike(BikeEneity b) {
		return bikeDao.updateBike(b);
	}

}


