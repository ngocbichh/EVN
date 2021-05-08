package com.evn.services;

import com.evn.model.Configuration;

import java.util.List;
import java.util.Optional;

public interface ConfigurationService {
    List<Configuration> getAll();
    Configuration save(Configuration configuration);

    Optional<Configuration> getById(String id);
    Optional<Configuration> delete(String id);
}
