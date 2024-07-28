package com.intentwise.restapi.restapi.repository;

import com.intentwise.restapi.restapi.entity.OrganisationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrganisationRepo extends JpaRepository<OrganisationEntity, Long> {
}
