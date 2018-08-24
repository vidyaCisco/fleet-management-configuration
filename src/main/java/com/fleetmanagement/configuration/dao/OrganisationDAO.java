package com.fleetmanagement.configuration.dao;

import com.fleetmanagement.configuration.entity.Organisation;
import org.springframework.stereotype.Repository;

@Repository
public interface OrganisationDAO {

    void create(Organisation organisation);
}
