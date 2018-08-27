package com.fleetmanagement.configuration.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name="organisation")
public class Organisation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="orgID", columnDefinition = "Integer(3) default '1'")
    private int orgID;

    private String orgName;

}
