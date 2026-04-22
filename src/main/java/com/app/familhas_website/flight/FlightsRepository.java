package com.app.familhas_website.flight;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightsRepository extends JpaRepository<FlightEntity, UUID> {
}
