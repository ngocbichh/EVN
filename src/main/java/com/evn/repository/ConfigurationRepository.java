package com.evn.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.evn.model.Configuration;

public interface ConfigurationRepository extends JpaRepository<Configuration, String>{
	public List<Configuration> findAll();
	public Configuration save(Configuration con);
	public void saveAndFlush(Optional<Configuration> con);
}
