package com.fleetmanagement.configuration.service;

import com.fleetmanagement.configuration.entity.Organisation;
import com.fleetmanagement.configuration.dao.OrganisationDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrganisationService {

    private OrganisationDAO organisationDAO;

    @Autowired
    public OrganisationService(OrganisationDAO organisationDAO){
        this.organisationDAO = organisationDAO;
    }

    public void createOrganisation(Organisation organisation) {
        //organisationDAO.
    }
}
