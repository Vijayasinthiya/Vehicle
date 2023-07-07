package com.example.Vehicle.Service;

import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Vehicle.Dao.CarDao;
import com.example.Vehicle.Entity.CarEntity;
import com.example.Vehicle.Exception.BrandException;
import com.example.Vehicle.Exception.ColourException;
import com.example.Vehicle.Exception.PriceException;

@Service
public class CarService {
	@Autowired
	CarDao carDao;
	static Logger log=Logger.getLogger(CarService.class);

	public String addDetail(CarEntity c) {
		return carDao.addDetail(c);

	}

	public String addList(List<CarEntity> c1) {
		return carDao.addList(c1);
	}

	public CarEntity getDetail(int n1) {
		return carDao.getDetail(n1);
	}

	public String updateCar(CarEntity id) {
		return carDao.updateCar(id);
	}

	public List<CarEntity> getPrice(int n1) {
		return carDao.getPrice(n1);
	}

	public List<CarEntity> getLetter(String a) {
		return carDao.getLetter(a);
	}

	public List<CarEntity> getName(String brand) throws BrandException, Exception {
		PropertyConfigurator.configure("log4j.properties");
		if (carDao.getName(brand).isEmpty()) {
			log.error(new BrandException("This Brand is not Available here"));
			throw new BrandException("This Brand is not Available here");
		} else {
			return carDao.getName(brand);
		}
	}

	public List<CarEntity> getColour(String a) throws ColourException, Exception {
		if (carDao.getColour(a).isEmpty()) {
			throw new ColourException("Colour not match");
		} else {
			return carDao.getColour(a);
		}
	}
	public String getPriceCar(CarEntity c2) throws PriceException, Exception {
		if(c2.getPrice()>100000 ) {
			throw new PriceException("Price is Low");
		}
			else {
				return carDao.getPriceCar(c2);
		}
		}

}
