package org.microservice;

import org.microservice.dao.TeamDao;
import org.microservice.domain.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class TeamController {
	
	@Autowired
	TeamDao teamDao;
	
	@RequestMapping("/hi/{name}")
	public Team hiThere(@PathVariable String name) {		
		return teamDao.findByName(name);
	}
	
}
