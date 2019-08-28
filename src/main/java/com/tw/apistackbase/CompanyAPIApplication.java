package com.tw.apistackbase;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

public class CompanyAPIApplication {

	@RestController
	@RequestMapping("/company")
	public class CompanyResource {
	 	List<Company> companys = new ArrayList<Company>(); 

	 	@GetMapping(path = "/")
	 	@ResponseStatus(HttpStatus.OK)
	    public List<Company> getCompanys() {
		 	return companys;
	    }

	 	@PostMapping(path = "/add")
	 	@ResponseStatus(HttpStatus.CREATED)
	 	public Company createCompany(@RequestBody Company company) {
	 		companys.add(company);
	 		return company;
	 	}

	 	@GetMapping(path = "/{id}")
	 	public ResponseEntity<Company> getOneEmployee(@PathVariable String id){


	 		for(Company company: companys) {
	 			if(company.getCompanyId().equals(id)) {
	 				return ResponseEntity.ok(company);
	 			}
	 		}
	 		return new ResponseEntity(HttpStatus.NOT_FOUND);
	 	}
	}
}
