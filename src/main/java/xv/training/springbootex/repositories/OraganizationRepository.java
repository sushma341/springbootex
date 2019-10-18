package xv.training.springbootex.repositories;

import org.springframework.data.repository.CrudRepository;

import xv.training.springbootex.entities.Organization;

public interface OraganizationRepository extends CrudRepository<Organization, Long> {

}
