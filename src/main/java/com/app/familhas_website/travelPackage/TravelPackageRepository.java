package com.app.familhas_website.travelPackage;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TravelPackageRepository extends JpaRepository<TravelPackageEntity, UUID> {
}
