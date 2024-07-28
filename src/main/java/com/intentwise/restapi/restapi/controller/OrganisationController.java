package com.intentwise.restapi.restapi.controller;

import com.intentwise.restapi.restapi.entity.OrganisationEntity;
import com.intentwise.restapi.restapi.repository.OrganisationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class OrganisationController {
    @Autowired
    OrganisationRepo organisationRepo;
    //get all organisations
    //localhost:8080/org
    @GetMapping("/org")
    public List<OrganisationEntity>getAllOrganisations(){
        List<OrganisationEntity> organisationEntities = organisationRepo.findAll();

        return organisationEntities;
    }

    //localhost:8080/org/1
    @GetMapping("/org/{id}")
    public OrganisationEntity getOrganistion(@PathVariable Long id){
        OrganisationEntity organisationEntity = organisationRepo.findById(id).get();

        return organisationEntity;
    }




}
