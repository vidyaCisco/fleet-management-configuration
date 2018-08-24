package com.fleetmanagement.configuration.controller;

import com.fleetmanagement.configuration.entity.Organisation;
import com.fleetmanagement.configuration.service.OrganisationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController()
@RequestMapping("/organisation")
public class OrganisationController {

    private OrganisationService organisationService;

    @Autowired
    public OrganisationController(OrganisationService organisationService) {
        this.organisationService = organisationService;
    }

    @RequestMapping(method = RequestMethod.POST)
    public void createOrganisation(@Valid Organisation organisation){
        organisationService.createOrganisation(organisation);
    }

}
