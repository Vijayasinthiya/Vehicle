package com.example.Vehicle.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.Vehicle.Entity.CarEntity;

public interface CarRepository extends JpaRepository<CarEntity, Integer> {

	@Query(value = "select * from car where price>=?", nativeQuery = true)
	public List<CarEntity> getByPrice(int price);

	@Query(value = "select * from car where brand like %?", nativeQuery = true)
	public List<CarEntity> getByLetter(String a);

	@Query(value = "select * from car", nativeQuery = true)
	public List<CarEntity> getCar(List<CarEntity> CarEntity);

	@Query(value = "select * from car where brand like ?", nativeQuery = true)
	public List<CarEntity> getByBrand(String a);
	
	@Query(value="select * from car where colour like ?", nativeQuery=true)
	public List<CarEntity> getByColour(String a);
}
	
