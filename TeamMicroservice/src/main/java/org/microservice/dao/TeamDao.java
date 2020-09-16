package org.microservice.dao;

import java.util.List;

import org.microservice.domain.Team;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

@RestResource(path="teams", rel="teams")
public interface TeamDao extends CrudRepository<Team, Long> {

	List<Team> findAll();
	Team findByName(String name);
}
