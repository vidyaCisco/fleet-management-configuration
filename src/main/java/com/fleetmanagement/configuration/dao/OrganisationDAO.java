package com.fleetmanagement.configuration.dao;

import com.fleetmanagement.configuration.entity.Organisation;
import org.springframework.stereotype.Repository;

import org.springframework.data.repository.CrudRepository;

@Repository
public interface OrganisationDAO extends CrudRepository<Organisation, Integer>{

//    void create(Organisation organisation);
}
