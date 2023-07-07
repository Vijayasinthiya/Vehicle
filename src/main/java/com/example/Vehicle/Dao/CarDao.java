package com.example.Vehicle.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.Vehicle.Entity.CarEntity;
import com.example.Vehicle.Exception.ColourException;
import com.example.Vehicle.Exception.PriceException;
import com.example.Vehicle.Repository.CarRepository;

@Repository
public class CarDao {
	@Autowired
	CarRepository carRep;

	public String addDetail(CarEntity c) {
		carRep.save(c);
		return "Success";
	}

	public String addList(List<CarEntity> c1) {
		carRep.saveAll(c1);
		return "Success All";
	}

	public CarEntity getDetail(int n1) {
		return carRep.findById(n1).get();
	}

	public String updateCar(CarEntity id) {
		carRep.save(id);
		return "Updated";
	}

	public List<CarEntity> getPrice(int n1) {
		return carRep.getByPrice(n1);

	}
	public List<CarEntity> getLetter(String a) {
		return carRep.getByLetter(a);
}
	public List<CarEntity> getName(String brand){
		return carRep.getByBrand(brand);
	}
	public List<CarEntity> getColour(String a) throws ColourException, Exception{
		return carRep.getByColour(a);
	}
	public String getPriceCar(CarEntity c2) throws PriceException,Exception {
		 carRep.save(c2);
		 return "Success";
	}
	}

