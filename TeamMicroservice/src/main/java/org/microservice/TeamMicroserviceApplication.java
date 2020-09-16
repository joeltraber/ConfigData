package org.microservice;

import java.util.HashSet;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.microservice.dao.TeamDao;
import org.microservice.domain.Player;
import org.microservice.domain.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class TeamMicroserviceApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(TeamMicroserviceApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(TeamMicroserviceApplication.class);
	}
	
	
	@PostConstruct
	public void init() {
		Set<Player> players = new HashSet<>();
		players.add(new Player("Charly Brown", "pitcher"));
		players.add(new Player("Snoopy", "shortstop"));
		
		Team team = new Team("California", "Peanuts", players);
		teamdao.save(team);
	}
	
	@Autowired
	TeamDao teamdao;
}
