package com.example.Vehicle.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Vehicle.Entity.CarEntity;
import com.example.Vehicle.Exception.BrandException;
import com.example.Vehicle.Exception.ColourException;
import com.example.Vehicle.Exception.PriceException;
import com.example.Vehicle.Service.CarService;

@RestController
@RequestMapping(value = "/car")
public class CarController {
	@Autowired
	CarService carSer;

	@PostMapping(value = "/insert")
	public String addDetail(@RequestBody CarEntity c) {
		return carSer.addDetail(c);

	}

	@PostMapping(value = "/insertall")
	public String addList(@RequestBody List<CarEntity> c1) {
		return carSer.addList(c1);
	}

	@GetMapping(value = "/detail/{n1}")
	public CarEntity getDetail(@PathVariable int n1) {
		return carSer.getDetail(n1);
	}

	@PutMapping(value = "/update")
	public String updateCar(@RequestBody CarEntity id) {
		return carSer.updateCar(id);
	}

	@GetMapping(value = "/getDetail/{n1}")
	public List<CarEntity> getPrice(@PathVariable int n1) {
		return carSer.getPrice(n1);
	}

	@GetMapping(value = "/getBrand/{a}")
	public List<CarEntity> getLetter(@PathVariable String a) {
		return carSer.getLetter(a);
	}

	@GetMapping(value = "/getBrand1/{brand}")
	public List<CarEntity> getName(@PathVariable String brand) throws BrandException, Exception {
		return carSer.getName(brand);
	}

	@GetMapping(value = "/getColour/{a}")
	public List<CarEntity> getColour(@PathVariable String a) throws ColourException, Exception {
		return carSer.getColour(a);
	}

	@PostMapping(value="/getDetail1") 

	public String getPriceCar(CarEntity c2) throws PriceException, Exception {
		return carSer.getPriceCar(c2);
	}
}
