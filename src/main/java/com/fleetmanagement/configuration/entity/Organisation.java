package com.fleetmanagement.configuration.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Organisation {

    @Id
    @GeneratedValue
    private int orgID;

    private String orgName;

}
