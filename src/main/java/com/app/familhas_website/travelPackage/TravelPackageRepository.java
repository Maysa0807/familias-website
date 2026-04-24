package com.app.familhas_website.travelpackage;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TravelPackageRepository extends JpaRepository<TravelPackageEntity, UUID> {
}
