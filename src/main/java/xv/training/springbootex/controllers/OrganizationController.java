package xv.training.springbootex.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import xv.training.springbootex.entities.Organization;
import xv.training.springbootex.repositories.OraganizationRepository;

@RestController
public class OrganizationController {

	@Autowired
	private OraganizationRepository organizationRepository;
	
	@RequestMapping("/organizations")
	public Iterable<Organization> getOrganizations(){
		return organizationRepository.findAll();

	}
}
