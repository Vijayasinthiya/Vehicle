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

import com.example.Vehicle.Entity.BikeEneity;
import com.example.Vehicle.Service.BikeService;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

@RestController
@RequestMapping(value = "/bike")
public class BikeController {

	@Autowired
	BikeService bikeSer;
	static Logger log = Logger.getLogger(BikeController.class);

	@PostMapping(value = "/insert")
	public String addDetail(@RequestBody BikeEneity b) {
//		PropertyConfigurator.configure("log4j.properties");
//		log.info(bikeSer.addDetail(b));
		return bikeSer.addDetail(b);

	}

	@PostMapping(value = "/insertall")
	public String addList(@RequestBody List<BikeEneity> b) {
		return bikeSer.addList(b);
	}

	@GetMapping(value = "/detail/{n1}")
	public BikeEneity getDetail(@PathVariable int n1) {
		return bikeSer.getDetail(n1);
	}

	@GetMapping(value = "/alldetail")
	public List<BikeEneity> getList() {
		return bikeSer.getList();
	}

	@GetMapping(value = "/remain/{n1}")
	public String detail(@PathVariable int n1) {
		PropertyConfigurator.configure("log4j.Properties");
		log.info(bikeSer.detail(n1));	
		return bikeSer.detail(n1);
	}

	@PutMapping(value = "/update")
	public String updateBike(@RequestBody BikeEneity b) {
//		PropertyConfigurator.configure("log4j.Properties");
//		log.info(bikeSer.updateBike(b));
		return bikeSer.updateBike(b);
	}

}
